Proyecto creado con IntelliJ IDEA
link youtube: https://www.youtube.com/watch?v=lipk3ZRGC_E

Pasos:

1) Ir a https://start.spring.io/ y descargar proyecto inicio y en dependencia seleccionar web y seleccionar la opcion gradle Project.
2) Abrir intellij y seleccionar la opcion import Project.
3) Seleccionamos el proyecto descargado.
4) Seleccionar la opcion importar desde modelo externo y marcar gradle.
5) marcar solo la opcion "use default gradle wrapper (recommended)" y click en finish.
6) Para arrancar proyecto: Ir a View, Tools Windows -> Gradle.
7) en Panel de Gradle, ir a Task->Application->bootRun doble click y levanta en puerto 8080.
8) Comprobar en navegador: http://localhost:8080/producto/80

La salida de la peticion anterior deberia ser el siguiente JSON:

{"id":80,"nombre":"MacBook Pro 15","precio":195000.0}
