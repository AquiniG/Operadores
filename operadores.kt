fun main() {

    println()

    val a = 10
    val b = 5

    println(a == b)                            // false: 10 é igual a 5?
    println(a > b)                             // true: 10 é maior que 5?
    println(a < b)                             // false: 10 é menor que 5?
    println(a != b)                            // true: 10 é diferente de 5?
    println(a >= b)                            // true: 10 é maior ou igual a 5?
    println(a <= b)                            // false: 10 é menor ou igual a 5?
    println()

    val temIngresso = true
    val temIdadeMinima = false

    println(temIngresso && temIdadeMinima)     // false: "E": as DUAS precisam ser true
    println(temIngresso || temIdadeMinima)     // true: "OU": basta UMA ser true
    println(!temIngresso)                      // false: "NÃO": inverte o valor


}