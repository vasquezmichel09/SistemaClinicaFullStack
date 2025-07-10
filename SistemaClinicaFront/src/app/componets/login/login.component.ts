import { Component } from '@angular/core';
import { AuthService } from '../../service/auth';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  standalone: false
})
export class LoginComponent {
  usuario = '';
  contrasena = '';
  mensaje = '';

  constructor(private authService: AuthService, private router: Router) {}

  loginSubmit() {
  this.authService.login(this.usuario, this.contrasena).subscribe({
    next: (resp) => {
      if (resp.mensaje === 'Login correcto') {
        sessionStorage.setItem('usuario', this.usuario);
        sessionStorage.setItem('nombre', resp.nombre);  // 👈 Guarda el nombre
        this.router.navigate(['/menu']);
      }
    },
    error: (err) => {
      if (err.status === 401) {
        Swal.fire({
          icon: 'error',
          title: 'Credenciales incorrectas',
          text: 'El usuario o la contraseña no son válidos',
        });
      } else {
        Swal.fire({
          icon: 'error',
          title: 'Error del servidor',
          text: 'No se pudo procesar la solicitud',
        });
      }
    }
  });
}
}
