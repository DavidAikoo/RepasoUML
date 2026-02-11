# UML: Diagramas de Clases: Agregación en Java

## Descripción:

Este proyecto contiene:

- Reporte teorico sobre los diagramas de clases UML
- Explicación de relaciones entre clases
- Ejemplo practico que implementa UML en código

El objetivo es entender como las relaciones UML funcionan en POO

Ejemplo:

```
+----------------------+
|      Universidad     |
+----------------------+
| - nombre : String    |
| - estudiantes :      |
|   ArrayList<Estudiante> |
+----------------------+
| + Universidad(nombre:String) |
| + agregarEstudiante(e:Estudiante) : void |
| + mostrarEstudiantes() : void |
+----------------------+
           ◇ 1
           |
           | 0..*
           |
+----------------------+
|      Estudiante      |
+----------------------+
| - nombre : String    |
+----------------------+
| + Estudiante(nombre:String) |
| + getNombre() : String |
+----------------------+
```
