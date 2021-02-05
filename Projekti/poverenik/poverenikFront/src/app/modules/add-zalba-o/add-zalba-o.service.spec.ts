import { TestBed } from '@angular/core/testing';

import { AddZalbaOService } from './add-zalba-o.service';

describe('AddZalbaOService', () => {
  let service: AddZalbaOService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AddZalbaOService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
