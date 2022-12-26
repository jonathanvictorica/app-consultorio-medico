
--
-- Estructura de tabla para la tabla `antecedentes`
--

CREATE TABLE IF NOT EXISTS `antecedentes` (
    `codigoantecedente` int(11) NOT NULL,
    `codigohistorial` int(11) NOT NULL,
    `antecedente` varchar(200) NOT NULL,
    `fechaantecedente` date DEFAULT NULL,
    PRIMARY KEY (`codigoantecedente`),
    KEY `codigohistorial` (`codigohistorial`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidad`
--

CREATE TABLE IF NOT EXISTS `especialidad` (
    `codigoespecialidad` int(11) NOT NULL AUTO_INCREMENT,
    `nombreespecialidad` varchar(25) NOT NULL,
    PRIMARY KEY (`codigoespecialidad`),
    UNIQUE KEY `nombreespecialidad` (`nombreespecialidad`)
    ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=28 ;



-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `establecimiento`
--

CREATE TABLE IF NOT EXISTS `establecimiento` (
    `codigoestablecimiento` int(11) NOT NULL,
    `nombrecompleto` varchar(50) NOT NULL,
    `abreviatura` varchar(10) DEFAULT NULL,
    `activo` tinyint(1) DEFAULT NULL,
    `direccion` varchar(60) NOT NULL,
    `altura` varchar(5) NOT NULL,
    `codigolocalidad` int(11) NOT NULL,
    `codigopostal` varchar(9) NOT NULL,
    `telefono` varchar(11) NOT NULL,
    `nota` varchar(200) NOT NULL,
    PRIMARY KEY (`codigoestablecimiento`),
    KEY `codigolocalidad` (`codigolocalidad`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `establecimiento`
--

INSERT INTO `establecimiento` (`codigoestablecimiento`, `nombrecompleto`, `abreviatura`, `activo`, `direccion`, `altura`, `codigolocalidad`, `codigopostal`, `telefono`, `nota`) VALUES(1, 'Centro de Salud Lavalle', 'CSL', 1, 'Lavalle', '1243', 4, '1234', '45654332', 'Este Establecimiento es muy valorado por su calidad de atenci?n con el publico');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estadocivil`
--

CREATE TABLE IF NOT EXISTS `estadocivil` (
    `codigoestadocivil` int(11) NOT NULL AUTO_INCREMENT,
    `estado` varchar(30) DEFAULT NULL,
    PRIMARY KEY (`codigoestadocivil`),
    UNIQUE KEY `estado` (`estado`)
    ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;



-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudio`
--

CREATE TABLE IF NOT EXISTS `estudio` (
    `codigoestudio` int(11) NOT NULL,
    `nombre` varchar(30) NOT NULL,
    PRIMARY KEY (`codigoestudio`),
    UNIQUE KEY `nombre` (`nombre`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estudio`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiorealizado`
--

CREATE TABLE IF NOT EXISTS `estudiorealizado` (
    `codigoestudiorealizado` int(11) NOT NULL,
    `codigohistorial` int(11) NOT NULL,
    `codigoestudio` int(11) NOT NULL,
    PRIMARY KEY (`codigoestudiorealizado`),
    KEY `codigohistorial` (`codigohistorial`),
    KEY `codigoestudio` (`codigoestudio`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudioterciarizado`
--

CREATE TABLE IF NOT EXISTS `estudioterciarizado` (
    `codigoestudio` int(11) NOT NULL,
    `codigoestablecimiento` int(11) NOT NULL,
    `abreviatura` varchar(20) NOT NULL,
    `costoobrasocial` float DEFAULT NULL,
    `costoparticular` float DEFAULT NULL,
    PRIMARY KEY (`codigoestudio`),
    KEY `codigoestablecimiento` (`codigoestablecimiento`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `estudioterciarizado_inicial`
--
CREATE TABLE IF NOT EXISTS `estudioterciarizado_inicial` (
    `codigoestudio` int(11)
    ,`codigoestablecimiento` int(11)
    ,`nombrecompleto` varchar(50)
    ,`abreviaturaestablecimiento` varchar(10)
    ,`activo` tinyint(1)
    ,`direccion` varchar(60)
    ,`altura` varchar(5)
    ,`nombrelocalidad` varchar(50)
    ,`codigopostal` varchar(9)
    ,`telefono` varchar(11)
    ,`nota` varchar(200)
    ,`abreviaturaestudio` varchar(20)
    ,`costoobrasocial` float
    ,`costoparticular` float
    ,`nombre` varchar(30)
    );
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fichaatencion`
--

CREATE TABLE IF NOT EXISTS `fichaatencion` (
    `codigovisita` int(11) NOT NULL,
    `motivo` varchar(80) NOT NULL,
    `diagnostico` varchar(300) NOT NULL,
    `codigotratamiento` int(11) NOT NULL,
    `evolucion` varchar(300) DEFAULT NULL,
    `observacionesgenerales` varchar(200) DEFAULT NULL,
    PRIMARY KEY (`codigovisita`),
    KEY `codigotratamiento` (`codigotratamiento`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gruposanguineo`
--

CREATE TABLE IF NOT EXISTS `gruposanguineo` (
    `codigogruposanguineo` int(11) NOT NULL AUTO_INCREMENT,
    `tipo` varchar(30) NOT NULL,
    PRIMARY KEY (`codigogruposanguineo`),
    UNIQUE KEY `tipo` (`tipo`)
    ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;



-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historialmedico`
--

CREATE TABLE IF NOT EXISTS `historialmedico` (
    `codigohistorial` int(11) NOT NULL,
    `codigopaciente` int(11) NOT NULL,
    PRIMARY KEY (`codigohistorial`),
    KEY `codigopaciente` (`codigopaciente`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `localidad`
--

CREATE TABLE IF NOT EXISTS `localidad` (
    `codigolocalidad` int(11) NOT NULL AUTO_INCREMENT,
    `nombrelocalidad` varchar(50) NOT NULL,
    PRIMARY KEY (`codigolocalidad`),
    UNIQUE KEY `nombrelocalidad` (`nombrelocalidad`)
    ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=62 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE IF NOT EXISTS `medico` (
    `codigomedico` int(11) NOT NULL AUTO_INCREMENT,
    `nombre` varchar(30) NOT NULL,
    `apellido` varchar(30) NOT NULL,
    `numeromatricula` varchar(15) NOT NULL,
    `codigoespecialidad` int(11) NOT NULL,
    PRIMARY KEY (`codigomedico`),
    KEY `codigoespecialidad` (`codigoespecialidad`)
    ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=39 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicohorario`
--

CREATE TABLE IF NOT EXISTS `medicohorario` (
    `codigomedico` int(11) NOT NULL DEFAULT '0',
    `dia` varchar(10) NOT NULL DEFAULT '',
    `horainicial` time NOT NULL DEFAULT '00:00:00',
    `horafinal` time DEFAULT NULL,
    PRIMARY KEY (`codigomedico`,`dia`,`horainicial`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `obrasocial`
--

CREATE TABLE IF NOT EXISTS `obrasocial` (
    `codigoobrasocial` int(11) NOT NULL AUTO_INCREMENT,
    `nombreobrasocial` varchar(255) NOT NULL,
    `activo` tinyint(1) NOT NULL,
    `codigolocalidad` int(11) NOT NULL,
    `direccion` varchar(50) NOT NULL,
    `altura` varchar(6) NOT NULL,
    `telefono` varchar(11) NOT NULL,
    `codigopostal` varchar(9) NOT NULL,
    PRIMARY KEY (`codigoobrasocial`),
    UNIQUE KEY `nombreobrasocial` (`nombreobrasocial`),
    KEY `codigolocalidad` (`codigolocalidad`)
    ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=80 ;

--
-- Estructura de tabla para la tabla `observacionobrasocial`
--

CREATE TABLE IF NOT EXISTS `observacionobrasocial` (
    `codigoobrasocial` int(11) NOT NULL DEFAULT '0',
    `numeroobservacion` int(11) NOT NULL DEFAULT '0',
    `tipoobservacion` text NOT NULL,
    PRIMARY KEY (`codigoobrasocial`,`numeroobservacion`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ordenesmedico`
--

CREATE TABLE IF NOT EXISTS `ordenesmedico` (
    `codigoorden` int(11) NOT NULL AUTO_INCREMENT,
    `codigopaciente` int(11) NOT NULL,
    `fechaorden` date NOT NULL,
    PRIMARY KEY (`codigoorden`),
    KEY `codigopaciente` (`codigopaciente`)
    ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;



-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE IF NOT EXISTS `paciente` (
    `CodigoPaciente` int(11) NOT NULL AUTO_INCREMENT,
    `Nombre` varchar(30) NOT NULL,
    `Apellido` varchar(30) NOT NULL,
    `FechaNacimiento` date NOT NULL,
    `telefono` varchar(11) NOT NULL,
    `Codigogruposanguineo` int(11) NOT NULL,
    `mail` varchar(70) NOT NULL,
    `codigolocalidad` int(11) NOT NULL,
    `codigopostal` varchar(9) NOT NULL,
    `direccion` varchar(50) NOT NULL,
    `altura` varchar(6) NOT NULL,
    `codigoestadocivil` int(11) NOT NULL,
    `Dni` varchar(10) DEFAULT NULL,
    `sexo` tinyint(1) NOT NULL,
    PRIMARY KEY (`CodigoPaciente`),
    KEY `Codigogruposanguineo` (`Codigogruposanguineo`),
    KEY `codigolocalidad` (`codigolocalidad`),
    KEY `codigoestadocivil` (`codigoestadocivil`),
    KEY `Nombre` (`Nombre`,`Apellido`)
    ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=79 ;



-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `pacienteinicializado`
--
CREATE TABLE IF NOT EXISTS `pacienteinicializado` (
    `codigopaciente` int(11)
    ,`Dni` varchar(10)
    ,`Nombre` varchar(30)
    ,`Apellido` varchar(30)
    ,`FechaNacimiento` date
    ,`telefono` varchar(11)
    ,`sexo` tinyint(1)
    ,`tipo` varchar(30)
    ,`mail` varchar(70)
    ,`nombrelocalidad` varchar(50)
    ,`codigopostal` varchar(9)
    ,`direccion` varchar(50)
    ,`altura` varchar(6)
    ,`estado` varchar(30)
    );
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientemedicocabecera`
--

CREATE TABLE IF NOT EXISTS `pacientemedicocabecera` (
    `codigopaciente` int(11) NOT NULL,
    `codigomedico` int(11) NOT NULL,
    `fechaactualizacion` date NOT NULL,
    PRIMARY KEY (`codigopaciente`,`codigomedico`,`fechaactualizacion`),
    KEY `codigomedico` (`codigomedico`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacienteobrasocial`
--

CREATE TABLE IF NOT EXISTS `pacienteobrasocial` (
    `codigopaciente` int(11) NOT NULL,
    `codigoobrasocial` int(11) NOT NULL,
    `numeroafiliado` varchar(20) NOT NULL,
    `fechavencimiento` date NOT NULL,
    PRIMARY KEY (`codigopaciente`,`codigoobrasocial`,`fechavencimiento`),
    KEY `codigoobrasocial` (`codigoobrasocial`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `pacienteobrasocial_actualizado`
--
CREATE TABLE IF NOT EXISTS `pacienteobrasocial_actualizado` (
    `codigoobrasocial` int(11)
    ,`nombreobrasocial` varchar(255)
    ,`nombrelocalidad` varchar(50)
    ,`direccion` varchar(50)
    ,`altura` varchar(6)
    ,`telefono` varchar(11)
    ,`codigopostal` varchar(9)
    ,`numeroafiliado` varchar(20)
    ,`fechavencimiento` date
    ,`codigopaciente` int(11)
    ,`activo` tinyint(1)
    );
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `realizarestudio`
--

CREATE TABLE IF NOT EXISTS `realizarestudio` (
    `codigoorden` int(11) NOT NULL,
    `codigoestudio` int(11) NOT NULL,
    `turnosolicitado` tinyint(1) NOT NULL,
    PRIMARY KEY (`codigoorden`),
    KEY `codigoestudio` (`codigoestudio`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `talonretiroestudio`
--

CREATE TABLE IF NOT EXISTS `talonretiroestudio` (
    `codigoturno` int(11) NOT NULL,
    `codigoestudio` int(11) NOT NULL,
    `fecharetiro` date NOT NULL,
    `estudioretirado` tinyint(1) NOT NULL,
    PRIMARY KEY (`codigoturno`),
    KEY `codigoestudio` (`codigoestudio`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE IF NOT EXISTS `tratamiento` (
    `codigotratamiento` int(11) NOT NULL,
    `Nombretratamiento` varchar(80) NOT NULL,
    PRIMARY KEY (`codigotratamiento`),
    UNIQUE KEY `Nombretratamiento` (`Nombretratamiento`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turno`
--

CREATE TABLE IF NOT EXISTS `turno` (
    `codigoturno` int(11) NOT NULL AUTO_INCREMENT,
    `codigopaciente` int(11) NOT NULL,
    `fechaturno` date NOT NULL,
    `horaturno` time NOT NULL,
    `activo` tinyint(1) NOT NULL DEFAULT '1',
    PRIMARY KEY (`codigoturno`),
    KEY `codigopaciente` (`codigopaciente`)
    ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=87 ;


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turnoestudio`
--

CREATE TABLE IF NOT EXISTS `turnoestudio` (
    `codigoturno` int(11) NOT NULL,
    `codigoestudio` int(11) NOT NULL,
    PRIMARY KEY (`codigoturno`),
    KEY `codigoestudio` (`codigoestudio`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE IF NOT EXISTS `users` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `nombre` varchar(30) DEFAULT NULL,
    `clave` varchar(15) DEFAULT NULL,
    `cargo` varchar(40) DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `nombre` (`nombre`)
    ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;



-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `verturnoestudio`
--
CREATE TABLE IF NOT EXISTS `verturnoestudio` (
    `codigoturno` int(11)
    ,`fechaturno` date
    ,`horaturno` time
    ,`nombre` varchar(30)
    ,`codigopaciente` int(11)
    );
-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `verturnosvisita`
--
CREATE TABLE IF NOT EXISTS `verturnosvisita` (
    `codigoturno` int(11)
    ,`fechaturno` date
    ,`horaturno` time
    ,`numeromatricula` varchar(15)
    ,`nombre` varchar(30)
    ,`apellido` varchar(30)
    ,`nombreespecialidad` varchar(25)
    ,`codigopaciente` int(11)
    );
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita`
--

CREATE TABLE IF NOT EXISTS `visita` (
    `codigoturno` int(11) NOT NULL,
    `codigomedico` int(11) NOT NULL,
    PRIMARY KEY (`codigoturno`),
    KEY `codigomedico` (`codigomedico`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;



-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visitarespecialista`
--

CREATE TABLE IF NOT EXISTS `visitarespecialista` (
    `codigoorden` int(11) NOT NULL,
    `codigoespecialidad` int(11) NOT NULL,
    `turnosolicitado` tinyint(1) NOT NULL,
    PRIMARY KEY (`codigoorden`),
    KEY `codigoespecialidad` (`codigoespecialidad`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;



-- --------------------------------------------------------

--
-- Estructura para la vista `estudioterciarizado_inicial`
--
DROP TABLE IF EXISTS `estudioterciarizado_inicial`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `estudioterciarizado_inicial` AS select `t`.`codigoestudio` AS `codigoestudio`,`e`.`codigoestablecimiento` AS `codigoestablecimiento`,`e`.`nombrecompleto` AS `nombrecompleto`,`e`.`abreviatura` AS `abreviaturaestablecimiento`,`e`.`activo` AS `activo`,`e`.`direccion` AS `direccion`,`e`.`altura` AS `altura`,`l`.`nombrelocalidad` AS `nombrelocalidad`,`e`.`codigopostal` AS `codigopostal`,`e`.`telefono` AS `telefono`,`e`.`nota` AS `nota`,`t`.`abreviatura` AS `abreviaturaestudio`,`t`.`costoobrasocial` AS `costoobrasocial`,`t`.`costoparticular` AS `costoparticular`,`est`.`nombre` AS `nombre` from (((`estudioterciarizado` `t` join `estudio` `est`) join `localidad` `l`) join `establecimiento` `e`) where ((`t`.`codigoestudio` = `est`.`codigoestudio`) and (`t`.`codigoestablecimiento` = `e`.`codigoestablecimiento`) and (`e`.`codigolocalidad` = `l`.`codigolocalidad`));

-- --------------------------------------------------------

--
-- Estructura para la vista `pacienteinicializado`
--
DROP TABLE IF EXISTS `pacienteinicializado`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `pacienteinicializado` AS select `paciente`.`CodigoPaciente` AS `codigopaciente`,`paciente`.`Dni` AS `Dni`,`paciente`.`Nombre` AS `Nombre`,`paciente`.`Apellido` AS `Apellido`,`paciente`.`FechaNacimiento` AS `FechaNacimiento`,`paciente`.`telefono` AS `telefono`,`paciente`.`sexo` AS `sexo`,`gruposanguineo`.`tipo` AS `tipo`,`paciente`.`mail` AS `mail`,`localidad`.`nombrelocalidad` AS `nombrelocalidad`,`paciente`.`codigopostal` AS `codigopostal`,`paciente`.`direccion` AS `direccion`,`paciente`.`altura` AS `altura`,`estadocivil`.`estado` AS `estado` from (((`paciente` join `localidad` on((`paciente`.`codigolocalidad` = `localidad`.`codigolocalidad`))) join `estadocivil` on((`paciente`.`codigoestadocivil` = `estadocivil`.`codigoestadocivil`))) join `gruposanguineo` on((`paciente`.`Codigogruposanguineo` = `gruposanguineo`.`codigogruposanguineo`)));

-- --------------------------------------------------------

--
-- Estructura para la vista `pacienteobrasocial_actualizado`
--
DROP TABLE IF EXISTS `pacienteobrasocial_actualizado`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `pacienteobrasocial_actualizado` AS select `obrasocial`.`codigoobrasocial` AS `codigoobrasocial`,`obrasocial`.`nombreobrasocial` AS `nombreobrasocial`,`localidad`.`nombrelocalidad` AS `nombrelocalidad`,`obrasocial`.`direccion` AS `direccion`,`obrasocial`.`altura` AS `altura`,`obrasocial`.`telefono` AS `telefono`,`obrasocial`.`codigopostal` AS `codigopostal`,`pacienteobrasocial`.`numeroafiliado` AS `numeroafiliado`,`pacienteobrasocial`.`fechavencimiento` AS `fechavencimiento`,`pacienteobrasocial`.`codigopaciente` AS `codigopaciente`,`obrasocial`.`activo` AS `activo` from ((`obrasocial` join `localidad`) join `pacienteobrasocial`) where ((`obrasocial`.`codigolocalidad` = `localidad`.`codigolocalidad`) and (`pacienteobrasocial`.`codigoobrasocial` = `obrasocial`.`codigoobrasocial`)) order by `pacienteobrasocial`.`fechavencimiento` desc;

-- --------------------------------------------------------

--
-- Estructura para la vista `verturnoestudio`
--
DROP TABLE IF EXISTS `verturnoestudio`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `verturnoestudio` AS select `turno`.`codigoturno` AS `codigoturno`,`turno`.`fechaturno` AS `fechaturno`,`turno`.`horaturno` AS `horaturno`,`estudio`.`nombre` AS `nombre`,`turno`.`codigopaciente` AS `codigopaciente` from ((`turno` join `turnoestudio`) join `estudio`) where ((`turno`.`codigoturno` = `turnoestudio`.`codigoturno`) and (`turnoestudio`.`codigoestudio` = `estudio`.`codigoestudio`) and (`turno`.`activo` = 1));

-- --------------------------------------------------------

--
-- Estructura para la vista `verturnosvisita`
--
DROP TABLE IF EXISTS `verturnosvisita`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `verturnosvisita` AS select `turno`.`codigoturno` AS `codigoturno`,`turno`.`fechaturno` AS `fechaturno`,`turno`.`horaturno` AS `horaturno`,`medico`.`numeromatricula` AS `numeromatricula`,`medico`.`nombre` AS `nombre`,`medico`.`apellido` AS `apellido`,`especialidad`.`nombreespecialidad` AS `nombreespecialidad`,`turno`.`codigopaciente` AS `codigopaciente` from (((`medico` join `especialidad`) join `turno`) join `visita`) where ((`turno`.`codigoturno` = `visita`.`codigoturno`) and (`visita`.`codigomedico` = `medico`.`codigomedico`) and (`medico`.`codigoespecialidad` = `especialidad`.`codigoespecialidad`) and (`turno`.`activo` = 1));

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `antecedentes`
--
ALTER TABLE `antecedentes`
    ADD CONSTRAINT `antecedentes_ibfk_1` FOREIGN KEY (`codigohistorial`) REFERENCES `historialmedico` (`codigohistorial`);

--
-- Filtros para la tabla `establecimiento`
--
ALTER TABLE `establecimiento`
    ADD CONSTRAINT `establecimiento_ibfk_1` FOREIGN KEY (`codigolocalidad`) REFERENCES `localidad` (`codigolocalidad`);

--
-- Filtros para la tabla `estudiorealizado`
--
ALTER TABLE `estudiorealizado`
    ADD CONSTRAINT `estudiorealizado_ibfk_1` FOREIGN KEY (`codigohistorial`) REFERENCES `historialmedico` (`codigohistorial`),
  ADD CONSTRAINT `estudiorealizado_ibfk_2` FOREIGN KEY (`codigoestudio`) REFERENCES `estudio` (`codigoestudio`);

--
-- Filtros para la tabla `estudioterciarizado`
--
ALTER TABLE `estudioterciarizado`
    ADD CONSTRAINT `estudioterciarizado_ibfk_1` FOREIGN KEY (`codigoestablecimiento`) REFERENCES `establecimiento` (`codigoestablecimiento`),
  ADD CONSTRAINT `estudioterciarizado_ibfk_2` FOREIGN KEY (`codigoestudio`) REFERENCES `estudio` (`codigoestudio`);

--
-- Filtros para la tabla `fichaatencion`
--
ALTER TABLE `fichaatencion`
    ADD CONSTRAINT `fichaatencion_ibfk_1` FOREIGN KEY (`codigotratamiento`) REFERENCES `tratamiento` (`codigotratamiento`);

--
-- Filtros para la tabla `historialmedico`
--
ALTER TABLE `historialmedico`
    ADD CONSTRAINT `historialmedico_ibfk_1` FOREIGN KEY (`codigopaciente`) REFERENCES `paciente` (`CodigoPaciente`);

--
-- Filtros para la tabla `medico`
--
ALTER TABLE `medico`
    ADD CONSTRAINT `medico_ibfk_1` FOREIGN KEY (`codigoespecialidad`) REFERENCES `especialidad` (`codigoespecialidad`);

--
-- Filtros para la tabla `medicohorario`
--
ALTER TABLE `medicohorario`
    ADD CONSTRAINT `medicohorario_ibfk_1` FOREIGN KEY (`codigomedico`) REFERENCES `medico` (`codigomedico`);

--
-- Filtros para la tabla `obrasocial`
--
ALTER TABLE `obrasocial`
    ADD CONSTRAINT `obrasocial_ibfk_1` FOREIGN KEY (`codigolocalidad`) REFERENCES `localidad` (`codigolocalidad`);

--
-- Filtros para la tabla `observacionobrasocial`
--
ALTER TABLE `observacionobrasocial`
    ADD CONSTRAINT `observacionobrasocial_ibfk_1` FOREIGN KEY (`codigoobrasocial`) REFERENCES `obrasocial` (`codigoobrasocial`);

--
-- Filtros para la tabla `ordenesmedico`
--
ALTER TABLE `ordenesmedico`
    ADD CONSTRAINT `ordenesmedico_ibfk_1` FOREIGN KEY (`codigopaciente`) REFERENCES `paciente` (`CodigoPaciente`);

--
-- Filtros para la tabla `paciente`
--
ALTER TABLE `paciente`
    ADD CONSTRAINT `paciente_ibfk_1` FOREIGN KEY (`Codigogruposanguineo`) REFERENCES `gruposanguineo` (`codigogruposanguineo`),
  ADD CONSTRAINT `paciente_ibfk_2` FOREIGN KEY (`codigolocalidad`) REFERENCES `localidad` (`codigolocalidad`),
  ADD CONSTRAINT `paciente_ibfk_3` FOREIGN KEY (`codigoestadocivil`) REFERENCES `estadocivil` (`codigoestadocivil`);

--
-- Filtros para la tabla `pacientemedicocabecera`
--
ALTER TABLE `pacientemedicocabecera`
    ADD CONSTRAINT `pacientemedicocabecera_ibfk_1` FOREIGN KEY (`codigopaciente`) REFERENCES `paciente` (`CodigoPaciente`),
  ADD CONSTRAINT `pacientemedicocabecera_ibfk_2` FOREIGN KEY (`codigomedico`) REFERENCES `medico` (`codigomedico`);

--
-- Filtros para la tabla `pacienteobrasocial`
--
ALTER TABLE `pacienteobrasocial`
    ADD CONSTRAINT `pacienteobrasocial_ibfk_1` FOREIGN KEY (`codigopaciente`) REFERENCES `paciente` (`CodigoPaciente`),
  ADD CONSTRAINT `pacienteobrasocial_ibfk_2` FOREIGN KEY (`codigoobrasocial`) REFERENCES `obrasocial` (`codigoobrasocial`);

--
-- Filtros para la tabla `realizarestudio`
--
ALTER TABLE `realizarestudio`
    ADD CONSTRAINT `realizarestudio_ibfk_1` FOREIGN KEY (`codigoorden`) REFERENCES `ordenesmedico` (`codigoorden`),
  ADD CONSTRAINT `realizarestudio_ibfk_2` FOREIGN KEY (`codigoestudio`) REFERENCES `estudio` (`codigoestudio`);

--
-- Filtros para la tabla `talonretiroestudio`
--
ALTER TABLE `talonretiroestudio`
    ADD CONSTRAINT `talonretiroestudio_ibfk_1` FOREIGN KEY (`codigoestudio`) REFERENCES `estudio` (`codigoestudio`);

--
-- Filtros para la tabla `turno`
--
ALTER TABLE `turno`
    ADD CONSTRAINT `turno_ibfk_1` FOREIGN KEY (`codigopaciente`) REFERENCES `paciente` (`CodigoPaciente`);

--
-- Filtros para la tabla `turnoestudio`
--
ALTER TABLE `turnoestudio`
    ADD CONSTRAINT `turnoestudio_ibfk_1` FOREIGN KEY (`codigoturno`) REFERENCES `turno` (`codigoturno`),
  ADD CONSTRAINT `turnoestudio_ibfk_2` FOREIGN KEY (`codigoestudio`) REFERENCES `estudio` (`codigoestudio`);

--
-- Filtros para la tabla `visita`
--
ALTER TABLE `visita`
    ADD CONSTRAINT `visita_ibfk_1` FOREIGN KEY (`codigoturno`) REFERENCES `turno` (`codigoturno`),
  ADD CONSTRAINT `visita_ibfk_2` FOREIGN KEY (`codigomedico`) REFERENCES `medico` (`codigomedico`);

--
-- Filtros para la tabla `visitarespecialista`
--
ALTER TABLE `visitarespecialista`
    ADD CONSTRAINT `visitarespecialista_ibfk_1` FOREIGN KEY (`codigoorden`) REFERENCES `ordenesmedico` (`codigoorden`),
  ADD CONSTRAINT `visitarespecialista_ibfk_2` FOREIGN KEY (`codigoespecialidad`) REFERENCES `especialidad` (`codigoespecialidad`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;


--
-- Volcado de datos para la tabla `historialmedico`
--

INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(12, 12);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(19, 19);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(20, 20);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(21, 21);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(22, 22);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(23, 23);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(24, 24);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(25, 25);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(26, 26);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(27, 27);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(28, 28);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(29, 29);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(30, 30);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(32, 32);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(33, 33);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(34, 34);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(35, 35);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(36, 36);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(46, 36);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(37, 37);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(38, 38);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(39, 39);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(40, 40);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(41, 41);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(42, 42);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(43, 43);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(44, 44);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(45, 45);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(47, 47);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(48, 48);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(49, 49);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(50, 50);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(51, 51);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(52, 52);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(53, 53);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(54, 54);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(55, 55);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(56, 56);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(57, 57);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(58, 58);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(59, 59);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(60, 60);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(61, 61);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(62, 62);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(63, 63);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(64, 64);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(65, 65);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(66, 66);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(67, 67);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(68, 68);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(69, 69);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(70, 70);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(71, 71);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(72, 72);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(73, 73);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(74, 74);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(75, 75);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(76, 76);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(77, 77);
INSERT INTO `historialmedico` (`codigohistorial`, `codigopaciente`) VALUES(78, 78);