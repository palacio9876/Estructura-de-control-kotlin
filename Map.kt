fun main() {
// Creamos un mapa de cadenas a números enteros
    val mapa = mapOf("uno" to 1, "dos" to 2, "tres" to 3)

// Obtenemos el tamaño del mapa
    val tamaño = mapa.size // tamaño = 3

// Verificamos si el mapa contiene la clave "uno"
    val contieneUno = mapa.containsKey("uno") // contieneUno = true

// Verificamos si el mapa contiene el valor 3
    val contieneTres = mapa.containsValue(3) // contieneTres = true

// Obtenemos el valor asociado con la clave "dos"
    val valor = mapa.get("dos") // valor = 2

// Agregamos un nuevo par clave-valor al mapa
    val mapaModificado = mapa.plus("cuatro" to 4) // mapaModificado = {"uno" to 1, "dos" to 2, "tres" to 3, "cuatro" to 4}

// Eliminamos un par clave-valor del mapa
    val mapaModificado2 = mapa.minus("uno") // mapaModificado2 = {"dos" to 2, "tres" to 3}

}