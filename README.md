## Verificación y Validación
# Escritura de test parametrizados para el problema de las secuencias de Collatz

Plantilla de proyecto de IntelliJ para resolver el 
[problema 14 de Project Euler](https://projecteuler.net/problem=14). 


### Secuencias de Collatz

Se define la siguiente secuencia iterativa sobre el dominio de los enteros positivos:

 - _n_ → _n_ / 2   (si _n_ es par)
 - _n_ → 3 _n_ + 1 (si _n_ es impar)
    
Utilizando dicha definición y empezando en 13, se genera la siguiente secuencia:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1.

Puede comprobarse que esta secuencia (que comienza en 13 y termina en 1), contiene
 10 términos. Pese a que no ha sido probado aún (Conjetura de Collatz), se cree
 que las secuencias generadas empezando en cualquier número terminan en 1.

¿Qué número inicial, por debajo de un millón, genera la secuencia más larga?

**Nota**: Una vez la secuencia ha comenzado, es posible que algunos términos
superen el límite de un millón.

### Tareas

1. Descargad o clonad el proyecto «unizar-vv-collatz» de GitHub.

2. En proyecto suministrado en este repositorio no está configurado todavía para utilizar JUnit.

   Para configurarlo:
   - Project Structure | Libraries | + (New Project Library) | From Maven…
   - org.junit.jupiter:junit-jupiter:6.0.3
   - Seleccionad _Transitive dependencies_, _Sources_, _JavaDocs_ y _Annotations_
   - Aceptad que se añada al módulo unizar-vv-collatz.
   - En _Modules_, estableced su ámbito como _Test_.

3. Añadid también la biblioteca Hamcrest por si queréis escribir test utilizando  la aserción `assertThat`.
Para ello, repetid los pasos anteriores con las coordenadas `org.hamcrest:hamcrest:jar:3.0`.

 
 4. Clase `SecuenciasCollatzTestLongitud`
    - Diseñad pruebas para el método `longitud`.
      - Basaos, por una parte, en la secuencia de ejemplo del enunciado. 
        Se trata de una única secuencia, pero podemos distinguir 9 subsecuencias
        más que terminan en 1.
      - Completad los casos de prueba calculando _a mano_ las longitudes de las
        secuencias iniciadas por los números del 1 al 10.
    - Escribid un test parametrizado en el que ir incluyendo las pruebas diseñadas.
      Incluirlas de una en una y observad como va aumentando la cobertura del
      código conforme las vais añadiendo.
      
 5. Clase `IniciadorSecuenciaMasLargaTest`
    - Diseño de pruebas basadas en la especificación (basaos en las longitudes
      de las secuencias iniciadas por los números del 1 al 10 que habéis
      calculado antes).
 
 6. Resto de métodos
    - Añadid pruebas hasta alcanzar una cobertura del 100% en modo _tracing_.