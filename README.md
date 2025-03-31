# Dao_Gestion_Inventario

## Descripción del Proyecto
Este proyecto es una aplicación de gestión de inventario que permite a los usuarios gestionar estancias, inventarios e incidencias. La aplicación está desarrollada en Java y utiliza una base de datos MySQL para almacenar la información.

## Tecnologías Usadas
- Java
- MySQL
- Docker
- Maven
- JAXB (Java Architecture for XML Binding)

## Características
- Gestión de estancias
- Gestión de inventarios
- Gestión de incidencias
- Conexión a base de datos MySQL
- Uso de Docker para la base de datos

## Rutas
- `/estancias` - Gestión de estancias
- `/inventarios` - Gestión de inventarios
- `/incidencias` - Gestión de incidencias

## Instalación e Iniciar el Servidor
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/josego16/Dao_Gestion_Inventario.git
   cd Dao_Gestion_Inventario
   ```

2. Construir el proyecto con Maven:
   ```bash
   mvn clean install
   ```

3. Iniciar los servicios de Docker:
   ```bash
   docker-compose up
   ```

4. Ejecutar la aplicación:
   ```bash
   mvn exec:java -Dexec.mainClass="com.iesvdc.acceso.inventario.DataBase"
   ```

## Realizar Peticiones HTTP Usando Postman o Similares
Para realizar peticiones HTTP a la aplicación, puedes usar herramientas como Postman. A continuación se muestran algunos ejemplos de peticiones:

- Obtener todas las estancias:
  ```
  GET http://localhost:8080/estancias
  ```

- Crear una nueva estancia:
  ```
  POST http://localhost:8080/estancias
  Content-Type: application/json

  {
    "nombre": "Nueva Estancia",
    "descripcion": "Descripción de la nueva estancia"
  }
  ```

- Actualizar una estancia existente:
  ```
  PUT http://localhost:8080/estancias/{id}
  Content-Type: application/json

  {
    "nombre": "Estancia Actualizada",
    "descripcion": "Descripción actualizada"
  }
  ```

- Eliminar una estancia:
  ```
  DELETE http://localhost:8080/estancias/{id}
  ```
