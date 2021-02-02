import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  addForm:FormGroup;
  submitted: boolean;

  constructor(
    private formBuilder: FormBuilder
  ) { }

  ngOnInit(): void {
    this.addForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required],
    });
  }

  onSubmit() {
    this.submitted = true;
  }

  get f() { return this.addForm.controls; }

  invalidFormInputs(): boolean {
    if(this.f.username.value === null || this.f.username.value === '') {
      return true;
    }
    if(this.f.password.value === null || this.f.password.value === '') {
      return true;
    }
    return false;
  }

}
