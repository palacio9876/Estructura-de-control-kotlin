//haga un algoritmo que calcule el promedio de 3 números
// y si el promedio es mayor a 3.5
// indique que gana la materia, si el promedio es mayor a 2
// y menor o igual a 3.5 entonces indique que puede recuperar
fun main() {
    val num1 = 4.0
    val num2 = 2.0
    val num3 = 4.0

    val prom = (num1 + num2 + num3) / 3

    if (prom > 3.5) {
        println("Gana la materia")
    } else if (prom > 2 && prom<=3.5) {
        println("Puede recuperar")
    } else {
        println("Perdió la materia")
    }
}