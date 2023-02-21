fun main() {
// Creamos un conjunto de números enteros
    val numeros = setOf(1, 2, 3, 4, 5)

// Verificamos si el conjunto contiene el número 3
    val contieneTres = numeros.contains(3) // contieneTres = true

// Creamos un conjunto vacío de cadenas
    val conjuntoVacio = emptySet<String>()

// Creamos un conjunto mutable de cadenas
    val conjuntoMutable = mutableSetOf("manzana", "banana", "cereza")

// Agregamos una nueva cadena al conjunto mutable
    conjuntoMutable.add("durazno") // conjuntoMutable = ["manzana", "banana", "cereza", "durazno"]

// Eliminamos una cadena del conjunto mutable
    conjuntoMutable.remove("banana") // conjuntoMutable = ["manzana", "cereza", "durazno"]

}