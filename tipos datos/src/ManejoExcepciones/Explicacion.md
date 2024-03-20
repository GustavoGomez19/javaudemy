# Manejo de excpeciones:
* Son eventos anomalos que ocurren durante la ejecución de un prorgrama y pueden alterar el orden de ejecución del mismo
* Son eventos que deben ser manejados de una manera adecuada para garantizar la ejecución del programa

# Importancia de las excepciones:
* Son elementos importantes para la construcción de programas robustos, su importancia radica en varios aspectos:

# 1. Manejo de errores de manera estructurada:
  * Las excepciones brindan una manera estructurada de manejar errores y situaciones excepcionales. Esto permite separar
  * el codigo de manejo de errores del codigo funcional, lo resulta en un codigo más limpio y fácil de entender.

# 2. Mejora la robustez y la confiabilidad:
  * Al anticipar y manejar excepciones de manera adecuada se puede hacer que una aplicación sea más eficiente, resistente
  * y confiable. Esto hace que le programa se ejecute de manera natural y sin interrupciones.

# 3. Retroalimentación al usuario:
  * Mediante el uso de las excepciones se pueden manejar mensajes de error significativos y detallados al usuario, lo que
  * facilita la comprensión de lo que salió mal durante la ejecución de la aplicación y permite una fácil correción.

# 4. Flexibilidad y compatibilidad:
  * El manejo adecuado de las excepciones permite a los desarrolladores adaptar el comportamiento de la aplicación según
  * sean las circunstancias. Significa que se puede cambiar la forma en que se manejam las excepciones en diferentes partes
  * del programa para adpatarse a los requisitos de cada sección.

# ---------------------------- # ---------------------------- # ---------------------------- # ----------------------------

# Tipos de excepciones:
* Las excepciones se dividen en tres categorías principales las cuales heredan de la clase base Throwable:

# 1. Checked exceptions:
  * Son excepciones que se deben declarar en la firma del método o capturar explicitamente en bloque try-catch.
  * Si una excepción comprobada no se maneja correctamente, el código no se compilará. Estas excepciones heredan
  * de la clase Exception

# 2. Unchecked exception:
  * Son excepciones que no están obligadas a manejarse explicitamente. Estas excepciones ocurren durante la ejecución
  * del programa y no se requiere que sea declarada en la firma del método o capturadas mediante el bloque try-catch.
  * Se heredan de la clase RuntimeException

# 3. Erros:
  * Son problemas graves que normalmente están por fuera del alcance del programador y no deben manejarse explicitamente.
  * Estos errores indican problemas serios que deberian detener la ejecución del programa. Se heredan de la clase Error

# ---------------------------- # ---------------------------- # ---------------------------- # ----------------------------

# Clases de excepciones:

# 1. Checked Exceptions:
  * IOException: Indica un error en una operación de entrada o salida (E/S).
  * FileNoFoundException: Se lanza cuando se intenta acceder a un archivo que no existe en el sistema.
  * ParseException: Ocurre al intentar analizar una cadena para convertirla en un formato especifico.
  * SQLException: Representa una excepción específica de  la base de datos que ocurre durante la interacción
    con una base de datos.

# 2. Unchecked Exceptions:
  * RuntimeException: Clase base para excepciones no comprobadas.
  * NullPointerException: Ocurre cuando intenta acceder a objeto que es null.
  * ArrayIndexOutOfBoundException: Se lanza cuando se intenta acceder a un indice fuera del rango de un array.
  * ArithmeticException: Indica une error en una operación aritmética, como la división por 0.
