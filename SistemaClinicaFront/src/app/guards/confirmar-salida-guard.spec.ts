import { TestBed } from '@angular/core/testing';
import { CanDeactivateFn } from '@angular/router';

import { confirmarSalidaGuard } from './confirmar-salida-guard';

describe('confirmarSalidaGuard', () => {
  const executeGuard: CanDeactivateFn<unknown> = (...guardParameters) => 
      TestBed.runInInjectionContext(() => confirmarSalidaGuard(...guardParameters));

  beforeEach(() => {
    TestBed.configureTestingModule({});
  });

  it('should be created', () => {
    expect(executeGuard).toBeTruthy();
  });
});
