import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';
import { AuthService } from '../../service/auth';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { DatosPacientes } from '../../datos-pacientes';
import { Datospacienteservice } from '../../service/datospacienteservice';
import { forkJoin } from 'rxjs';
import { Antecedentes } from '../../service/antecedentes';






@Component({
  selector: 'app-historia-clinica',
  standalone: false,
  templateUrl: './historia-clinica.html',
  styleUrl: './historia-clinica.css'
})


export class HistoriaClinica implements OnInit {


  //Datos personales
  nombrePaciente: string = "";
  curp: string = "";
  sexo: string = "";
  edad: string = "";
  fechaNacimiento: string = "";
  domicilio: string = "";
  telefonoCasa: string = "";
  telefonoCelular: string = "";
  religion: string = "";
  ocupacion: string = "";
  escolaridad: string = "";
  estadoCivil: string = "";
  derechohabiente: string = "";
  medicoFamiliar: string = "";
  numeroMedico: string = "";
  ultimaConsulta: string = "";

  //antecedentes
  descripcionAntecedentes: string = '';
  tipoAntecedentes: string = '';
  detalle: string = '';
  respuesta: string = '';

  antecedentesHeredofamiliaresList = [
    { descripcionAntecedentes: '¿Padece alguna enfermedad?', respuesta: '', detalle: '', tipoAntecedentes: 'PATOLOGICOS HEREDOFAMILIARES', curp: '' },
    { descripcionAntecedentes: 'Hipertensión', respuesta: '', detalle: '', tipoAntecedentes: 'PATOLOGICOS HEREDOFAMILIARES', curp: '' },
    { descripcionAntecedentes: 'Diabetes', respuesta: '', detalle: '', tipoAntecedentes: 'PATOLOGICOS HEREDOFAMILIARES', curp: '' },
    { descripcionAntecedentes: 'Hemorragias', respuesta: '', detalle: '', tipoAntecedentes: 'PATOLOGICOS HEREDOFAMILIARES', curp: '' },
    { descripcionAntecedentes: 'Cáncer', respuesta: '', detalle: '', tipoAntecedentes: 'PATOLOGICOS HEREDOFAMILIARES', curp: '' },
    { descripcionAntecedentes: 'Infecciones de transmisión sexual', respuesta: '', detalle: '', tipoAntecedentes: 'PATOLOGICOS HEREDOFAMILIARES', curp: '' },
    { descripcionAntecedentes: 'Cardiopatía', respuesta: '', detalle: '', tipoAntecedentes: 'PATOLOGICOS HEREDOFAMILIARES', curp: '' },
    { descripcionAntecedentes: 'Problemas renales', respuesta: '', detalle: '', tipoAntecedentes: 'PATOLOGICOS HEREDOFAMILIARES', curp: '' },
    { descripcionAntecedentes: 'Problemas pulmonares', respuesta: '', detalle: '', tipoAntecedentes: 'PATOLOGICOS HEREDOFAMILIARES', curp: '' }
  ];

  antecedentesPersonales = [
    { descripcionAntecedentes: '¿Padece alguna enfermedad?', respuesta: '', detalle: '', tipoAntecedentes: 'PERSONALES PATOLOGICOS', curp: '' },
    { descripcionAntecedentes: 'Hipertensión', respuesta: '', detalle: '', tipoAntecedentes: 'PERSONALES PATOLOGICOS', curp: '' },
    { descripcionAntecedentes: 'Diabetes', respuesta: '', detalle: '', tipoAntecedentes: 'PERSONALES PATOLOGICOS', curp: '' },
    { descripcionAntecedentes: 'Hemorragias', respuesta: '', detalle: '', tipoAntecedentes: 'PERSONALES PATOLOGICOS', curp: '' },
    { descripcionAntecedentes: 'Cáncer', respuesta: '', detalle: '', tipoAntecedentes: 'PERSONALES PATOLOGICOS', curp: '' },
    { descripcionAntecedentes: 'Infecciones de transmisión sexual', respuesta: '', detalle: '', tipoAntecedentes: 'PERSONALES PATOLOGICOS', curp: '' },
    { descripcionAntecedentes: 'Cardiopatía', respuesta: '', detalle: '', tipoAntecedentes: 'PERSONALES PATOLOGICOS', curp: '' },
    { descripcionAntecedentes: 'Problemas renales', respuesta: '', detalle: '', tipoAntecedentes: 'PERSONALES PATOLOGICOS', curp: '' },
    { descripcionAntecedentes: 'Problemas pulmonares', respuesta: '', detalle: '', tipoAntecedentes: 'PERSONALES PATOLOGICOS', curp: '' }
  ];

  datosEditados = true;
  nombreUsuarioLogueado: string = '';
  DatosPacientes: any;

  ngOnInit(): void {

    this.nombreUsuarioLogueado = sessionStorage.getItem('nombre') || 'Usuario';

  }



  constructor(
    private authService: AuthService,
    private router: Router,
    private datosService: Datospacienteservice,
    private antecedentesService: Antecedentes

  ) { }

