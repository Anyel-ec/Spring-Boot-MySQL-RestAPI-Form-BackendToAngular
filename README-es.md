# **Seleccionar Idioma:** 🌍
- [Español (Spanish)](README-es.md)
- [English](README.md)

# MySQL-Angular-Form

## Resumen

MySQL-Angular-Form es un proyecto con Spring Boot que proporciona una API RESTful para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en una base de datos MySQL. El proyecto está configurado para manejar datos de formularios e incluye configuración de intercambio de recursos entre orígenes (CORS) para permitir solicitudes de API desde cualquier origen.

## Características

- Operaciones de Crear, Leer, Actualizar y Eliminar en datos de formularios.
- Configuración CORS para permitir solicitudes de API desde cualquier origen.
- Integración de base de datos MySQL utilizando Spring Data JPA.
- Endpoints de API RESTful para gestionar datos de formularios.

## Estructura del Proyecto

- **Config:** Contiene archivos de configuración para ajustes CORS.
- **Controller:** Maneja las solicitudes HTTP entrantes y envía respuestas.
- **Model:** Define la estructura de datos para el formulario.
- **Repository:** Proporciona una interfaz para operaciones CRUD en la base de datos.
- **Service:** Contiene la lógica de negocio e interactúa con el repositorio.

## Empezando

### Prerrequisitos

- Java 17 o superior
- Maven 3.6.3 o superior
- MySQL 8.0 o superior

### Instalación

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/Anyel-ec/Spring-Boot-MySQL-RestAPI-Form-BackendToAngular
   cd Spring-Boot-MySQL-RestAPI-Form-BackendToAngular
   ```

2. **Configurar la base de datos MySQL:**
    - Crear una base de datos llamada `form`.
    - Actualizar las credenciales de la base de datos en `application.properties`:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/form
      spring.datasource.username=root
      spring.datasource.password=yourpassword
      ```

3. **Construir el proyecto:**
   ```bash
   mvn clean install
   ```

4. **Ejecutar la aplicación:**
   ```bash
   mvn spring-boot:run
   ```

### Endpoints de API

- **GET /api/v1/formularios**
    - Obtiene todas las entradas de formularios.

- **GET /api/v1/formularios/{id}**
    - Obtiene una entrada específica de formulario por ID.

- **POST /api/v1/formularios**
    - Crea una nueva entrada de formulario.

- **PUT /api/v1/formularios/{id}**
    - Actualiza una entrada de formulario existente por ID.

- **DELETE /api/v1/formularios/{id}**
    - Elimina una entrada de formulario por ID.

### Archivos de Configuración

- **application.properties:**
  ```properties
  spring.application.name=MySQL-Angular-Form
  spring.datasource.url=jdbc:mysql://localhost:3306/form
  spring.datasource.username=root
  spring.datasource.password=yourpassword
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

  spring.jpa.show-sql=true
  spring.jpa.hibernate.ddl-auto=create-drop

  server.port=8080
  ```

### Dependencias de Maven

- **pom.xml:**
  ```xml
  <dependencies>
      <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-data-jpa</artifactId>
      </dependency>
      <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-web</artifactId>
      </dependency>
      <dependency>
          <groupId>com.mysql</groupId>
          <artifactId>mysql-connector-j</artifactId>
          <scope>runtime</scope>
      </dependency>
      <dependency>
          <groupId>org.projectlombok</groupId>
          <artifactId>lombok</artifactId>
          <optional>true</optional>
      </dependency>
      <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-test</artifactId>
          <scope>test</scope>
      </dependency>
  </dependencies>
  ```

## Uso

Una vez que la aplicación esté en ejecución, puedes utilizar herramientas como Postman o cURL para interactuar con la API. Por ejemplo, para crear una nueva entrada de formulario, envía una solicitud POST a `http://localhost:8080/api/v1/formularios` con los datos del formulario en el cuerpo de la solicitud.

## Licencia

Este proyecto está bajo la Licencia MIT.

## Agradecimientos

- Spring Boot
- MySQL
- Lombok

Para obtener más ayuda, consulta la [Documentación de Spring Boot](https://spring.io/projects/spring-boot) y la [Documentación de MySQL](https://dev.mysql.com/doc/).