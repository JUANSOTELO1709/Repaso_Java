# 🧮 Clase Día 4 – Arrays y Multiplicación de Matrices en Java

## 📘 Objetivo  
Aprender a manejar **arrays (arreglos)** y **matrices** en Java, comprendiendo su estructura, lógica de acceso, y aplicando los conocimientos en la **multiplicación de dos matrices**.

---

## 🔹 ¿Qué es un array?  
Un **array** es una estructura de datos que almacena un conjunto de elementos **del mismo tipo** (por ejemplo, todos enteros o todos decimales).  

Permite acceder a cada elemento por su **índice**, que siempre comienza en **0**.

### Ventajas de los arrays:
- Permiten almacenar muchos datos del mismo tipo en una sola variable.  
- Se accede rápidamente a cualquier elemento usando el índice.  
- Se pueden recorrer con bucles para procesar la información.

---

## 🔹 Arrays bidimensionales (Matrices)  
Una **matriz** es un array dentro de otro array.  
En lugar de una sola dimensión, tiene **filas y columnas**.

Representa datos de forma tabular, donde cada elemento tiene dos índices:  
uno para la **fila** y otro para la **columna**.

Ejemplo visual:



Acceder a un valor significa indicar su posición en la tabla:  
por ejemplo, “fila 2, columna 3”.

---

## 🔹 Propiedad `.length`  
El atributo `.length` se usa para conocer el tamaño de un array o matriz.

- En un array unidimensional indica cuántos elementos contiene.  
- En una matriz bidimensional:  
  - `matriz.length` → número de **filas**.  
  - `matriz[0].length` → número de **columnas** (de la primera fila).  

Esto permite recorrer arreglos dinámicamente sin depender de un número fijo.

---

## 🔹 Multiplicación de matrices  

Para multiplicar dos matrices \(A\) y \(B\):

- El número de **columnas de la primera matriz** debe coincidir con el número de **filas de la segunda**.  
- Cada elemento del resultado se obtiene multiplicando una **fila de A** por una **columna de B** y sumando los productos.

Fórmula general:
\[
C[i][j] = A[i][1]×B[1][j] + A[i][2]×B[2][j] + A[i][3]×B[3][j]
\]

---

## 🔍 Explicación de los bucles

| Variable | Significado | Recorre |
|-----------|-------------|----------|
| `i` | Filas de la primera matriz | De arriba hacia abajo |
| `j` | Columnas de la segunda matriz | De izquierda a derecha |
| `k` | Combina cada elemento de la fila `i` con el correspondiente de la columna `j` | En cada cálculo de celda |

Cada celda del resultado acumula la suma de los productos entre los elementos correspondientes de la fila y la columna.

---

## 🧠 Ejemplo de cálculo manual  

Para calcular el primer elemento del resultado:

\[
(1×9) + (2×6) + (3×3) = 30
\]

El mismo procedimiento se repite para todas las combinaciones de filas y columnas.  
De este modo se completa toda la matriz resultante.

---

## 💡 Notas importantes  

- Antes de usar una matriz, se debe definir su tamaño o inicializar sus valores.  
- En la multiplicación, se inicializa el valor del resultado en **0** antes de acumular las operaciones.  
- `.length` permite recorrer las matrices sin depender de un tamaño fijo.  
- Los arrays y matrices son fundamentales para trabajar con **datos estructurados y operaciones repetitivas**.  

---

## ✅ Conclusiones  

- Aprendiste qué son los **arrays unidimensionales y bidimensionales**.  
- Comprendiste cómo acceder a los elementos mediante **índices**.  
- Entendiste el uso de `.length` para recorrer arreglos dinámicamente.  
- Lograste aplicar la **lógica de bucles anidados** en una operación matemática real.  
- Este tema combina **matemática** y **programación estructurada**, pilares fundamentales antes de avanzar a la Programación Orientada a Objetos (POO).  
