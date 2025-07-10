import { Injectable } from '@angular/core';
import { CanDeactivate } from '@angular/router';
import { Observable } from 'rxjs';
import Swal from 'sweetalert2';

export interface PuedeSalir {
  puedeSalir: () => Observable<boolean> | Promise<boolean> | boolean;
}

@Injectable({
  providedIn: 'root'
})
export class ConfirmarSalidaGuard implements CanDeactivate<PuedeSalir> {
  canDeactivate(component: PuedeSalir): Observable<boolean> | Promise<boolean> | boolean {
    if (component.puedeSalir) {
      return component.puedeSalir();
    }

    // Si no implementa puedeSalir, permitir salir
    return true;
  }
}
