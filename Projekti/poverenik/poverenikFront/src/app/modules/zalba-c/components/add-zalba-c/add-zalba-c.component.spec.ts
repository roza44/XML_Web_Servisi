import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddZalbaCComponent } from './add-zalba-c.component';

describe('AddZalbaCComponent', () => {
  let component: AddZalbaCComponent;
  let fixture: ComponentFixture<AddZalbaCComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddZalbaCComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddZalbaCComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
