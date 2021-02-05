import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddZalbaOComponent } from './add-zalba-o.component';

describe('AddZalbaOComponent', () => {
  let component: AddZalbaOComponent;
  let fixture: ComponentFixture<AddZalbaOComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddZalbaOComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddZalbaOComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
