import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddResenjeComponent } from './add-resenje.component';

describe('AddResenjeComponent', () => {
  let component: AddResenjeComponent;
  let fixture: ComponentFixture<AddResenjeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddResenjeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddResenjeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
