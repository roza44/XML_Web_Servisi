import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MessageService } from 'primeng/api';
import { JsonXmlService } from 'src/app/shared/services/jsonxml.service';
import { AuthenticationService } from '../../authentication.service';
import { LoginDTO } from '../../model';

@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.scss']
})
export class LogInComponent implements OnInit {

  addForm: FormGroup;
  submitted: boolean;

  constructor(
    private formBuilder: FormBuilder,
    private authenticationService: AuthenticationService,
    private jsonxmlService: JsonXmlService,
    private messageService: MessageService
  ) { }

  ngOnInit(): void {
    this.addForm = this.formBuilder.group({
      email: ['', Validators.required],
      password: ['', Validators.required],
    });
  }

  onSubmit() {
    this.submitted = true;

    let xml = this.jsonxmlService.json2xml('loginRequest', this.addForm.getRawValue());

    this.authenticationService.login(xml)
      .subscribe((response) => {
        this.login(response);
      });
  }

  login(response: string) {
    this.submitted = false;
    let userInfo: LoginDTO = this.jsonxmlService.xml2json(response);
    this.authenticationService.changeCurrentUser(userInfo);
    this.messageService.add({
      severity: 'success',
      summary: 'Successful log in!',
      detail: `User ${this.f.email.value} successfuly logged in!`
    });
    this.resetForm();
  }

  get f() { return this.addForm.controls; }

  invalidFormInputs(): boolean {
    if (this.f.email.value === null || this.f.email.value === '') {
      return true;
    }
    if (this.f.password.value === null || this.f.password.value === '') {
      return true;
    }
    return false;
  }

  resetForm() {
    this.addForm.reset();
  }

}
