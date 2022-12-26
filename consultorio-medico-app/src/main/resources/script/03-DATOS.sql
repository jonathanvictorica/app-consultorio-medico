--
-- Volcado de datos para la tabla `especialidad`
--


INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(2, 'Alergologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(3, 'Cardiologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(1, 'Dermatologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(5, 'Endocrinologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(4, 'Gastroenterologa');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(6, 'Geriatria');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(7, 'Infectologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(24, 'Medico');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(8, 'Neumologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(9, 'Neurologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(10, 'Nutriologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(11, 'Odontologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(12, 'Oftalmologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(13, 'Oncologia medica');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(14, 'Oncologia radioterapica');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(15, 'Otorrinolaringologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(16, 'Pediatria');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(17, 'Proctologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(18, 'Psiquiatria');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(19, 'Rehabilitacion');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(20, 'Reumatologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(22, 'Toxicologia');
INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(21, 'Traumatologia');

INSERT INTO `especialidad` (`codigoespecialidad`, `nombreespecialidad`) VALUES(23, 'Urologia');

--
-- Volcado de datos para la tabla `estadocivil`
--

INSERT INTO `estadocivil` (`codigoestadocivil`, `estado`) VALUES(2, 'Casado');
INSERT INTO `estadocivil` (`codigoestadocivil`, `estado`) VALUES(5, 'Concubino');
INSERT INTO `estadocivil` (`codigoestadocivil`, `estado`) VALUES(4, 'Separado');
INSERT INTO `estadocivil` (`codigoestadocivil`, `estado`) VALUES(1, 'Soltero');
INSERT INTO `estadocivil` (`codigoestadocivil`, `estado`) VALUES(3, 'Viudo');



INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(5, 'Analisis de Hematocritos');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(8, 'Analisis de HPV');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(7, 'Analisis de Orina');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(6, 'Analisis de Sangre');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(9, 'Analisis HIV');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(4, 'Colonoscopia');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(11, 'Dialisis');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(13, 'Encefalograma');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(3, 'Ergonomia');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(14, 'Hepatograma');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(2, 'Holter');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(15, 'Medici?n de Glucosa');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(10, 'Papanicolao');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(16, 'Pielografia');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(1, 'Radiografia');
INSERT INTO `estudio` (`codigoestudio`, `nombre`) VALUES(12, 'Resonancia Magnetica');

--
-- Volcado de datos para la tabla `estudioterciarizado`
--

INSERT INTO `estudioterciarizado` (`codigoestudio`, `codigoestablecimiento`, `abreviatura`, `costoobrasocial`, `costoparticular`) VALUES(1, 1, 'Rad', 40, 130);
INSERT INTO `estudioterciarizado` (`codigoestudio`, `codigoestablecimiento`, `abreviatura`, `costoobrasocial`, `costoparticular`) VALUES(16, 1, 'Pielografia', 170, 400);

--
-- Volcado de datos para la tabla `gruposanguineo`
--

INSERT INTO `gruposanguineo` (`codigogruposanguineo`, `tipo`) VALUES(1, 'A+');
INSERT INTO `gruposanguineo` (`codigogruposanguineo`, `tipo`) VALUES(2, 'A-');
INSERT INTO `gruposanguineo` (`codigogruposanguineo`, `tipo`) VALUES(8, 'AB+');
INSERT INTO `gruposanguineo` (`codigogruposanguineo`, `tipo`) VALUES(7, 'AB-');
INSERT INTO `gruposanguineo` (`codigogruposanguineo`, `tipo`) VALUES(4, 'B+');
INSERT INTO `gruposanguineo` (`codigogruposanguineo`, `tipo`) VALUES(3, 'B-');
INSERT INTO `gruposanguineo` (`codigogruposanguineo`, `tipo`) VALUES(9, 'HH+');
INSERT INTO `gruposanguineo` (`codigogruposanguineo`, `tipo`) VALUES(10, 'HH-');
INSERT INTO `gruposanguineo` (`codigogruposanguineo`, `tipo`) VALUES(5, 'O+');
INSERT INTO `gruposanguineo` (`codigogruposanguineo`, `tipo`) VALUES(6, 'O-');


--
-- Volcado de datos para la tabla `localidad`
--

INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(35, '9 de Abril');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(33, 'Luis Guillan');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(34, 'Monte Grande');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(47, 'Aeropuerto Internacional Ezeiza');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(37, 'Arroyo de la Cruz');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(23, 'Bel?n de Escobar?');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(13, 'Berazategui Oeste?');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(52, 'Bosques');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(38, 'Capilla del Senor ');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(9, 'Barrio Norte');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(61, 'Capital Federal');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(48, 'Carlos Spegazzini');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(14, 'Carlos Tomas Sourigues');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(5, 'Caseros');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(15, 'Centro Agricola El Pato');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(39, 'Diego Gaynor');

INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(24, 'El Cazador');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(32, 'El Jaguel');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(43, 'El Remanso - Barrio Los Pinos?');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(22, 'Escobar');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(53, 'Estanislao Severo Zeballos?');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(31, 'Esteban Echeverr?a');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(46, 'Ezeiza');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(51, 'Florencio Varela ');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(25, 'Gar?n?');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(54, 'Gobernador Julio A. Costa?');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(16, 'Guillermo E. Hudson?');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(55, 'Ingeniero Juan Allan?');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(26, 'Ingeniero Maschwitz?');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(49, 'Jose Maria Ezeiza');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(10, 'Jose de Los Andes');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(11, 'joSE DEL VALLE');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(12, 'Jose Del Monte');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(4, 'Jose Ingenieros');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(17, 'Juan Maria Gutierrez');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(60, 'La Capilla');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(27, 'Loma Verde');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(40, 'Los Cardales');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(29, 'Maquinista F. Savio Este');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(28, 'Matheu?');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(41, 'Parada Orlando');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(42, 'Parada Robles - Pav?n');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(44, 'Parada Robles?');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(45, 'Pavon');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(18, 'Pereyra?');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(19, 'Platanos');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(30, 'Puerto Paran');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(20, 'Ranelagh');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(1, 'San Fernando');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(3, 'San Isidro');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(6, 'San Miguel');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(2, 'San Vicente');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(50, 'Triston Suarez');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(56, 'Villa Brown');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(21, 'Villa Espara');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(57, 'Villa San Luis');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(58, 'Villa Santa Rosa');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(59, 'Villa Vatteone');
INSERT INTO `localidad` (`codigolocalidad`, `nombrelocalidad`) VALUES(36, 'Zona Aeropuerto Internacional Ezeiza');



--
-- Volcado de datos para la tabla `medico`
--

INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(1, 'Roberto', 'Massaro', '12345543', 3);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(2, 'Nicolas', 'Lavaglea', '12344354', 12);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(3, 'Juan', 'Del Valle', '34567867', 1);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(4, 'Pablo', 'del Vino', '34567890', 2);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(5, 'Daniel', 'Selalla', '34567913', 3);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(6, 'Rodrigo', 'Alalibar', '34567936', 4);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(7, 'Sebastian', 'Alser', '34567959', 5);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(8, 'Ram?n', 'Centurion', '34567982', 6);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(9, 'Jesica', 'Buroni', '34568005', 7);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(10, 'Lautaro', 'Sabin', '34568028', 8);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(11, 'Agustin', 'Robertus', '34568051', 9);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(12, 'Sebastian', 'Albus', '34568074', 10);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(13, 'Camila', 'Serpiente', '34568097', 11);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(14, 'Manuela', 'Del Monte', '34568120', 12);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(15, 'Manuel', 'Del Pino', '34568143', 13);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(16, 'Maria', 'Del Valle', '34568166', 14);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(17, 'Rosario', 'del Vino', '34568189', 15);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(18, 'Santiago', 'Selalla', '34568212', 16);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(19, 'Daniela', 'Alalibar', '34568235', 17);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(20, 'Alison', 'Alser', '34568258', 18);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(21, 'Jonas', 'Centurion', '34568281', 19);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(22, 'Pedro', 'Buroni', '34568304', 20);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(23, 'Pablo', 'Sabin', '34568327', 21);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(24, 'Francisco', 'Robertus', '34568350', 22);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(25, 'Martin', 'Albus', '34568373', 24);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(26, 'Jonathan', 'Serpiente', '34568396', 24);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(27, 'Guillermo', 'Del Monte', '34568419', 24);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(28, 'Exequiel', 'Martinez', '34568442', 24);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(29, 'Ezequiel', 'Rodriguez', '34568465', 24);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(30, 'Maria del Rosario', 'Roberfino', '34568488', 24);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(31, 'Maria del Carmen', 'Ramus', '34568511', 24);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(32, 'Maria de los Angeles', 'Remus', '34568534', 24);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(33, 'Maria de los Dolores', 'Rimton', '34568557', 24);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(34, 'Maria de la Torre', 'Selvina', '34568580', 24);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(35, 'Catalina', 'Espejo', '34568603', 24);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(36, 'ultimo', 'ultimo', 'ultimo', 25);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(37, '1232', '22', '2222', 26);
INSERT INTO `medico` (`codigomedico`, `nombre`, `apellido`, `numeromatricula`, `codigoespecialidad`) VALUES(38, '33', '33', '33', 27);



--
-- Volcado de datos para la tabla `medicohorario`
--

INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(1, 'Jueves', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(1, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(1, 'Lunes', '18:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(1, 'Martes', '18:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(1, 'Miercoles', '18:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(2, 'Lunes', '10:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(3, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(3, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(3, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(3, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(3, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(4, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(4, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(4, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(4, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(5, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(5, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(5, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(5, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(6, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(6, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(7, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(7, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(7, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(7, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(7, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(8, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(8, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(8, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(8, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(8, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(9, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(9, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(9, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(9, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(9, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(10, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(10, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(10, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(10, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(10, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(11, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(11, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(11, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(11, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(11, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(12, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(12, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(12, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(12, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(12, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(13, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(13, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(13, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(13, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(13, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(14, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(14, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(14, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(14, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(14, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(15, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(15, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(15, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(15, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(15, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(16, 'Jueves', '07:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(16, 'Lunes', '13:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(16, 'Martes', '18:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(16, 'Miercoles', '13:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(16, 'Viernes', '15:00:00', '20:30:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(17, 'Jueves', '07:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(17, 'Lunes', '13:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(17, 'Martes', '18:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(17, 'Miercoles', '13:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(18, 'Jueves', '07:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(18, 'Lunes', '13:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(18, 'Martes', '18:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(18, 'Miercoles', '13:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(18, 'Viernes', '15:00:00', '20:30:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(19, 'Jueves', '07:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(19, 'Lunes', '13:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(19, 'Martes', '18:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(19, 'Miercoles', '13:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(19, 'Viernes', '15:00:00', '20:30:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(20, 'Jueves', '07:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(20, 'Lunes', '13:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(20, 'Martes', '18:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(20, 'Miercoles', '13:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(20, 'Viernes', '15:00:00', '20:30:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(21, 'Jueves', '07:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(21, 'Lunes', '13:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(21, 'Martes', '18:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(21, 'Miercoles', '13:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(21, 'Viernes', '15:00:00', '20:30:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(22, 'Jueves', '07:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(22, 'Lunes', '13:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(22, 'Martes', '18:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(22, 'Miercoles', '13:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(22, 'Viernes', '15:00:00', '20:30:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(23, 'Jueves', '07:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(23, 'Lunes', '13:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(23, 'Martes', '18:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(23, 'Miercoles', '13:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(23, 'Viernes', '15:00:00', '20:30:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(24, 'Jueves', '07:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(24, 'Lunes', '13:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(24, 'Martes', '18:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(24, 'Miercoles', '13:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(24, 'Viernes', '15:00:00', '20:30:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(25, 'Jueves', '07:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(25, 'Lunes', '13:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(25, 'Martes', '18:00:00', '21:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(25, 'Miercoles', '13:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(25, 'Viernes', '15:00:00', '20:30:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(26, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(26, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(26, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(26, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(26, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(27, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(27, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(27, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(27, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(27, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(28, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(28, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(28, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(28, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(28, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(29, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(29, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(29, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(29, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(29, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(30, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(30, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(30, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(30, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(30, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(31, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(31, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(31, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(31, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(31, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(32, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(32, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(32, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(32, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(32, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(33, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(33, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(33, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(33, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(33, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(34, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(34, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(34, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(34, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(34, 'Viernes', '11:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(35, 'Jueves', '14:00:00', '20:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(35, 'Lunes', '08:00:00', '15:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(35, 'Martes', '08:00:00', '18:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(35, 'Miercoles', '07:00:00', '12:00:00');
INSERT INTO `medicohorario` (`codigomedico`, `dia`, `horainicial`, `horafinal`) VALUES(35, 'Viernes', '11:00:00', '15:00:00');



--
-- Volcado de datos para la tabla `obrasocial`
--

INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(1, 'OBRA SOCIAL DE ACTORES', 1, 1, 'AYACUCHO ', '1700', '4566555', '1702');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(60, 'OBRA SOCIAL DE TECNICOS DE VUELO DE LINEAS AEREAS', 1, 2, 'VICTOR HUGO ', '1880', '4567853', '1703');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(61, 'OBRA SOCIAL DEL PERSONAL SUPERIOR Y PROFESIONAL DE EMPRESAS AEROCOMERCIALES', 1, 3, '?INDEPENDENCIA  ', '1200', '4569151', '1704');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(62, 'OBRA SOCIAL DEL PERSONAL AERONAUTICO', 1, 4, 'ANCHORENA ', '1300', '4570449', '1705');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(63, 'OBRA SOCIAL DEL PERSONAL DE AERONAVEGACI ON DE ENTES PRIVADOS', 1, 5, 'VENEZUELA ', '1400', '4571747', '1706');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(64, 'OBRA SOCIAL DEL PERSONAL TECNICO AERONAUTICO', 1, 1, '?D ONOFRIO ', '1500', '4573045', '1707');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(65, 'OBRA SOCIAL DE AERONAVEGANTES', 1, 2, 'BARTOLOME MITRE ', '1600', '4574343', '1708');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(66, 'OBRA SOCIAL EMPLEADOS DE AGENCIAS DE INFORMES', 1, 3, 'LAVALLE ', '2400', '4575641', '1709');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(67, 'OBRA SOCIAL DEL PERSONAL DE AGUAS GASEOSAS Y AFINES', 1, 4, 'BACACAY', '5000', '4576939', '1710');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(68, 'OBRA SOCIAL DE ALFAJOREROS, REPOSTEROS, PIZZEROS Y HELADEROS', 1, 5, '?AV. LURO ', '4500', '4578237', '1711');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(69, 'OBRA SOCIAL DEL PERSONAL DE LA INDUSTRIA DE LA ALIMENTACION', 1, 4, 'VENEZUELA ', '6700', '4579535', '1712');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(70, 'OBRA SOCIAL DEL PERSONAL DEL AUTOMOVIL CLUB ARGENTINO', 1, 3, 'ANCHORENA ', '400', '4580833', '1713');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(71, 'OBRA SOCIAL DEL PERSONAL DEL AZUCAR DEL INGENIO LA ESPERANZA', 1, 2, '?SERAPIO SORIA ', '4005', '4582131', '1714');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(72, 'OBRA SOCIAL DEL PERSONAL DEL AZUCAR DEL INGENIO LEDESMA', 1, 2, 'JUJUY ', '3440', '4583429', '1715');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(73, 'OBRA SOCIAL DEL PERSONAL DEL AZUCAR DEL INGENIO SAN MARTIN', 1, 3, 'ISLAS MALVINAS ', '234', '4584727', '1716');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(74, 'OBRA SOCIAL DEL PERSONAL DE LA INDUSTRIA AZUCARERA', 1, 4, 'CONGRESO ', '2355', '4586025', '1717');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(75, 'OBRA SOCIAL DEL PERSONAL DE BARRACAS DE LANAS, CUEROS Y ANEXOS', 1, 5, 'FLORENTINO AMEGHINO ', '5432', '4587323', '1718');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(76, 'OBRA SOCIAL DEL PERSONAL DE LA INDUSTRIA BOTONERA', 1, 1, 'CALLE 91', '4325', '4588621', '1719');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(77, 'OBRA SOCIAL DEL PERSONAL DE LA INDUSTRIA DEL CALZADO', 1, 1, 'YATAY ', '6546', '4589919', '1720');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(78, 'OBRA SOCIAL DE CONDUCTORES CAMIONEROS Y PERSONAL DEL TRANSPORTE AUTOMOTOR DE CARGAS', 1, 1, 'AV. CASEROS ', '5241', '4591217', '1721');
INSERT INTO `obrasocial` (`codigoobrasocial`, `nombreobrasocial`, `activo`, `codigolocalidad`, `direccion`, `altura`, `telefono`, `codigopostal`) VALUES(79, 'Obra Social San Francisco', 1, 3, 'San Francisco de Asis', '1234', '43434343', '1243');

-- --------------------------------------------------------

--
-- Volcado de datos para la tabla `observacionobrasocial`
--

INSERT INTO `observacionobrasocial` (`codigoobrasocial`, `numeroobservacion`, `tipoobservacion`) VALUES(79, 1, 'Es la mejor obra social.');

--
-- Volcado de datos para la tabla `ordenesmedico`
--

INSERT INTO `ordenesmedico` (`codigoorden`, `codigopaciente`, `fechaorden`) VALUES(0, 12, '2014-11-16');
INSERT INTO `ordenesmedico` (`codigoorden`, `codigopaciente`, `fechaorden`) VALUES(4, 12, '2014-11-16');
INSERT INTO `ordenesmedico` (`codigoorden`, `codigopaciente`, `fechaorden`) VALUES(5, 12, '2014-11-16');
INSERT INTO `ordenesmedico` (`codigoorden`, `codigopaciente`, `fechaorden`) VALUES(6, 12, '2014-11-16');
INSERT INTO `ordenesmedico` (`codigoorden`, `codigopaciente`, `fechaorden`) VALUES(7, 12, '2014-11-16');
INSERT INTO `ordenesmedico` (`codigoorden`, `codigopaciente`, `fechaorden`) VALUES(8, 78, '2014-11-17');
--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(12, 'Jonathan', 'Victorica', '1995-04-03', '43544343', 1, 'martin195187@hotmail.com', 4, '1234', 'Fray Cayetano Rodriguez', '2614', 1, '39408235', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(19, 'Juan', 'Selmo', '2013-06-11', '45768754', 1, 'MARTIN', 9, '1234', 'nose', 'ne', 2, '39408236', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(20, 'Jonathan', 'Crescente', '2014-11-02', '48394032', 1, 'jojojo', 10, '1234', 'Ejercito', '12342', 2, '1111', 1);

INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(22, 'Jonathan', 'Martinez', '3897-01-12', '2432423', 1, 'MARTIN', 11, '1243', 'VALLE', '1234', 2, '12213321', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(23, 'Joue', 'jue', '3899-01-12', '312432123', 1, 'martin2', 12, '1234', 'efefe', '2134', 2, '213', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(24, 'Maria Cristina ', 'Cardoso', '3888-01-12', '34524234', 1, 'mariacris@hotmail.com', 4, '2134', 'NOSE', '1234', 2, '16036692', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(25, 'EDGARDO', 'Gonzalez', '1980-12-13', '47890419', 1, 'EDGARDOGonzalez@hotmail.com.ar', 1, '1450', '27 de Febrero', '1200', 1, '28980990', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(26, 'EDITH', 'Rodriguez', '1980-12-14', '47891342', 2, 'EDITHRodriguez@hotmail.com.ar', 2, '1480', '9 de Julio', '1234', 2, '28983304', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(27, 'EDMUNDO', 'Fernandez', '1980-12-15', '47892265', 3, 'EDMUNDOFernandez@hotmail.com.ar', 3, '1510', 'Ach?val Rodriguez', '1268', 3, '28985618', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(28, 'EDUARDO', 'Diaz', '1980-12-16', '47893188', 4, 'EDUARDODiaz@hotmail.com.ar', 4, '1540', 'Acoyte', '1302', 4, '28987932', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(29, 'EFRA?N', 'Perez', '1980-12-17', '47894111', 5, 'EFRA?NPerez@hotmail.com.ar', 5, '1570', 'Albarellos', '1336', 5, '28990246', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(30, 'EFR?N', 'Gomez', '1980-12-18', '47895034', 6, 'EFR?NGomez@hotmail.com.ar', 6, '1600', 'Alberdi, Juan Bautista', '1370', 1, '28992560', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(32, 'ELEONOR', 'Sosa', '1980-12-20', '47896880', 8, 'ELEONORSosa@hotmail.com.ar', 8, '1660', 'Almafuerte', '1438', 3, '28997188', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(33, 'ELIAS', 'Quiroga', '1980-12-21', '47897803', 9, 'EL?ASQuiroga@hotmail.com.ar', 9, '1690', '?lvarez, Teniente General Donato', '1472', 4, '28999502', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(34, 'ELISA', 'Martinez', '1980-12-22', '47898726', 10, 'ELISAMartinez@hotmail.com.ar', 10, '1720', '?lvarez Jonte', '1506', 5, '29001816', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(35, 'ELISABETH', 'Gomez', '1980-12-23', '47899649', 1, 'ELISABETHGomez@hotmail.com.ar', 11, '1750', '?lvarez Thomas', '1540', 1, '29004130', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(36, 'ELOISA', 'Gonzalez', '1980-12-24', '47900572', 2, 'ELOISAGonzalez@hotmail.com.ar', 12, '1780', 'Alvear', '1574', 2, '29006444', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(37, 'ELOY', 'Diaz', '1980-12-25', '47901495', 3, 'ELOYDiaz@hotmail.com.ar', 13, '1810', 'Alcorta, Amancio', '1608', 3, '29008758', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(38, 'ELSA', 'Fernandez', '1980-12-26', '47902418', 4, 'ELSAFernandez@hotmail.com.ar', 14, '1840', 'Ant?rtida Argentina', '1642', 4, '29011072', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(39, 'ELVIRA', 'Lopez', '1980-12-27', '47903341', 5, 'ELVIRALopez@hotmail.com.ar', 15, '1870', 'Aranguren, Juan Felipe', '1676', 5, '29013386', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(40, 'EMILIA', 'Rodriguez', '1980-12-28', '47904264', 6, 'EMILIARodriguez@hotmail.com.ar', 16, '1900', 'Argentina', '1710', 1, '29015700', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(41, 'EMILIO', 'Romero', '1980-12-29', '47905187', 7, 'EMILIORomero@hotmail.com.ar', 17, '1930', 'Asamblea', '1744', 2, '29018014', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(42, 'EMA', 'S?nchez', '1980-12-30', '47906110', 8, 'EMAS?nchez@hotmail.com.ar', 18, '1960', 'Asturias', '1778', 3, '29020328', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(43, 'EMANUEL', 'Ruiz', '1980-12-31', '47907033', 9, 'EMANUELRuiz@hotmail.com.ar', 19, '1990', 'Avellaneda', '1812', 4, '29022642', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(44, 'EMILIO', 'Perez', '1980-12-13', '47907956', 10, 'EMILIOPerez@hotmail.com.ar', 20, '2020', 'Bacacay', '1846', 5, '29024956', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(45, 'ENCARNACI', 'Gonzalez', '1980-12-14', '47908879', 1, 'ENCARNACI?NGonzalez@hotmail.com.ar', 21, '2050', 'Balb?n, Ricardo', '1880', 1, '29027270', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(46, 'ENGRACIA', 'Gomez', '1980-12-15', '47909802', 2, 'ENGRACIAGomez@hotmail.com.ar', 22, '2080', 'Belgrano', '1914', 2, '29029584', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(47, 'ENRIQUE', 'Rodriguez', '1980-12-16', '47910725', 3, 'ENRIQUERodriguez@hotmail.com.ar', 23, '2110', 'Beir?, Francisco', '1948', 3, '29031898', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(48, 'ERASMO', 'Fernandez', '1980-12-17', '47911648', 4, 'ERASMOFernandez@hotmail.com.ar', 24, '2140', 'Berro, Adolfo', '1982', 4, '29034212', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(49, 'ERICO', 'Martinez', '1980-12-18', '47912571', 5, 'ERICOMartinez@hotmail.com.ar', 25, '2170', 'Bilbao, Francisco', '2016', 5, '29036526', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(50, 'ERIC', 'Romero', '1980-12-19', '47913494', 6, 'ERICRomero@hotmail.com.ar', 26, '2200', 'Boedo', '2050', 1, '29038840', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(51, 'ERICA', 'Ben?tez', '1980-12-20', '47914417', 7, 'ERICABen?tez@hotmail.com.ar', 27, '2230', 'Bonorino, Coronel Esteban', '2084', 2, '29041154', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(52, 'ERNESTO', 'Lopez', '1980-12-21', '47915340', 8, 'ERNESTOLopez@hotmail.com.ar', 28, '2260', 'Boyac?', '2118', 3, '29043468', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(53, 'ESMERALDA', 'Ram?rez', '1980-12-22', '47916263', 9, 'ESMERALDARam?rez@hotmail.com.ar', 29, '2290', 'Brasil', '2152', 4, '29045782', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(54, 'ESPERANZA', 'Silva', '1980-12-23', '47917186', 10, 'ESPERANZASilva@hotmail.com.ar', 30, '2320', 'Cabildo', '2186', 5, '29048096', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(55, 'ESTEBAN', 'Diaz', '1980-12-24', '47918109', 1, 'ESTEBANDiaz@hotmail.com.ar', 31, '2350', 'Calabria', '2220', 1, '29050410', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(56, 'ESTEFAN?A', 'Gonzalez', '1980-12-25', '47919032', 2, 'ESTEFAN?AGonzalez@hotmail.com.ar', 32, '2380', 'Callao', '2254', 2, '29052724', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(57, 'ESTELA', 'Rodriguez', '1980-12-26', '47919955', 3, 'ESTELARodriguez@hotmail.com.ar', 33, '2410', 'Campos, Luis Mar?a', '2288', 3, '29055038', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(58, 'ESTER', 'Lopez', '1980-12-27', '47920878', 4, 'ESTERLopez@hotmail.com.ar', 34, '2440', 'del Corro, Can?nigo Miguel', '2322', 4, '29057352', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(59, 'ETEL', 'Gomez', '1980-12-28', '47921801', 5, 'ETELGomez@hotmail.com.ar', 35, '2470', 'Carabobo', '2356', 5, '29059666', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(60, 'EUCLIDES', 'Flores', '1980-12-29', '47922724', 6, 'EUCLIDESFlores@hotmail.com.ar', 36, '2500', 'Carrasco', '2390', 1, '29061980', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(61, 'EUDOSIA', 'Romero', '1980-12-30', '47923647', 7, 'EUDOSIARomero@hotmail.com.ar', 37, '2530', 'Carril, Salvador Mar?a del', '2424', 2, '29064294', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(62, 'EUDOXIO', 'Martinez', '1980-12-31', '47924570', 8, 'EUDOXIOMartinez@hotmail.com.ar', 38, '2560', 'Casares', '2458', 3, '29066608', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(63, 'EUFEMIO', 'Cruz', '1980-12-04', '47925493', 9, 'EUFEMIOCruz@hotmail.com.ar', 39, '2590', 'Caseros', '2492', 4, '29068922', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(64, 'EUFEMIA', 'Fernandez', '1980-12-05', '47926416', 10, 'EUFEMIAFernandez@hotmail.com.ar', 40, '2620', 'Casta?ares', '2526', 5, '29071236', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(65, 'EUFRASIO', 'Gonzalez', '1980-12-06', '47927339', 1, 'EUFRASIOGonzalez@hotmail.com.ar', 41, '2650', 'Castillo, Ram?n', '2560', 1, '29073550', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(66, 'EUFRASIA', 'Rodriguez', '1980-12-07', '47928262', 2, 'EUFRASIARodriguez@hotmail.com.ar', 42, '2680', 'Castro, Emilio', '2594', 2, '29075864', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(67, 'EUGENIO', 'Fernandez', '1980-12-08', '47929185', 3, 'EUGENIOFernandez@hotmail.com.ar', 43, '2710', 'Chiclana', '2628', 3, '29078178', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(68, 'EUGENIA', 'Gomez', '1980-12-09', '47930108', 4, 'EUGENIAGomez@hotmail.com.ar', 44, '2740', 'Campos, Luis Mar?a', '2662', 4, '29080492', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(69, 'EULALIO', 'Lopez', '1980-12-10', '47931031', 5, 'EULALIOLopez@hotmail.com.ar', 45, '2770', 'del Corro, Can?nigo Miguel', '2696', 5, '29082806', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(70, 'EULALIA', 'Martinez', '1980-12-11', '47931954', 6, 'EULALIAMartinez@hotmail.com.ar', 46, '2800', 'Carabobo', '2730', 1, '29085120', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(71, 'EUSEBIO', 'Garc?a', '1980-12-12', '47932877', 7, 'EUSEBIOGarc?a@hotmail.com.ar', 47, '2830', 'Carrasco', '2764', 2, '29087434', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(72, 'EUSTAQUIO', 'Diaz', '1980-12-13', '47933800', 8, 'EUSTAQUIODiaz@hotmail.com.ar', 48, '2860', 'Carril, Salvador Mar?a del', '2798', 3, '29089748', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(73, 'EVA', 'Perez', '1980-12-14', '47934723', 9, 'EVAPerez@hotmail.com.ar', 49, '2890', 'Casares', '2832', 4, '29092062', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(74, 'EVANGELINA', 'S?nchez', '1980-12-15', '47935646', 10, 'EVANGELINAS?nchez@hotmail.com.ar', 50, '2920', 'Caseros', '2866', 5, '29094376', 0);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(75, 'EVARISTO', 'Gonzalez', '1980-12-16', '47936569', 1, 'EVARISTOGonzalez@hotmail.com.ar', 51, '2950', 'Casta?ares', '2900', 1, '29096690', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(76, 'EZEQUIEL', 'Rodriguez', '1980-12-17', '47937492', 2, 'EZEQUIELRodriguez@hotmail.com.ar', 52, '2980', 'Castillo, Ram?n', '2934', 2, '29099004', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(77, 'Marcos', 'Salguero', '3871-01-12', '47687657', 1, 'MarcosSalguero@hotmail.com', 3, '1234', 'Avenida del Trabajo', '1234', 2, '4000000', 1);
INSERT INTO `paciente` (`CodigoPaciente`, `Nombre`, `Apellido`, `FechaNacimiento`, `telefono`, `Codigogruposanguineo`, `mail`, `codigolocalidad`, `codigopostal`, `direccion`, `altura`, `codigoestadocivil`, `Dni`, `sexo`) VALUES(78, 'Sandra Viviana', 'Daujan', '3860-09-25', '45647583', 8, 'Alumnos35@gmail.com', 61, '1234', 'Avenida de Los Incas', '3452', 1, '20394567', 0);



--
-- Volcado de datos para la tabla `pacientemedicocabecera`
--

INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(12, 1, '2014-11-04');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(20, 1, '2014-11-06');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(21, 1, '2014-11-06');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(22, 1, '2014-11-06');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(23, 1, '2014-11-06');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(24, 1, '2014-11-07');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(19, 2, '2014-11-04');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(12, 25, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(42, 25, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(57, 25, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(65, 25, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(69, 25, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(19, 26, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(30, 26, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(52, 26, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(67, 26, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(75, 26, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(20, 27, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(26, 27, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(28, 27, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(40, 27, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(62, 27, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(21, 28, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(36, 28, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(38, 28, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(50, 28, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(72, 28, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(22, 29, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(33, 29, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(46, 29, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(48, 29, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(60, 29, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(23, 30, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(43, 30, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(56, 30, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(58, 30, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(70, 30, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(24, 31, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(41, 31, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(53, 31, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(66, 31, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(68, 31, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(78, 31, '2014-11-16');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(25, 32, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(29, 32, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(51, 32, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(54, 32, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(63, 32, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(76, 32, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(27, 33, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(35, 33, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(39, 33, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(61, 33, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(64, 33, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(73, 33, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(34, 34, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(37, 34, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(45, 34, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(49, 34, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(71, 34, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(74, 34, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(32, 35, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(44, 35, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(47, 35, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(55, 35, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(59, 35, '2014-11-13');
INSERT INTO `pacientemedicocabecera` (`codigopaciente`, `codigomedico`, `fechaactualizacion`) VALUES(77, 35, '2014-11-15');


--
-- Volcado de datos para la tabla `pacienteobrasocial`
--

INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(12, 1, '12312', '2014-11-19');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(12, 1, '1234232', '2020-12-12');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(19, 1, '1234', '2015-05-14');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(19, 64, '1231890', '2020-12-13');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(20, 1, '12343222', '2014-11-30');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(20, 76, '1229548', '2020-12-14');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(21, 1, '12343222', '2014-11-30');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(21, 77, '1227206', '2020-12-15');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(22, 1, '1234124', '3931-01-12');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(22, 78, '1224864', '2020-12-16');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(23, 1, '123124', '3940-01-12');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(23, 60, '1222522', '2020-12-17');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(24, 1, '12314134124', '3935-01-12');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(24, 65, '1220180', '2020-12-18');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(25, 71, '1217838', '2020-12-19');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(26, 62, '1203786', '2020-12-25');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(27, 75, '1189734', '2020-12-31');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(28, 78, '1178024', '2015-03-05');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(29, 61, '1166314', '2015-03-10');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(30, 67, '1154604', '2015-03-15');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(32, 77, '1133526', '2015-03-24');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(33, 72, '1121816', '2015-03-29');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(34, 62, '1110106', '2016-09-03');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(35, 72, '1215496', '2020-12-20');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(36, 67, '1201444', '2020-12-26');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(37, 1, '1187392', '2015-03-01');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(38, 60, '1175682', '2015-03-06');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(39, 66, '1163972', '2015-03-11');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(40, 69, '1152262', '2015-03-16');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(41, 75, '1142894', '2015-03-20');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(42, 78, '1131184', '2015-03-25');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(43, 61, '1119474', '2015-03-30');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(44, 67, '1107764', '2016-09-04');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(45, 61, '1213154', '2020-12-21');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(46, 69, '1199102', '2020-12-27');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(47, 64, '1185050', '2015-03-02');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(48, 65, '1173340', '2015-03-07');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(49, 70, '1161630', '2015-03-12');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(50, 74, '1149920', '2015-03-17');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(51, 1, '1140552', '2015-03-21');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(52, 60, '1128842', '2015-03-26');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(53, 66, '1117132', '2015-03-31');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(54, 69, '1105422', '2016-09-05');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(55, 66, '1210812', '2020-12-22');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(56, 74, '1196760', '2020-12-28');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(57, 76, '1182708', '2015-03-03');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(58, 71, '1170998', '2015-03-08');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(59, 73, '1159288', '2015-03-13');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(60, 63, '1147578', '2015-03-18');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(61, 64, '1138210', '2015-03-22');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(62, 65, '1126500', '2015-03-27');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(63, 70, '1114790', '2016-09-01');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(64, 74, '1103080', '2016-09-06');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(65, 70, '1208470', '2020-12-23');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(66, 63, '1194418', '2020-12-29');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(67, 77, '1180366', '2015-03-04');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(68, 72, '1168656', '2015-03-09');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(69, 62, '1156946', '2015-03-14');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(70, 68, '1145236', '2015-03-19');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(71, 76, '1135868', '2015-03-23');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(72, 71, '1124158', '2015-03-28');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(73, 73, '1112448', '2016-09-02');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(74, 63, '1100738', '2016-09-07');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(75, 73, '1206128', '2020-12-24');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(76, 68, '1192076', '2020-12-30');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(77, 79, '12345', '3921-01-12');
INSERT INTO `pacienteobrasocial` (`codigopaciente`, `codigoobrasocial`, `numeroafiliado`, `fechavencimiento`) VALUES(78, 1, '12443324', '3921-01-20');


--
-- Volcado de datos para la tabla `realizarestudio`
--

INSERT INTO `realizarestudio` (`codigoorden`, `codigoestudio`, `turnosolicitado`) VALUES(0, 1, 0);
INSERT INTO `realizarestudio` (`codigoorden`, `codigoestudio`, `turnosolicitado`) VALUES(4, 1, 0);
INSERT INTO `realizarestudio` (`codigoorden`, `codigoestudio`, `turnosolicitado`) VALUES(5, 1, 0);
INSERT INTO `realizarestudio` (`codigoorden`, `codigoestudio`, `turnosolicitado`) VALUES(6, 1, 0);
INSERT INTO `realizarestudio` (`codigoorden`, `codigoestudio`, `turnosolicitado`) VALUES(7, 1, 0);
INSERT INTO `realizarestudio` (`codigoorden`, `codigoestudio`, `turnosolicitado`) VALUES(8, 1, 1);


--
-- Volcado de datos para la tabla `talonretiroestudio`
--

INSERT INTO `talonretiroestudio` (`codigoturno`, `codigoestudio`, `fecharetiro`, `estudioretirado`) VALUES(54, 7, '3914-12-24', 0);
INSERT INTO `talonretiroestudio` (`codigoturno`, `codigoestudio`, `fecharetiro`, `estudioretirado`) VALUES(81, 1, '3914-12-19', 0);
INSERT INTO `talonretiroestudio` (`codigoturno`, `codigoestudio`, `fecharetiro`, `estudioretirado`) VALUES(82, 5, '3914-12-19', 0);
INSERT INTO `talonretiroestudio` (`codigoturno`, `codigoestudio`, `fecharetiro`, `estudioretirado`) VALUES(83, 7, '3914-01-19', 0);
INSERT INTO `talonretiroestudio` (`codigoturno`, `codigoestudio`, `fecharetiro`, `estudioretirado`) VALUES(85, 3, '3915-01-22', 0);

--
-- Volcado de datos para la tabla `turno`
--

INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(14, 12, '2014-11-10', '10:00:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(15, 19, '2014-11-07', '07:00:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(16, 19, '2014-11-10', '07:10:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(19, 12, '2014-11-10', '08:45:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(23, 12, '2014-11-10', '07:00:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(24, 12, '2014-11-11', '07:00:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(25, 12, '2014-11-10', '07:30:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(26, 12, '2014-11-11', '07:10:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(27, 12, '2014-11-11', '07:20:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(28, 12, '2014-11-11', '07:30:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(30, 12, '2014-11-10', '07:10:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(31, 12, '2014-11-10', '07:20:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(32, 12, '2014-11-10', '08:15:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(33, 12, '2014-11-13', '08:00:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(34, 12, '2014-11-28', '09:00:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(35, 12, '2014-11-28', '09:00:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(36, 12, '2014-11-28', '09:15:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(37, 12, '2014-11-28', '09:15:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(38, 12, '2014-11-28', '09:15:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(39, 12, '2014-11-28', '09:15:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(40, 19, '2014-11-28', '09:15:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(42, 24, '2014-11-24', '20:45:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(43, 12, '2014-11-10', '18:10:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(44, 12, '2014-11-10', '18:10:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(45, 12, '2014-11-10', '18:10:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(46, 12, '2014-11-10', '18:10:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(47, 12, '2014-11-10', '18:10:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(48, 12, '2014-11-10', '18:10:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(49, 12, '2014-11-10', '09:00:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(50, 12, '2014-11-13', '08:15:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(51, 32, '2014-11-17', '08:15:00', 0);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(52, 32, '2014-11-17', '08:30:00', 0);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(53, 32, '2014-11-20', '14:00:00', 0);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(54, 32, '2014-11-18', '07:00:00', 0);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(69, 32, '2014-12-16', '08:00:00', 0);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(71, 32, '2014-12-16', '11:45:00', 0);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(74, 32, '2014-11-21', '07:00:00', 0);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(75, 77, '2014-11-17', '08:30:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(77, 77, '2014-11-20', '14:15:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(78, 12, '2014-11-18', '18:00:00', 1);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(81, 12, '2014-11-18', '07:00:00', 0);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(82, 12, '2014-11-18', '07:10:00', 0);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(83, 12, '2014-11-18', '07:10:00', 0);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(84, 78, '2014-11-18', '18:15:00', 0);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(85, 78, '2014-11-18', '07:30:00', 0);
INSERT INTO `turno` (`codigoturno`, `codigopaciente`, `fechaturno`, `horaturno`, `activo`) VALUES(86, 78, '2014-11-20', '07:00:00', 1);



--
-- Volcado de datos para la tabla `turnoestudio`
--

INSERT INTO `turnoestudio` (`codigoturno`, `codigoestudio`) VALUES(81, 1);
INSERT INTO `turnoestudio` (`codigoturno`, `codigoestudio`) VALUES(86, 1);
INSERT INTO `turnoestudio` (`codigoturno`, `codigoestudio`) VALUES(85, 3);
INSERT INTO `turnoestudio` (`codigoturno`, `codigoestudio`) VALUES(74, 5);
INSERT INTO `turnoestudio` (`codigoturno`, `codigoestudio`) VALUES(82, 5);
INSERT INTO `turnoestudio` (`codigoturno`, `codigoestudio`) VALUES(54, 7);
INSERT INTO `turnoestudio` (`codigoturno`, `codigoestudio`) VALUES(83, 7);
--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(1, 'Jonathan', '1234', 'Recepcionista');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(2, 'Roberto', '12', 'Administrador');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(3, '34568373', '1234', 'Medico');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(4, '34568396', '1234', 'Medico');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(5, '34568419', '1234', 'Medico');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(6, '34568442', '1234', 'Medico');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(7, '34568465', '1234', 'Medico');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(8, '34568488', '1234', 'Medico');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(9, '34568511', '1234', 'Medico');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(10, '34568534', '1234', 'Medico');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(11, '34568557', '1234', 'Medico');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(12, '34568580', '1234', 'Medico');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(13, '34568603', '12', 'Medico');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(14, 'Maria Cristina', 'mariacristina', 'Administrador');
INSERT INTO `users` (`id`, `nombre`, `clave`, `cargo`) VALUES(15, '3', '3', 'Administrador');

--
-- Volcado de datos para la tabla `visita`
--

INSERT INTO `visita` (`codigoturno`, `codigomedico`) VALUES(84, 1);
INSERT INTO `visita` (`codigoturno`, `codigomedico`) VALUES(51, 4);
INSERT INTO `visita` (`codigoturno`, `codigomedico`) VALUES(71, 4);
INSERT INTO `visita` (`codigoturno`, `codigomedico`) VALUES(52, 5);
INSERT INTO `visita` (`codigoturno`, `codigomedico`) VALUES(78, 25);
INSERT INTO `visita` (`codigoturno`, `codigomedico`) VALUES(53, 35);
INSERT INTO `visita` (`codigoturno`, `codigomedico`) VALUES(69, 35);
INSERT INTO `visita` (`codigoturno`, `codigomedico`) VALUES(75, 35);
INSERT INTO `visita` (`codigoturno`, `codigomedico`) VALUES(77, 35);

--
-- Volcado de datos para la tabla `visitarespecialista`
--

INSERT INTO `visitarespecialista` (`codigoorden`, `codigoespecialidad`, `turnosolicitado`) VALUES(8, 3, 0);