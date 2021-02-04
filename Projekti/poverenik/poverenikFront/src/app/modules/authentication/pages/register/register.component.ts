import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AuthenticationService } from '../../authentication.service';
import { MessageService } from 'primeng/api'
import { JsonXmlService } from 'src/app/shared/services/jsonxml.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  addForm:FormGroup;
  submitted: boolean;

  constructor(
    private formBuilder: FormBuilder,
    private authenticationService: AuthenticationService,
    private messageService: MessageService,
    private jsonxmlService: JsonXmlService
  ) { }

  ngOnInit(): void {
    this.addForm = this.formBuilder.group({
      email: ['', Validators.required],
      password: ['', Validators.required],
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      confirmPassword:  ['', Validators.required]
    });
  }

  onSubmit() {
    this.submitted = true;
    let xmlObj = this.jsonxmlService.json2xml('registerRequest', this.addForm.getRawValue());

    this.authenticationService.register(xmlObj)
    .subscribe(() => {
      this.submitted = false;
      this.messageService.add({ severity: 'success',
                summary: 'Successful registration!',
                detail: `User ${this.f.email.value} successfuly registrated!`});
      this.resetForm();
    });
  }

  get f() { return this.addForm.controls; }

  invalidFormInputs(): boolean {
    if(this.f.email.value === null || this.f.email.value === '') {
      return true;
    }
    if(this.f.password.value === null || this.f.password.value === '') {
      return true;
    }
    if(this.f.firstName.value === null || this.f.firstName.value === '') {
      return true;
    }
    if(this.f.lastName.value === null || this.f.lastName.value === '') {
      return true;
    }
    if(this.f.confirmPassword.value === null 
      || this.f.confirmPassword.value === ''
      || this.f.confirmPassword.value !== this.f.password.value) {
      return true;
    }
    
    return false;
  }

  resetForm() {
    this.addForm.reset();
  }

}
