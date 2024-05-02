# Reto Canvia

## La conexión a base de datos
spring.datasource.url=jdbc:h2:file:/data/canvia

spring.datasource.username=sa

spring.datasource.password=password

Url para acceder:

http://localhost:8080/h2-console

## Postman
Postman con los endpoints creados: [RetoC☺anvia.postman_collection](RetoCanvia.postman_collection.json)

Capturas de ejemplo:

Registrar Estudiante con éxito
![alt text](./images/registrar-estudiante-ok.PNG)

Registrar Estudiante con el mísmo código
![alt text](./images/registrar-estudiante-error.PNG)

Obtener Estudiante con éxito
![alt text](./images/obtener-estudiante-ok.PNG)

Obtener Estudiante con código que no existe
![alt text](./images/obtener-estudiante-error.PNG)

Registrar Notas con éxito
![alt text](./images/registrar-notas-ok.PNG)

Registrar Notas con código de estudiante que no existe
![alt text](./images/registrar-notas-error.PNG)

Obtener Promedio con éxito
![alt text](./images/obtener-avg-ok.PNG)

Obtener Promedio con código de estudiante que no existe
![alt text](./images/obtener-avg-error.PNG)

