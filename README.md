# CVDS-LAB05

# Diferencia entre metodos get y post


**20) Diferencia observada:** Cambio en la url.


**El método get** envia los atributos de forma visible en un request realizado a un servidor ejemplo Url:

    https://www.youtube.com/?gl=CO&hl=es-419

gl es visible y su valor es: CO
hl es visible y su valor es: es-419

**El método post** envia los atributos de forma oculta en un request realizado a un servidor, la ventaja del método post es la ocultación de la información.

**Métodos similares**

Get se usa para solicitar datos de un recurso especifo.
Post se usa para enviar datos a un servidor para crear / actualizar un recurso.
Put se usa para enviar datos a un servidor para crear / actualizar un recurso.
Head es casi idéntico a GET, pero sin el cuerpo de respuesta
Delete elimina el recurso especificado.

*Fuente:* https://www.w3schools.com/tags/ref_httpmethods.asp.

**21)**

La clase service realiza una conexion con el dominio jsonpalceholder.typicode.com a través de un objeto URLConnection posteriormente, recibe datos Json que y los Convierte en Gson guardandolos en objetos de tipo Todo.La información es presentada como html para que el navegador la reconozca. Para esto se prestan los servicios de los métodos todoToHTMLRow y todosToHTMLTable.










