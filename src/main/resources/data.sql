CREATE TABLE IF NOT EXISTS  `carrera` (
                           `id_carrera` int NOT NULL,
                           `nombre` varchar(255) DEFAULT NULL,
                           PRIMARY KEY (`id_carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `estudiante` (
                              `numero_legajo` int NOT NULL,
                              `apellido` varchar(255) DEFAULT NULL,
                              `ciudad` varchar(255) DEFAULT NULL,
                              `dni` int DEFAULT NULL,
                              `edad` int DEFAULT NULL,
                              `genero` char(1) DEFAULT NULL,
                              `nombre` varchar(255) DEFAULT NULL,
                              PRIMARY KEY (`numero_legajo`),
                              UNIQUE KEY `UK_4865s3jvl4pqyth5flq164ail` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `inscripcion` (
                               `id_inscripcion` bigint NOT NULL,
                               `es_graduado` bit(1) DEFAULT NULL,
                               `fecha_de_inicio` date DEFAULT NULL,
                               `id_carrera` int DEFAULT NULL,
                               `legajo_estudiante` int DEFAULT NULL,
                               PRIMARY KEY (`id_inscripcion`),
                               KEY `FKcncbrir2kqd1xt85mw4jjtuja` (`id_carrera`),
                               KEY `FK8y1d22xi028esrc8b00apx89k` (`legajo_estudiante`),
                               CONSTRAINT `FK8y1d22xi028esrc8b00apx89k` FOREIGN KEY (`legajo_estudiante`) REFERENCES `estudiante` (`numero_legajo`),
                               CONSTRAINT `FKcncbrir2kqd1xt85mw4jjtuja` FOREIGN KEY (`id_carrera`) REFERENCES `carrera` (`id_carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
