# APAW. ECP1. Patrones de Diseño 
> ##### [Máster en Ingeniería Web por la Universidad Politécnica de Madrid (miw-upm)](http://miw.etsisi.upm.es)
> ##### Asignatura: *Arquitectura y Patrones para Aplicaciones Web*

### Buscar, comprender , explicar y realizar un ejemplo propio del funcionamiento del patrón strategy.

* Explicacion
Este patrón permite que la implementación de un algoritmo sea delegado a las subclases de tal manera que cada subclase aporta una forma diferente de realizar el algoritmo. También se puede aplicar mediante composición, para cambiar en tiempo de ejecución el algoritmo de un objeto.

* Ejemplo
Para hacer un ejemplo, he creado una clases abstracta UserStrategy heredando de User para definir el método abstracto showPersonalData() que busca mostrar el nombre y el cumpleaños del user. Este método es implementado por dos clases concretas UserNameBirthdate y UserBirthdateName; donde cada clase mostrará en un orden diferente el nombre y la edad: UserNameBirthdate muestra primero el nombre y luego la edad y UserBirthdateName primero la edad y luego el nombre.