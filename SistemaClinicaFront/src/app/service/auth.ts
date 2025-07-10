import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private apiUrl = 'http://localhost:8080/api/auth';

  constructor(private http: HttpClient) { }


login(usuario: string, contrasena: string) {
  return this.http.post<{ mensaje: string, nombre: string }>(
    'http://localhost:8080/api/auth/login',
    { usuario, contrasena },
    { withCredentials: true }
  );
}



  logout() {
    return this.http.get(`${this.apiUrl}/logout`, {
      responseType: 'text',
      withCredentials: true
    });
  }
}