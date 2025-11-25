fun main() {
  // Arr estático
  val numeros = arrayOf(0, 1, 2, 3, 4)

  // println(numeros) no muestra el arr, muestra la referencia de memoria del arr
  // println(numeros.contentToString())

  // numeros[5], ArrayIndexOutOfBoundsException

  // Reemplaza el value
  numeros[2] = 7 // [0, 1, 7, 3, 4]

  // size === lenght
  numeros.size

  // Recorriendo con forEach
  numeros.forEach { num -> println(num) }


}