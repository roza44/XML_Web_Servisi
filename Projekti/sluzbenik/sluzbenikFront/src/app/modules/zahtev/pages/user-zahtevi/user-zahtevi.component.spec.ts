import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserZahteviComponent } from './user-zahtevi.component';

describe('UserZahteviComponent', () => {
  let component: UserZahteviComponent;
  let fixture: ComponentFixture<UserZahteviComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserZahteviComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UserZahteviComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
