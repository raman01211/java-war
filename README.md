# Java Servlet WAR

![Java](https://img.shields.io/badge/Java-21-%23ED8B00?logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-3.9-%23C71A36?logo=apache-maven)
![Docker](https://img.shields.io/badge/Docker-ready-%232496ED?logo=docker)

A simple Jakarta Servlet WAR project deployed with Docker + Tomcat.

## Quick Start

```bash
make build
make run
```

Open http://localhost:8080

[![Run Locally](https://img.shields.io/badge/Run%20Locally-Make-1f425f.svg)](#quick-start)

## Commands

| Command       | Description                      |
|---------------|----------------------------------|
| `make build`  | Build the WAR with Maven         |
| `make run`    | Build Docker image and run it    |
| `make clean`  | Remove build artifacts and image |
