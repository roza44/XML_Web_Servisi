import { TestBed } from '@angular/core/testing';

import { JsonXmlService } from './jsonxml.service';

describe('Json2xmlService', () => {
  let service: JsonXmlService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(JsonXmlService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
