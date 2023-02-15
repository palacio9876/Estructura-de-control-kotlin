//- Basado en el siguiente menú
//
//    1. Saludar
//    2. Pedir Nombre de una Persona
//    3. Sumar 2 Números
//
//    Haga un algoritmo que dependiendo del código ingresado, realice la acción correspondiente.

fun main(){
    val menu="""
    MENU DE OPCIONES
    1. Saludar
    2. Pedir Nombre de una Persona
    3. Sumar 2 Números
    Ingrese una opción :"""

    print(menu)
    val opcion=readLine()?.toInt()
    when (opcion) {
        1 -> println("Hola!")
        2 -> {
            print("Ingresa el nombre de una persona: ")
            val name = readLine()
            println("Hola, $name")
        }
        3 -> {
            print("Ingrese el primer número: ")
            val num1 = readLine()!!.toInt()
            print("Ingrese el segundo número: ")
            val num2 = readLine()!!.toInt()
            val sum = num1 + num2
            println("La suma de los números $num1 y $num2 es: $sum")
        }
        else -> println("Opción inválida")
    }
}