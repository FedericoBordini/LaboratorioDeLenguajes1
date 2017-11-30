# LaboratorioDeLenguajes1
pruebas para crear una mi ventana con java

Java lenguaje de programación de propósito general, concurrente y orientado a objetos con la idea de que tenga tan poca dependencia como sea posible. Realizado para que un programador escriba el programa una vez y poder ejecutarlo en cualquier dispositivo lo que quiere decir que no tiene que ser recompilado para funcionar en otra plataforma. A partir del 2012 una de los lenguajes más populares. Su característica principal es que es multiplataforma que quiere decir que puede correr en un sistema operativo Linux, Windows, Unix, Mac, Android, etc. 
Originalmente desarrollado por Sun Mycrosystem (absorbida por la compañía Oracle) y publicado en 1995. Basado en c y c++ aunque te permita trabajar a bajo nivel no es tan completo como estos dos. Esto quiere decir que uno puede hacer prácticamente lo que quiere trabajar a bajo y alto nivel. Las app java son compiladas a bytecode siendo el tipo de instrucción que la maquina virtual espera resivir para después ser compilado a lenguaje de maquina mediante un compilador jit o just in time a la hora de su ejecución (clase java) pudiendo ejecutar en cualquier máquina virtual (jvm) sin importar la arquitectura subyacente. 
La primera compañía dueña de java desarrollo los compiladores, maquinas virtuales y librerías de clases en 1991, siendo publicadas por primera vez en 1995. A partir del 2007 se publico todo bajo la licencia GNU (licencia pública general). Más allá de que costo que lograran volverlo de dominio publico pero con el pasar de los años fueron perdiendo el miedo gracias a la software fundation y richard stalman. 
Java Virtual Machine: 
Para correr cualquier aplicación java se requiere tener instalado el JRE (Java Runtime Enviroment). Luego para desarrollar aplicación es necesario también tener instalado un programa llamado JDK (Java Develoment Kit) que es una maquina virtual ampliada para desarrolladores el cual va a compilar la aplicación que querramos hacer.	
Como se ve en la imagen de abajo funciona por capas: 

Compilar por línea de comando
Compilar:
Para compilar simplemente deberemos ejecutar el comando javac de la siguiente manera sobre un archivo con extensión .java

javac <nombre_del_archivo>.java
Luego de correr, si no hay errores, va a generar el mismo archivo pero con la extensión .class 
Ejecución:
Para java, debemos primero compilar el código, para después poder ejecutarlo, con el siguiente comando apuntando solo al combre de la clase sin extención
java <nombre_del_archivo> 
Cuestiones a tener en cuenta:
1) Para poder ejecutar los comandos javac y java desde cualquier ubicación en la terminar es necesario tener java entre las variables de entorno del sistema. En su defecto uno debería ejecutar estos comandos pero desde la ubicación absoluta desde donde esta o uno los quiere usar. 
2) El uso de paquetes cuando uno compila desde la linea de comandos, es una cuestión a conocer, y a considerar, ya que para compilarlo y ejecutarlo vamos a necesitar conocer su ubicación dentro del mismo.

A continuación les comparto algunos links que hablan del tema con mayor detalle.

https://stackoverflow.com/questions/10546720/how-to-compile-packages-in-java
https://stackoverflow.com/questions/19382593/how-to-compile-java-package-structures-using-javac

Aplicaciones visuales (modulo 3)
Son como aplicación de escritorio, son las que interactuamos con un entorno amigable, cuando trabajamos con ventanas o diferentes componentes como botones, grillas, imágenes, etc. Justamente dispone un ámbito visual. Justamente el hola mundo no tiene un ámbito visual y por otro lado el campus tiene un ámbito visual pero es una app web corriendo por una aplicación de navegación el cual es justamente una aplicación de escritorio visual, otro ejemplo es el explorador de carpetas o archivos, hay que asociarlo a las app que son nativas del sistemas operativos de computadoras (Windows, Linux, mac) que tiene una gráfica, un gwi, una ventana gráfica,  etc.
 Existen app visuales del sistema operativo y las app web, las primeras funcan sobre el sistema operativo, interactúa con puertos que tenga el hardware, que desde web es más complicado que interactúe. 
Las llamadas aplicaciones de escritorio, son todas aquellas aplicaciones que corren en el sistema operativo. Las que tienen sus propias ventanas. Las webs no son aplicaciones de escritorio, justamente son aplicaciones WEB que corren sobre un Explorador de Internet ( Chrome, Firefox, Internet Explorer ).
El explorador de internet si es una aplicación de escritorio, pero que muestra la aplicación web, la aplicación web no se ejecuta en el sistema operativo si no en el servidor web, y viven solamente dentro del explorador web.
Otro ejemplo de aplicación del sistema operativo que no es aplicación de escritorio, son los servicios, como pueden ser el servidor web apache, y/o un motor de base de datos MySQL.
El motor de base de datos es una aplicación que no es de escritorio, ahora si, podemos apoyarnos en una aplicación de escritorio como MySQL Workbench para trabajar sobre el motor de base de datos. Ahi la aplicación de escritorio es el Workbench, y no, el motor de base de datos en si mismo.

Swing (MODULO 4)
Api: interfaz de programación de aplicaciones utilizadas generalmente en la bibliotecas (librerias) de programación http://docs.oracle.com/javase/7/docs/api/overview-summary.html contiene toda la descripcion completa y la documentación  de que contiene cada una de las clases disponibles y los paquetes y demás para diferentes propósitos. 
https://docs.oracle.com/javase/7/docs/api/javax/swing/package-summary.html esta es la libreria de swing  





Módulo 5 - Ventanas con SWING
La clase JFrame para manejar ventanas:
Es parte del paquete swing que viene del paquete awt que es un paquete mas viejo de manejo de librerías graficas y swing es el moderno y javax es el paquete dentro del jdk que usamos para desarrollar. 
Jframe proporciona operaciones para manipular ventanas asia el usuario. No hay que olvidar que va a ser una clase y hay que ver su documentación https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html 
 
En la imagen esta todo  heredado de todo lo que viene de antes.

Constructores: estos dos son lo que vamos a usar: 
JFrame()
JFrame(String titulo)


Acciones de cierre posibles de configurar son:
JFrame.EXIT_ON_CLOSE: Abandona aplicación.
JFrame.DISPOSE_ON_CLOSE: Libera los recursos asociados a la ventana.
JFrame.DO_NOTHING_ON_CLOSE: No hace nada.
JFrame.HIDE_ON_CLOSE: Cierra la ventana, sin liberar sus recursos.






¿Qué es un evento? ¿Cómo manejarlos con la interfaz ActionLisener? MODULO 9
Un evento es un suceso que ocurre como consecuencia de la interacción del usuario con la interfaz gráfica. Por ejemplo pulsar un botón, desplazar una barra, activar un chebox, mover un ventana, etc. 
ActionListener es una interfaz, que se usa para detectar y manejar estos eventos desde el código de java.
Una interfaz en Java es una colección de métodos abstractos y propiedades constantes. 
En las interfaces se especifica qué se debe hacer pero no su implementación. Serán las clases que implementen estas interfaces las que describan la lógica del comportamiento de los métodos.
Por tal, para el caso del ActionListener se debe de implementar todos los métodos que ella posee, en este caso solo uno, que es el actionPerformed(ActionEvent e) Es una colección de métodos abstractos. 
Java Doc: https://docs.oracle.com/javase/9/docs/api/java/awt/event/ActionListener.html
Vos siempre tenes que darle el comportamiento que quieras que haga en action lisener. Hay que buscarlo con doble shift y buscar ActionListener.java 
