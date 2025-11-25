fun main() {
  // listOf, listas inmutables
  val numeros = listOf(0, 1, 2, 3, 4)
  // val numeros: List<Int> = listOf(0, 1, 2, 3, 4) documentar para el lado de la variable
  // val numeros = listOf<Int>(0, 1, 2, 3, 4 ) explícito


  // first
  numeros.first() // Duelve el primer value

  // last
  numeros.last() // Devuelve el último value

  // mutableList, listas mutables
  val nombres = mutableListOf("Sara", "Aitana", "Kyr4", "Paula")
  nombres.add("Oriana") // Inserta el value, al final
  nombres.add(0,"Adèle") // Inserta el value en el index indicado
  nombres.isEmpty() // Nos dice si está vacía
  nombres.isNotEmpty() // Nos dice si no está vacía
  println(nombres)





}