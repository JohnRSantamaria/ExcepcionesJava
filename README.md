# Java Excepciones (Errores)

#### pila de ejecucion : _Lugar donde se ejecuta el codigo de Java._

```java
public class Flujo {

  public static void main(String[] args) {
    System.out.println("Ini do main");
    metodo1();
    System.out.println("Fim do main");
  }
  public static void metodo1(){
    System.out.println("Ini do metodo1");
    metodo2();
    System.out.println("Fim do metodo1");
  }
  public static void metodo2(){
    System.out.println("Ini do metodo2");
    for(int i =1; i<= 5; i++){
      System.out.println("i");
    }
    System.out.println("Fim do metodo2");
  }
}
```

Una pila de Java es parte de la _JVM_ y almacena los métodos que se están ejecutando. Además del bloque de código, la pila almacena las variables y referencias de ese bloque. Entonces, la _JVM_ organiza la ejecución y sabe exactamente qué método se está ejecutando, que es siempre el método en la parte superior de la pila. La _JVM_ también sabe qué otros aún deben ejecutarse, que son precisamente los métodos que continúan.

**Debug** : Puede verificar los errores del codigo por medio del modo debug.

### Try Catch en JAVA

```java
  try{
    //Realiza operacion
  }
    //NombreDeElError↓ Declaramos↓
  catch(ArithmeticException exception){
    sout(exception.getMessage());
    expection.printStackTrace();
  }

```

En Java podemos hacer varios catch

```java
  try{
    //Realiza operacion
  }
    //NombreDeElError↓ Declaramos↓
  catch(ArithmeticException exception){
    sout(exception.getMessage());
    expection.printStackTrace();
  }
  catch(NullPointerException exception){
    sout(exception.getMessage());
    expection.printStackTrace();
  }

```

O tambien

```java
  try{
    //Realiza operacion
  }
    //NombreDeElError↓ Declaramos↓
  catch(ArithmeticException | NullPointerException exception){
    sout(exception.getMessage());
    expection.printStackTrace();
  }

```

#### Creando expeciones

Throwable = Errors y Exeptions  
Exeptions = RuntimeException,
RuntimeException = ArithmeticException, _...Otras excepciones_

```java
public class StockInsuficienteException extends RuntimeException {
 //
}


public void RealizaCompra(Producto producto) {
    //otras instrucciones aquí..
    if (totalDeProductosEnStock < 0) {
        throw new StockInsuficienteException();
    }
}
```

###### ○ _Lanzar una exception que tenga que ser manejada_

```java
public class StockInsuficienteException extends Exception {

    public StockInsuficienteException (String msg) {
        super(msg);
    }
}

public void RealizaCompra(Producto producto) throws StockInsuficienteException {
    //otras instrucciones aquí..
    if (totalDeProdutosEnStock < 0) {
        throw new StockInsuficienteException("Stock insuficiente");
    }
}
```

1. Existe una gran jerarquía de clases que representan excepciones. Por ejemplo, _ArithmeticException_ es hija de _RuntimeException_, que hereda de _Exception_, que a su vez es hija de la clase de excepciones más ancestral, _Throwable_. Conocer bien esta jerarquía significa saber cómo usar las excepciones en su aplicación.

2. _Throwable_ es la clase que necesita ser extendida para poder lanzar un objeto en la pila _(usando la palabra reservada throw)_

3. La jerarquía que comenzó con la clase _Throwable_ se divide en excepciones y errores. Las excepciones se utilizan en códigos de aplicación. Los errores son utilizados exclusivamente por la máquina virtual. Las clases que heredan de _Error_ se utilizan para informar errores en la máquina virtual. Los desarrolladores de aplicaciones no deben crear errores que hereden de Error

4. _StackOverflowError_ es un error de la máquina virtual para informar que la pila de ejecución no tiene más memoria.

5. Las excepciones se dividen en dos grandes categorías: las que el compilador comprueba obligatoriamente y las que no. Los primeros se denominan _checked_ y se crean al pertenecer a una jerarquía que no pasa por _RuntimeException_. Los segundos son _unchecked_ y se crean como descendientes de _RuntimeException_.

#### Para atrapar de manera generica

```java
try {
} catch (Exception e) {
}
```

Se lanzan con

```java
throw new MiExpecion("tengo un error");
```

## Metodo finally

_Se ejecuta siempre_

```java
public class TestConexion {
    public static void main(String[] args) {
        Conexion con = new Conexion();

        try {
            con.leerDatos();
        } catch (IllegalStateException ex) {
            ex.printStackTrace();
        } finally{
            con.cerrar();
        }
    }
}
```

Otra forma de declarar Try Catch

```java
try (Cone)
```

## Try With results

_Con auto close able_

```java
public class Conexion implements AutoCloseable {
   public Conexion() {
       System.out.println("Abriendo conexion");
   }

   public void leerDatos() {
       System.out.println("Recibiendo datos");
       throw new IllegalStateException();
   }

   public void cerrar() {
       System.out.println("Cerrando conexion");
   }
//Siempre tiene que cerrar no puede quedar abierto
    @Override
    public void close() throws Exception {
        cerrar();
    }
}


public class TestMiException {
    public static void main(String[] args) throws  Exception  {

        try (Conexion con = new Conexion()){
                con.leerDatos();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }
}

```
