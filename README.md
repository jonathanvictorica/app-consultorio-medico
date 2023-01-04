# ☕🎯 App Consultorio Médico Turnos - JAVA
   
   Este proyecto fue desarrollado como trabajo final de una materia "Desarrollo de Sistemas" de la carrera Técnico en Computación de la Escuela Técnica N°35 "Ing. Eduardo Latzina" , Ciudad de Buenos Aires.
El mismo trata de un sistema de gestión de turnos de un consultorio médico.

## Índice

- [Objetivo](#-objetivo)
- [Ejecutar](#-ejecutar)
- [Documentación Técnica de la Solución](#-documentacin-tcnica-de-la-solucin)
    - [Modelo de Base de Datos](#-modelo-de-base-de-datos)
    - [Diagrama de Clases](#diagrama-de-clases)
    - [Tecnologías](#-tecnologas)
    - [Remasterización](#-remasterizacin)
- [Demo](#-demo)

## 🚀 Objetivo 
    
   El sistema permite gestionar alta, bajas, reprogramaciones y cancelaciones de turnos tanto para visita y estudios médicos. Este sistema ofrece una vista para perfil
Admin, Médico y Recepcionista del consultorio médico. 

## 🚀 Ejecutar

* Si es la primera vez que va a ejecutar el proyecto en su máquina, ejecutar el archivo execute-1-instalacion.sh
* Para inicializar el entorno de datos ejecutar execute-2-configuracion.sh
* Por último, debe ejecutar execute-3-execute.sh

Notas: Recuerde que cada vez que ejecute execute-2-configuracion.sh se pisaran los datos.

## 🚀 Documentación Técnica de la Solución

### Modelo de Base de Datos
En este diagrama se presentan las entidades más relevantes de la base de datos.

![Modelo de Base de Datos](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/der.png)

### Diagrama de Clases
A continuación se presentan los diagramas de clases de los módulos principales

![Diagrama de Clases](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/DC.png)

### Tecnologías

* JDK 17
* Mysql
* Librerias: AbsoluteLayout.jar y EdisoncorSX.jar (para interfaz gráfica desktop)
* Spring Boot 2.7.5
* Maven
* Docker (solamente para la BBDD mysql)

### Remasterización

   Cuando se desarrolló este juego, se usó JDK 1.8. Es por esta razón que decidí actualizarlo para que sea un proyecto spring-boot con maven, y un JDK 17.

Tareas Pendiente: Implementar algún ORM como spring-jpa-data, o spring-mongodb y sacar la lógica implementada en la base de datos a través de procedimientos almacenados.

## 🚀 Demo
* Pantalla de Login <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/1.png)
* Login Exitoso <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/2.png)
* Pantalla principal con todas las opciones del sistema. Se habilitan según el perfil del usuario logeuado. <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/3.png)
* Pantalla de solicitar turno de Visitar Médico de Cabecera <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/4.png)
* Se completan los datos del paciente y el tipo de turno que solicta <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/5.png)
* El sistema muestra la pantalla con el médico de cabecera del paciente <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/6.png)
* El usuario elige fecha de atención <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/7.png)
* El usuario elige el horario de atención <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/8.png)
* Se visualiza el comprobante de turno de la visita de especialista <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/9.png)
* Menú de opciones para autorizar estudios/visitas especialistas que deriva el médico de cabecera <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/10.png)
* Pantalla para autorizar estudios <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/11.png)
* Se elige el paciente y el estudio autorizar <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/12.png)
* Mensaje de confirmación de estudio autorizado <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/13.png)
* Autorizar visita con especialista <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/14.png)
* Se elige el paciente y la especialidad derivada <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/15.png)
* Mensaje de confirmación de visita a especialista autorizada <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/16.png)
* Pantalla para solicitar turno con un especialista <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/17.png)
* Pantalla para elegir fecha, horario y médico de atención <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/18.png)
* Pantalla de confirmación de turno <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/19.png)
* Solicitar turno para realizar estudio <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/20.png)
* Elegir paciente y estudio a realizar <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/21.png)
* Seleccionar fecha y hora de atención del estudio <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/22.png)
* Confirmación de turno para realizar estudio <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/23.png)
* Pantalla para procesar cambio de turno <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/24.png)
* Mensaje de confirmación de cambio de turno <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/25.png)
* Pantalla para procesar atención de turno de realización de estudio <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/26.png)
* Pantalla para procesar atención de turno de médico especialista <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/27.png)
* Pantalla para dar de alta una obra social en el sistema <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/28.png)
* En caso de solicitar turno y el paciente no este registrado en el sistema, se deriva automáticamente a la siguiente pantalla <br />
![Demo](https://github.com/jonathanvictorica/app-consultorio-medico/blob/develop/docs/29.png)