import { TestBed } from '@angular/core/testing';

import { ZalbaCService } from './zalba-c.service';

describe('ZalbaCService', () => {
  let service: ZalbaCService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ZalbaCService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
