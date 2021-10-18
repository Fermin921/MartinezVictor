### **¿Que es una colección en Java?** 
Las colecciones en java son almacenes únicamente de objetos. Anteriormente, en este lenguaje de programación, hemos visto los arrays o las matrices. En ellos, no solo podíamos almacenar objetos, sino también datos primitivos.
La diferencia fundamental entre las colecciones y los arrays, es que, mientras que los arrays tienen un tamaño fijo, las colecciones en java son totalmente dinámicas. Esto quiere decir que, podrán crecer o disminuir según nuestras necesidades.  
  
  
  ### **¿Qué es el "Java Collection Framework"?**
Java Collection Framework es como se conoce a la librería de clases contenedoras de Java que podemos encontrar en el paquete estándar java.util. Estas clases sirven para almacenar colecciones de objetos, como listas, conjuntos, mapas, …En Java podemos trabajar con clases genéricas, para ello se utiliza <y >. A este mecanismo se le conoce como genericidad.    
  Las colecciones y los arreglos son similares en que ambos contienen referencias a objetos y se pueden administrar como un grupo. Sin embargo, a diferencia de las matrices, no es necesario asignar una determinada capacidad a las colecciones cuando se crean instancias. Las colecciones también pueden aumentar y reducir su tamaño automáticamente cuando se agregan o quitan objetos. Las colecciones no pueden contener elementos de tipo de datos básicos (tipos primitivos) como int, long o double; en su lugar, contienen clases de envoltura como Integer, Long o Double.  
  Hay tres tipos de colecciones, cada uno con un interfaz común y diferentes implementaciones. Las diferentes implementaciones de un mismo interfaz realizan la misma tarea aunque la diferencia está en que unas implementaciones son más rápidas en algunas operaciones y más lentas en otras:

* **Conjunto** – los elementos no tienen un orden y no se permiten duplicados.Se define el interfaz Set<E>. Además, cada elemento sólo aparece una vez, al contrario que en una lista, donde podían repetirse.  Podemos utilizar las siguientes implementaciones:  HashSet<E> (implementación con tabla hash), LinkedHashSet<E> (tabla hash +doble lista enlazada), TreeSet<E> (implementación con árbol)
   * **El método add(·) añade una referencia a un objeto al conjunto**  
   * **Un Set no tiene los métodos get(·) e indexOf(·), los elementos no están en ninguna posición en particular. Básicamente, con un conjunto lo que podemos hacer es añadir elementos, eliminarlos y preguntar si un elemento pertenece al conjunto**  
  * **Un Set no tiene los métodos get(·) e indexOf(·), los elementos no están en ninguna posición en particular. Básicamente, con un conjunto lo que podemos hacer es añadir elementos, eliminarlos y preguntar si un elemento pertenece al conjunto**
   * **Usa size() para saber el tamaño de una lista** 
* **Listas** –Llamamos lista a cualquier colección de objetos ordenados por posición, como en un array. En una lista podemos añadir elementos, acceder a ellos por su posición en la lista, eliminar elementos de la lista y otras operaciones, como vaciar la lista, copiarla, etc. En una lista puede haber objetos repetidos, es decir, objetos que son iguales según el método equals() de su clase.  Se utiliza el interfaz List<E>. Podemos utilizar las siguientes implementaciones: ArrayList<E> (acceso rápido), LinkedList<E>(inserciones/borrado rápidas), Stack<E> (pila), Vector<E> (obsoleto)
  * **El método add(·) añade una referencia a un objeto al final de la lista**
  * **Usa size() para saber el tamaño de una lista**  
  * **El método get(int) sirve para acceder a cualquier elemento de la lista, por su posición**  
  * **Usa el método contains(·) para preguntarle a la lista si contiene el objeto dado**
  * **El método indexOf(·) me indica la posición de la primera ocurrencia del objeto en la lista**
  

* **Diccionario o Matriz asociativa** – cada elemento tiene asociado una clave que usaremos para recuperarlo.  Se utiliza el interfaz Map<K,V>. Podemos utilizar las siguientes implementaciones: HashMap<K,V>, TreeMap<K,V>, LinkedHashMap<K,V>
    * **hashCode()
Este método, que se suele implementar en todas las clases, devuelve un entero que actua como identificador para un objeto. Es un metodo compatible con equals, de manera que si objeto1.equals(objeto2) devuelve ‘true’, entonces objeto1.hasCode() devuelve el mismo valor que objeto2.hashCode()
Algunas implementaciones de listas, conjuntos y mapas utilizan hashCode(·) en lugar de equals(·) para saber si dos objetos son iguales**  
