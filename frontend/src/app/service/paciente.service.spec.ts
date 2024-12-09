import { TestBed } from '@angular/core/testing';

import { PacienteService } from '../service/paciente.service';

describe('PacienteService', () => {
  let service: PacienteService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PacienteService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
