# Lab 05

### Instrucciones
- Grupal
- Tiempo 110 minutos

### Objetivos
- Interpretar e implementar Requerimientos Funcionales descritos en un Caso de Uso.

### Contexto

Muchas veces nos vemos en la necesidad de traducir palabras de un lenguaje a otro. Esta vez implementaremos un traductor de español a inglés.

### Requerimientos
#### Requerimientos Funcionales
- Como usuario podré ingresar a la aplicación sin necesidad de estar registrado.
- Como usuario podré ingresar una frase o texto a ser traducido.

#### Requerimientos No Funcionales
- La longitud máxima de caracteres de una frase será de 500 caracteres.
- La cantidad máxima de usuarios concurrentes son 80.
   - Crear Test de Stress que pruebe 80 usuarios conectados al mismo tiempo.
- El tiempo máximo de traducir cada frase no será mayor a 400ms.
   - Medir el tiempo de respuesta de los test.
   
### Caso de Uso
- System:  CS-Translator
- Actor:   User
- Caso de Uso:    CU001 Traducir de Español a Inglés
   - El usuario ingresa a la aplicación
   - La aplicación solicita al usuario el texto a traducir.
   - El usuario ingresa el texto
   - La aplicación muestra el texto traducido 