  addDatosPaciente() {
    Swal.fire({
      title: '¿Estás seguro?',
      text: 'Revise que todos los datos personales sean correctos.',
      icon: 'question',
      showCancelButton: true,
      confirmButtonText: 'Sí, guardar',
      cancelButtonText: 'Cancelar'
    }).then((result) => {
      if (result.isConfirmed) {
        let datospaciente = new DatosPacientes(
          this.nombrePaciente,
          this.curp,
          this.sexo,
          this.edad,
          this.fechaNacimiento,
          this.domicilio,
          this.telefonoCasa,
          this.telefonoCelular,
          this.religion,
          this.ocupacion,
          this.escolaridad,
          this.estadoCivil,
          this.derechohabiente,
          this.medicoFamiliar,
          this.numeroMedico,
          this.ultimaConsulta
        );

        console.log(datospaciente);

        this.datosService.createDatosPaciente(datospaciente).subscribe({
          next: (res) => {
            Swal.fire({
              title: '¡Guardado!',
              text: 'Los datos del paciente fueron guardados exitosamente, puedes continuar a la siguiente sección',
              icon: 'success',
              confirmButtonText: 'OK'
            });
          },
          error: (err) => {
            console.error(err);

            {
              Swal.fire({
                title: 'Error',
                text: 'Ocurrió un error al guardar el paciente.',
                icon: 'error',
                confirmButtonText: 'OK'
              });
            }
          }
        });
      }
    });
  }

  addAntecedentesPersonales() {
    if (!this.curp || this.curp.trim() === '') {
      Swal.fire('Error', 'No se ha especificado la CURP del paciente.', 'error');
      return;
    }

    // Validar que todas las respuestas estén completas
    const descripcionesFaltantes = this.antecedentesPersonales.filter(
      (antecedente) => !antecedente.respuesta || antecedente.respuesta.trim() === ''
    );

    if (descripcionesFaltantes.length > 0) {
      const listaDescripciones = descripcionesFaltantes
        .map((a) => `- ${a.descripcionAntecedentes}`)
        .join('\n');

      Swal.fire({
        title: 'Faltan datos',
        text: `Debes completar todas las respuestas antes de guardar:\n${listaDescripciones}`,
        icon: 'error',
        confirmButtonText: 'OK'
      });
      return;
    }

    Swal.fire({
      title: '¿Estás seguro?',
      text: 'Se guardarán los antecedentes personales del paciente.',
      icon: 'question',
      showCancelButton: true,
      confirmButtonText: 'Sí, guardar',
      cancelButtonText: 'Cancelar'
    }).then((result) => {
      if (result.isConfirmed) {
        const peticiones = this.antecedentesPersonales.map((antecedente) => {
          return this.antecedentesService.createAntecedentesHeredofamiliares({
            ...antecedente,
            curp: this.curp
          });
        });

        forkJoin(peticiones).subscribe({
          next: () => {
            Swal.fire({
              title: '¡Guardado!',
              text: 'Todos los antecedentes personales fueron guardados exitosamente.',
              icon: 'success',
              confirmButtonText: 'OK'
            });
          },
          error: (err) => {
            console.error(err);
            Swal.fire({
              title: 'Error',
              text: 'Ocurrió un error al guardar uno o más antecedentes.',
              icon: 'error',
              confirmButtonText: 'OK'
            });
          }
        });
      }
    });
  }


  addAntecedentesHeredofamiliares() {
    if (!this.curp || this.curp.trim() === '') {
      Swal.fire('Error', 'No se ha especificado la CURP del paciente.', 'error');
      return;
    }

    Swal.fire({
      title: '¿Estás seguro?',
      text: 'Se guardarán los antecedentes heredofamiliares del paciente.',
      icon: 'question',
      showCancelButton: true,
      confirmButtonText: 'Sí, guardar',
      cancelButtonText: 'Cancelar'
    }).then((result) => {
      if (result.isConfirmed) {
        const peticiones = this.antecedentesHeredofamiliaresList.map((antecedente) => {
          return this.antecedentesService.createAntecedentesHeredofamiliares({
            ...antecedente,
            curp: this.curp
          });
        });

        forkJoin(peticiones).subscribe({
          next: () => {
            Swal.fire({
              title: '¡Guardado!',
              text: 'Todos los antecedentes heredofamiliares fueron guardados exitosamente.',
              icon: 'success',
              confirmButtonText: 'OK'
            });
          },
          error: (err) => {
            console.error(err);
            Swal.fire({
              title: 'Error',
              text: 'Ocurrió un error al guardar uno o más antecedentes.',
              icon: 'error',
              confirmButtonText: 'OK'
            });
          }
        });
      }
    });
  }





  puedeSalir(): Promise<boolean> {
    if (!this.datosEditados) {
      return Promise.resolve(true);
    }

    return Swal.fire({
      title: '¿Estás seguro?',
      text: 'Si regresas al menú, podrías perder tus avances actuales.',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#d33',
      cancelButtonColor: '#3085d6',
      confirmButtonText: 'Sí, volver',
      cancelButtonText: 'Cancelar'
    }).then((result) => result.isConfirmed);
  }

  logout(): void {
    Swal.fire({
      title: '¿Cerrar sesión?',
      text: 'Tu sesión se cerrará y volverás al inicio de sesión.',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: 'Sí, cerrar sesión',
      cancelButtonText: 'Cancelar',
      confirmButtonColor: '#d33',
      cancelButtonColor: '#3085d6'
    }).then((result) => {
      if (result.isConfirmed) {
        this.authService.logout().subscribe({
          next: () => {
            sessionStorage.removeItem('usuario');
            this.router.navigate(['/']);
          },
          error: () => {
            sessionStorage.removeItem('usuario');
            this.router.navigate(['/']);
          }
        });
      }
    });
  }

  volverAlMenu() {
    this.router.navigate(['menu']);
  }

  resetForm(): void {
    this.nombrePaciente = "";
    this.curp = "";
    this.sexo = "";
    this.edad = "";
    this.fechaNacimiento = "";
    this.domicilio = "";
    this.telefonoCasa = "";
    this.telefonoCelular = "";
    this.religion = "";
    this.ocupacion = "";
    this.escolaridad = "";
    this.estadoCivil = "";
    this.derechohabiente = "";
    this.medicoFamiliar = "";
    this.numeroMedico = "";
    this.ultimaConsulta = "";
  }

}
