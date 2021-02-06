import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PoverenikResenjaComponent } from './poverenik-resenja.component';

describe('PoverenikResenjaComponent', () => {
  let component: PoverenikResenjaComponent;
  let fixture: ComponentFixture<PoverenikResenjaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PoverenikResenjaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PoverenikResenjaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
