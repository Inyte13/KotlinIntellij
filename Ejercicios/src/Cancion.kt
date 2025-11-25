class Cancion(
  val titulo: String,
  val artista: String,
  val datePublicacion: String,
  val reproducciones: Long) {
  val isPopular: String
    get() = if(reproducciones<1_000) "Poco popular" else "Popular"

  override fun toString(): String {
    return "$titulo, interpretada por $artista, se lanzó en $datePublicacion"
  }
  // Lo mismo pero más corto
  // override fun toString() = "$titulo, interpretada por $artista, se lanzó en $datePublicacion"
}

fun main() {
  val c1 = Cancion("Y ahora qué???", "Jimena", "30/11/23", 615_625)
  println(c1)
}