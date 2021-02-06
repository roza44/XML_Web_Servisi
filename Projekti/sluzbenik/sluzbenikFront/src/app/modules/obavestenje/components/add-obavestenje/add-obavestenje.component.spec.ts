import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddObavestenjeComponent } from './add-obavestenje.component';

describe('AddObavestenjeComponent', () => {
  let component: AddObavestenjeComponent;
  let fixture: ComponentFixture<AddObavestenjeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddObavestenjeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddObavestenjeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
