# HomeControl

Sistema de automatización del hogar desarrollado en Java para aplicar patrones de diseño y principios de diseño orientado a objetos.

## Descripción

HomeControl modela un sistema doméstico con distintos dispositivos, como luces inteligentes, cerraduras y termostatos, coordinados desde un hub central. El proyecto incluye escenas automatizadas, integración de una cerradura heredada, notificaciones por eventos de movimiento y comportamiento de dispositivos según su estado.

## Funcionalidades principales

- Crear dispositivos mediante `DispositivoFactory`.
- Registrar y coordinar dispositivos desde `HubCentral`.
- Definir escenas con `Escena` y ejecutarlas mediante `GestorDeEscenas`.
- Adaptar una cerradura heredada mediante `CerraduraAdapter`.
- Notificar eventos de movimiento mediante el patrón Observer.
- Representar estados encendido/apagado con el patrón State.

## Tecnologías

- Java
- Apache Maven
- Programación orientada a objetos
- Patrones de diseño
- Apache NetBeans (entorno utilizado, según el informe)

## Estructura del proyecto

```text
HomeControl/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── homecontrol/
│   │           ├── abstracciones/
│   │           ├── adapters/
│   │           ├── automatizacion/
│   │           ├── dispositivos/
│   │           ├── fabrica/
│   │           ├── legacy/
│   │           ├── observer/
│   │           ├── principal/
│   │           └── state/
│   └── test/
├── docs/
│   └── Informe-HomeControl.pdf
├── .gitignore
├── pom.xml
└── README.md
```

## Requisitos

- JDK 17 o compatible.
- Apache Maven.

## Ejecución

Desde la carpeta raíz del proyecto, ejecuta:

```bash
mvn clean compile
```

Para ejecutar la clase principal desde un entorno como NetBeans, abre el proyecto como proyecto Maven y ejecuta `homecontrol.principal.Main`.

## Documentación

El informe del trabajo final se encuentra en [`docs/Informe-HomeControl.pdf`](docs/Informe-HomeControl.pdf).

## Estado

Proyecto académico. La implementación representa y demuestra patrones de diseño; no implica conexión real con dispositivos físicos de domótica.
