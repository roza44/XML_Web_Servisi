import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserObavestenjaComponent } from './user-obavestenja.component';

describe('UserObavestenjaComponent', () => {
  let component: UserObavestenjaComponent;
  let fixture: ComponentFixture<UserObavestenjaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserObavestenjaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UserObavestenjaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
