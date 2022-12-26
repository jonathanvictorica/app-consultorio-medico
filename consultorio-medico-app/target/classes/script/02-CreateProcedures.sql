CREATE DEFINER=`root`@`localhost` PROCEDURE `almacenarmedico`(IN `numero_matricula` VARCHAR(15), IN `nombre` VARCHAR(30), IN `apellido` VARCHAR(30), IN `nombre_especialidad` VARCHAR(25), OUT `almacenado` BOOLEAN)
begin
declare codigo_especialidad int;
   if((select count(*) from medico where numeromatricula=numero_matricula)=0) then
   if((select count(*) from especialidad where nombreespecialidad=nombre_especialidad)=0) then
       insert into especialidad values (' ', nombre_especialidad);
end if;
   
   
   set codigo_especialidad =(select codigoespecialidad from especialidad where nombreespecialidad=nombre_especialidad);
insert into medico values(' ',nombre,apellido,numero_matricula,codigo_especialidad);
set almacenado=true;
   
   if(nombre_especialidad="Medico") then
        insert into users values(' ',numero_matricula,"1234","Medico");

end if;
ELSE
     set almacenado=FALSE;

END IF;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `AlmacenarObraSocial`(IN `nombre_obra_social` VARCHAR(255), IN `nombre_localidad` VARCHAR(50), IN `direccion` VARCHAR(50), IN `altura` VARCHAR(6), IN `telefono` VARCHAR(11), IN `codigopostal` VARCHAR(9), IN `observacion` TEXT, OUT `registrado` BOOLEAN)
begin
    declare codigo_localidad int;
    declare codigo_obra_social int;
	if((select count(*) from localidad where nombrelocalidad=nombre_localidad)=0) then
	insert into localidad(nombrelocalidad) values(nombre_localidad);
end if;
    if((select count(*) from obrasocial where nombreobrasocial =nombre_obra_social)=0) then
    
    set codigo_localidad=(select codigolocalidad from localidad where nombrelocalidad=nombre_localidad);

insert into obrasocial values(' ',nombre_obra_social,true,codigo_localidad,direccion,altura,telefono,codigopostal);
set codigo_obra_social=(select max(codigoobrasocial) from obrasocial);
  if(observacion<>"") then
   insert into observacionobrasocial values(codigo_obra_social,1,observacion);
end if;
    set registrado=true;
else
    set registrado=false;



end if;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Almacenar_Paciente`(IN `Dni_paciente` VARCHAR(10), IN `Nombre_paciente` VARCHAR(30), IN `Apellido_paciente` VARCHAR(30), IN `Fecha_nacimiento` DATE, IN `telefono_paciente` VARCHAR(11), IN `sexo_paciente` BOOLEAN, IN `grupo_sanguineo` VARCHAR(30), IN `mail_paciente` VARCHAR(70), IN `localidad_paciente` VARCHAR(50), IN `codigo_postal` VARCHAR(9), IN `direccion_paciente` VARCHAR(50), IN `altura_paciente` VARCHAR(6), IN `estado_civil_paciente` VARCHAR(30), IN `numero_matricula` VARCHAR(15), IN `obra_social` VARCHAR(40), IN `numero_afiliado` VARCHAR(20), IN `fecha_vencimiento_os` DATE)
BEGIN
         declare codigo_paciente int;
call VALIDAR_DATOS_REGISTRO(localidad_paciente ,grupo_sanguineo, numero_matricula, @codigolocalidad, @codigogruposanguineo,@codigomedico);
call REGISTRAR_PACIENTE(Dni_paciente,Nombre_paciente,Apellido_paciente,Fecha_nacimiento,telefono_paciente, sexo_paciente,@codigogruposanguineo,mail_paciente,@codigolocalidad,codigo_postal,direccion_paciente, altura_paciente,estado_civil_paciente,@codigomedico,obra_social,numero_afiliado,fecha_vencimiento_os);

set codigo_paciente=(Select max(codigopaciente) from pcaiente);
insert into historialMedico values(codigo_paciente,codigo_paciente);


END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ALMACENAR_TURNO_ESTUDIO`(IN `codigopaciente` INT, IN `fechaturno` DATE, IN `horaturno` TIME, IN `nombre_estudio` VARCHAR(30), OUT `codigo_turno` INT)
BEGIN
   declare codigo_estudio_med int;
   declare codigo_orden int;
    declare codigo_estudio int;
INSERT INTO TURNO(codigopaciente,fechaturno,horaturno) values (codigopaciente,fechaturno,horaturno);
set codigo_turno= (select max(codigoturno) from turno);
   set codigo_estudio = (select codigoestudio from estudio where nombre=nombre_estudio);
