fun main() {
  val numeros = listOf(0, 1, 2, 3, 4, 5, 6)

  // map

  // filter
  val menores4 = numeros.filter { numero -> numero < 4 }
  // numeros.filter { value -> }

  // filterIndexed
  val menores4I = numeros.filterIndexed { _,numero -> numero < 4 }
  // numeros.filter { i, value -> }





}