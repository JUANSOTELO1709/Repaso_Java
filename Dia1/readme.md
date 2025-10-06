# Repaso Intensivo de Java

¡Bienvenido al **PRIMER DÍA** de repaso!  

En este repositorio encontrarás un repaso teórico de Java, comenzando por entender qué es la programación orientada a objetos, cómo configurar tu entorno con la JVM (Java Virtual Machine), y los pilares fundamentales para desarrollar en Java.

## ¿Qué es la Programación Orientada a Objetos (POO)?

La POO es un paradigma de programación que organiza el código modelando el mundo real mediante objetos. Todo se estructura en **clases** y **objetos**, que representan entidades concretas.

### Clase
Una clase es una plantilla o molde que define **atributos** (características) y **métodos** (comportamientos).

```java
public class Persona {
    // Atributos
    int edad;
    String nombre;
    
    // Método
    void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}
```
### Objeto

Un objeto es una instancia de una clase, creada a partir de la plantilla definida.
```java

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Juan";
        p1.edad = 21;
        
        p1.saludar(); // Salida: "Hola, soy Juan"
    }
}
```


### Pilares de la POO

1. Encapsulamiento

El encapsulamiento consiste en ocultar los detalles internos de una clase y restringir el acceso directo a sus atributos, utilizando modificadores de acceso (como private) y proporcionando métodos públicos (getters y setters) para interactuar con ellos.

```java

public class Persona {
    private String nombre;
    private int edad;
    
    // Getter para nombre
    public String getNombre() {
        return nombre;
    }
    
    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Getter para edad
    public int getEdad() {
        return edad;
    }
    
    // Setter para edad
    public void setEdad(int edad) {
        if (edad >= 0) { // Validación
            this.edad = edad;
        }
    }
}

```

2. Herencia

La herencia permite crear nuevas clases basadas en clases existentes, reutilizando y extendiendo su funcionalidad.
3. Polimorfismo

El polimorfismo permite que objetos de diferentes clases respondan al mismo método de manera específica.
4. Abstracción

La abstracción consiste en ocultar los detalles complejos y mostrar solo las características esenciales de un objeto.