INSERT INTO TurnoEstudio values(codigo_turno, codigo_estudio);

set codigo_estudio_med=(select codigoestudio from turnoestudio where codigoturno=codigo_turno);
       
       set codigo_orden = (select max(ordenesmedico.codigoorden) from ordenesmedico,realizarestudio where ordenesmedico.codigoorden = realizarestudio.codigoorden and realizarestudio.codigoestudio = codigo_estudio_med and ordenesmedico.codigopaciente = codigopaciente and realizarestudio.turnosolicitado=false);

update realizarestudio set turnosolicitado = true
where codigoorden=codigo_orden;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ALMACENAR_TURNO_VISITA`(IN `codigopaciente` INT, IN `fechaturno` DATE, IN `horaturno` TIME, IN `codigomedico` INT, OUT `codigo_turno` INT)
BEGIN
  
   declare codigo_orden int;
   declare codigo_especialidad int;
   declare codigo_medico_nuevo int;
INSERT INTO TURNO(codigopaciente,fechaturno,horaturno) values (codigopaciente,fechaturno,horaturno);
set codigo_turno= (select codigoturno from turno order by codigoturno desc limit 1);


insert into VISITA(codigoturno,codigomedico) values(codigo_turno, codigomedico);

select * from visita order by codigoturno desc limit 1;
set codigo_medico_nuevo = codigomedico;
select codigo_medico_nuevo;
set codigo_especialidad = (select codigoespecialidad from medico where codigomedico = codigo_medico_nuevo limit 1);
select codigo_especialidad;
set codigo_orden = (select ordenesmedico.codigoorden from ordenesmedico,visitarespecialista where ordenesmedico.codigoorden = visitarespecialista.codigoorden and visitarespecialista.codigoespecialidad = codigo_especialidad  and ordenesmedico.codigopaciente = codigopaciente and visitarespecialista.turnosolicitado=false order by ordenesmedico.codigoorden desc limit 1);
select codigo_orden;

update visitarespecialista set turnosolicitado = true
where codigoorden=codigo_orden;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `autorizar_estudio`(IN `nombredepaciente` VARCHAR(61), IN `nombredeestudio` VARCHAR(30), OUT `autorizado` BOOLEAN)
begin 
declare codigo_paciente int;
declare codigo_orden int;
declare codigo_estudio int;
set codigo_paciente=(select codigopaciente from paciente where concat(nombre,' ',apellido)=nombredepaciente);
set codigo_estudio =(select codigoestudio from estudio where nombre=nombredeestudio);
if((select count(*) from ordenesmedico,realizarestudio where ordenesmedico.codigoorden = realizarestudio.codigoorden and ordenesmedico.codigopaciente = codigo_paciente and realizarestudio.codigoestudio = codigo_estudio and realizarestudio.turnosolicitado= false)=0) then
set autorizado=true;
insert into ordenesmedico(codigopaciente,fechaorden) values(codigo_paciente, curdate());
set codigo_orden=(select max(Codigoorden) from ordenesmedico);
select codigo_orden;
insert into realizarestudio values(codigo_orden,codigo_estudio , false);
else
set autorizado = false;
end if;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `autorizar_visita_especialista`(IN `nombre_paciente` VARCHAR(61), IN `nombre_especialidad` VARCHAR(25), OUT `autorizado` BOOLEAN)
begin
       declare codigo_paciente int;
       declare codigo_especialista int;
       declare codigo_orden int;
       
       set codigo_paciente =(select codigopaciente from paciente where concat(nombre,' ',apellido)=nombre_paciente);
       set codigo_especialista=(select codigoespecialidad from especialidad where nombreespecialidad=nombre_especialidad);
       
       if((select count(*) from ordenesmedico,visitarespecialista where ordenesmedico.codigoorden = visitarespecialista.codigoorden and ordenesmedico.codigopaciente = codigo_paciente and visitarespecialista.codigoespecialidad = codigo_especialista and visitarespecialista.turnosolicitado = false)=0) then
       insert into ordenesmedico(codigopaciente,fechaorden) values(codigo_paciente,curdate());
       set codigo_orden=(select max(codigoorden) from ordenesmedico);
insert into visitarespecialista values(codigo_orden,codigo_especialista, false);
set autorizado=true;

else
       set autorizado=false;
end if;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_estado_civil`(IN `estado_civil` VARCHAR(30), OUT `codigo_estado_civil` INT)
begin  
set codigo_estado_civil =(select codigoestadocivil from estadocivil where estado=estado_civil);
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `BUSCAR_MEDICO`(IN `numero_matricula` VARCHAR(15), OUT `codigo_medico` INT)
BEGIN
    
    set codigo_medico=(sELECT codigomedico FROM MEDICO WHERE numeromatricula=numero_matricula) ;
	
	
	

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_obra_social`(IN `nombre_obra_social` VARCHAR(40), OUT `codigo_obra_social` INT)
BEGIN
   
   set codigo_obra_social = (select codigoobrasocial from obrasocial where nombreobrasocial = nombre_obra_social);
   

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `cancelarTurno`(IN `codigo_turno` INT)
begin
    declare codigo_estudio_med int;
    declare codigo_paciente int;
    declare codigo_orden int;
    declare codigo_especialidad int;
    set codigo_paciente= (select codigopaciente from turno where codigoturno=codigo_turno);
    
    if((Select count(*) from turnoestudio where codigoturno=codigo_turno)>0) then
       set codigo_estudio_med=(select codigoestudio from turnoestudio where codigoturno=codigo_turno);
       
       set codigo_orden = (select max(ordenesmedico.codigoorden) from ordenesmedico,realizarestudio where ordenesmedico.codigoorden = realizarestudio.codigoorden and realizarestudio.codigoestudio = codigo_estudio_med  and ordenesmedico.codigopaciente = codigo_paciente
                          and realizarestudio.turnosolicitado=true);

update realizarestudio set turnosolicitado = false
where codigoorden=codigo_orden;

delete from turnoestudio where codigoturno = codigo_turno;
delete from turno where codigoturno = codigo_turno;



else
     set codigo_estudio_med=(select codigomedico from visita where codigoturno=codigo_turno);
    
    set codigo_especialidad = (select codigoespecialidad from medico where codigomedico = codigo_estudio_med);
    
     set codigo_orden = (select max(ordenesmedico.codigoorden) from ordenesmedico,visitarespecialista where ordenesmedico.codigoorden = visitarespecialista.codigoorden and visitarespecialista.codigoespecialidad = codigo_especialidad  and ordenesmedico.codigopaciente = codigo_paciente
                        and visitarespecialista.turnosolicitado=true);


update visitarespecialista set turnosolicitado = false
where codigoorden=codigo_orden;

delete from visita where codigoturno = codigo_turno;
delete from turno where codigoturno = codigo_turno;


end if;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `GUARDAR_PACIENTE`(IN `Dni_Paciente` VARCHAR(10), IN `Nombre_paciente` VARCHAR(30), IN `Apellido_paciente` VARCHAR(30), IN `Fecha_nacimiento` DATE, IN `telefono_paciente` VARCHAR(11), IN `sexo_paciente` BOOLEAN, IN `codigogruposanguineo` INT, IN `mail_paciente` VARCHAR(70), IN `codigolocalidad` INT, IN `codigo_postal` VARCHAR(9), IN `direccion_paciente` VARCHAR(50), IN `altura_paciente` VARCHAR(6), IN `codigoestadocivil` INT, OUT `codigo_paciente` INT)
BEGIN

INSERT INTO PACIENTE(Dni,Nombre,Apellido,FechaNacimiento,telefono,sexo,Codigogruposanguineo, mail, codigolocalidad	, codigopostal, direccion,altura,codigoestadocivil) values (Dni_Paciente,Nombre_paciente, apellido_paciente,Fecha_nacimiento,	telefono_paciente, sexo_paciente, codigogruposanguineo, mail_paciente,codigolocalidad,codigo_postal,direccion_paciente, altura_paciente,codigoestadocivil);


set codigo_paciente=(select max(codigopaciente) from paciente);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Guardar_Paciente_Medico_de_Cabecera`(IN `codigopaciente` INT, IN `codigomedico` INT)
BEGIN
INSERT INTO PacienteMedicoCabecera values(codigopaciente,codigomedico,curdate());

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Guardar_Paciente_obra_social`(IN `codigopaciente` INT, IN `numero_afiliado` VARCHAR(20), IN `fechavencimiento` DATE, IN `codigoobrasocial` INT)
BEGIN

insert into PacienteObraSocial values(codigopaciente,codigoobrasocial,numero_afiliado,fechavencimiento);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `modificarcontrasenia`(IN `nombreusuario` VARCHAR(30), IN `clavenueva` VARCHAR(40))
begin
declare codigo_usuario int;
set codigo_usuario= (select id from users where nombre=nombreusuario);
update users set clave=clavenueva where id=codigo_usuario;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarEstadoTurno`(in codigo_visita int)
begin
update turno set activo=false where codigoturno=codigo_visita;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ProcesarEstudio`(IN `codigoturno` INT, IN `nombreestudio` VARCHAR(30), IN `fecharetiro` DATE)
begin
    declare codigo_estudio int;
    set codigo_estudio =(select codigoestudio from estudio where nombre=nombreestudio);
insert into talonretiroestudio values(codigoturno,codigo_estudio,fecharetiro,false);

end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `registrarUsuario`(in nombre varchar(30), in clave varchar(15), in cargo varchar(40))
begin
insert into users(nombre,clave,cargo) values(nombre,clave,cargo);
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Registrar_Paciente`(IN `Dni_paciente` VARCHAR(10), IN `Nombre_paciente` VARCHAR(30), IN `Apellido_paciente` VARCHAR(30), IN `Fecha_nacimiento` DATE, IN `telefono_paciente` VARCHAR(11), IN `sexo_paciente` BOOLEAN, IN `codigo_grupo_sanguineo` INT, IN `mail_paciente` VARCHAR(70), IN `codigo_localidad_paciente` INT, IN `codigo_postal` VARCHAR(9), IN `direccion_paciente` VARCHAR(50), IN `altura_paciente` VARCHAR(6), IN `estado_civil_paciente` VARCHAR(30), IN `codigo_medico` INT, IN `obra_social` VARCHAR(40), IN `numero_afiliado` VARCHAR(20), IN `fecha_vencimiento_os` DATE)
BEGIN
call BUSCAR_OBRA_SOCIAL(obra_social,@codigo_obra_social);
select @codigo_obra_social;
select obra_social;
call BUSCAR_ESTADO_CIVIL( estado_civil_paciente, @codigo_estado_civil);
call GUARDAR_PACIENTE(Dni_paciente, Nombre_paciente , Apellido_paciente, Fecha_nacimiento ,telefOno_paciente , sexo_paciente , codigo_grupo_sanguineo ,mail_paciente,codigo_localidad_paciente, codigo_postal, direccion_paciente,altura_paciente,  @codigo_estado_civil,@codigo_paciente );
call GUARDAR_PACIENTE_OBRA_SOCIAL(@codigo_paciente,numero_afiliado, fecha_vencimiento_os , @codigo_obra_social );
call Guardar_Paciente_Medico_de_Cabecera(@codigo_paciente, codigo_medico );

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `VALIDAR_DATOS_REGISTRO`(IN `localidad_paciente` VARCHAR(50), IN `grupo_sanguineo` VARCHAR(30), IN `numero_matricula` VARCHAR(15), OUT `codigolocalidad` INT, OUT `codigogruposanguineo` INT, OUT `codigomedico` INT)
BEGIN
call verificar_localidad(localidad_paciente,@codigo_localidad);
call verificar_grupo_sanguineo(grupo_sanguineo,@codigo_grupo_sanguineo);
call buscar_medico(numero_matricula,@codigo_medico);

