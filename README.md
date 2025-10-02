# location


## PUT avec curl

```
curl --header "Content-Type: application/json" \              
--request PUT \
--data '{"debut":"1/9/2025","fin":"2/9/2025"}' \
"http://localhost:8080/cars/AA11BB?rent=true"
```

## Ajout base de données

### Ajout librairie JPA

voir data-jpa dans dependencies : https://github.com/charroux/location/blob/main/build.gradle

### Ajout librairie base de données H2

voir h2 dependencies : https://github.com/charroux/location/blob/main/build.gradle

### Classe Java avec annotation @Entity et &Id

https://github.com/charroux/location/blob/main/src/main/java/com/example/location/data/Car.java

### Interface pour accéder à la base de données

https://github.com/charroux/location/blob/main/src/main/java/com/example/location/data/CarRepository.java

### Création voiture dans le constructeur

https://github.com/charroux/location/blob/main/src/main/java/com/example/location/web/LocationWebService.java

### Activation de la console

https://github.com/charroux/location/blob/main/src/main/resources/application.properties

### Lancement de main

Dans le navigateur : http://localhost:8080/h2-console

Chercher l'adresse de la base dans la console (sdtout) indiquée à : H2 console available at '/h2-console'

Et remplir la chamos JDBC URL dans l(interface de connection)



