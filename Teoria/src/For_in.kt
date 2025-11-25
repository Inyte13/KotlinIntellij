fun main () {
  // Equivalente a for of en JS
  val nombres = arrayOf("Mafer", "Lucía", "Camila", "Paula", "Carlos")

  // Recorriendo los values
  for (nombre in nombres) {
    println(nombre)
  }

  // Recorriendo el índice
  for (i in nombres.indices) {
    println("${i}: ${nombres[i]}")
  }

  // Recorriendo el índice y el value
  for ((i, value) in nombres.withIndex()) {
    println("${i}: $value")
  }
}