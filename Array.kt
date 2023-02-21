fun main() {
    // Creamos un array de cadenas
    val colores = arrayOf("rojo", "verde", "azul")

// Obtenemos el tamaño del array
    val tamaño = colores.size // tamaño = 3

// Obtenemos el segundo elemento del array
    val segundoElemento = colores.get(1) // segundoElemento = "verde"

// Asignamos un nuevo valor al primer elemento del array
    colores.set(0, "amarillo") // colores = ["amarillo", "verde", "azul"]

// Agregamos un nuevo elemento al array
    val coloresModificados = colores.plus("blanco") // coloresModificados = ["amarillo", "verde", "azul", "blanco"]

// Eliminamos el último elemento del array
    val coloresModificados2 = colores.dropLast(1) // coloresModificados2 = ["amarillo", "verde"]

}