set codigolocalidad=@codigo_localidad;
	set codigogruposanguineo=@codigo_grupo_sanguineo;
	set codigomedico=@codigo_medico;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `VERIFICAR_GRUPO_SANGUINEO`(IN `tipo_grupo_sanguineo` VARCHAR(30), OUT `codigo_grupo_sanguineo` INT)
BEGIN
	  IF((SELECT COUNT(*) FROM GRUPOSANGUINEO WHERE tipo=tipo_grupo_sanguineo)=0) then
		   insert into GRUPOSANGUINEO(tipo) values(tipo_grupo_sanguineo);
end if;
   set codigo_grupo_sanguineo =(select codigogruposanguineo from GrupoSanguineo where tipo=tipo_grupo_sanguineo);
   

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `VERIFICAR_LOCALIDAD`(IN `localidad_paciente` VARCHAR(50), OUT `codigo_localidad` INT)
BEGIN
    IF((SELECT COUNT(*) FROM LOCALIDAD WHERE nombrelocalidad = localidad_paciente)=0) then
	    insert into Localidad(nombrelocalidad) values(localidad_paciente);

end if;
	
	set codigo_localidad=(select codigolocalidad from Localidad where nombrelocalidad=localidad_paciente);
	

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `VERIFICAR_PACIENTE`(IN `dni_paciente` VARCHAR(10), OUT `CONTROL` BOOLEAN)
bEGIN
    if((select count(*) from paciente where dni=dni_paciente)=0) then
	    set control=false;
else
	  set control=true;
end if;

END$$