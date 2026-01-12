# 🔍 Cuestiones de análisis 
---

### 🤝 ¿Qué tipo de relación se define en el diagrama UML entre Pedido y Producto?
Es una ***composición***, aparte de que el pedido está hecho de productos, el robo negro de la relación nos lo desvela, la agregación se representa con un rombo blanco

### 🔢 ¿Qué significa la cardinalidad indicada en esa relación?
***En cuanto a los productos,*** cada producto debe estar en un pedido y no puede estar en más de uno a la vez.
***Los pedidos*** pueden estar vacíos y pueden contener un número ilimitado de productos.

### 🤔 ¿Qué otros tipos de cardinalidad se pueden definir en UML?  Investiga y explica al menos tres ejemplos distintos.
* 1-*, 1 a muchos, como la explicada anteriormente pero con la condición de que mínimo tiene que haber una unidad.
* 0-1, puede ser nulo o tener una sola unidad, no puede tener más.
* m-n, rango específico, por ejemplo 4-9, personalizado, para situaciones concretas que requieran de estas cardinalidades.

### 🆚 ¿Qué diferencias existen entre una asociación, una agregación y una composición?
1. **Asociación** :
Las dos clases están conectadas pero son totalmente independientes la una de la otra 
2. **Agregación** :
Una de las dos clases es la principal, la otra es una parte de ella, sin embargo, esa parte puede existir aunque la principal desaparezca, por ejemplo empresa y empleados
3. **Composición** :
Como en la agregación, hay una clase principal y otra que forma parte de ella, pero esta vez la parte depende absolutamente de la principal.



