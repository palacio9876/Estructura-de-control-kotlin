fun main() {
// Creamos una lista de números enteros
    val numbers = listOf(1, 2, 3, 4, 5)

// Obtenemos el tamaño de la lista
    val tamaño = numbers.size // tamaño = 5

// Obtenemos el tercer elemento de la lista
    val tercerElemento = numbers.get(2) // tercerElemento = 3

// Agregamos un nuevo elemento a la lista
    val numerosModificados = numbers.plus(6) // numerosModificados = [1, 2, 3, 4, 5, 6]

// Eliminamos un elemento de la lista
    val numerosModificados2 = numbers.drop(2) // numerosModificados2 = [3, 4, 5]

// Encontramos el índice del elemento "4" en la lista
    val indice = numbers.indexOf(4) // indice = 3

// Imprime segun el indice
    println(numbers[4]) // 5
}