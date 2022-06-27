import { TestBed, inject } from '@angular/core/testing';

import { IASaidaService } from './iaSaida.service';

describe('IASaidaService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [IASaidaService]
    });
  });

  it('should be created', inject([IASaidaService], (service: IASaidaService) => {
    expect(service).toBeTruthy();
  }));
});
