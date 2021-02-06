import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SluzbenikObavestenjaComponent } from './sluzbenik-obavestenja.component';

describe('SluzbenikObavestenjaComponent', () => {
  let component: SluzbenikObavestenjaComponent;
  let fixture: ComponentFixture<SluzbenikObavestenjaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SluzbenikObavestenjaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SluzbenikObavestenjaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
