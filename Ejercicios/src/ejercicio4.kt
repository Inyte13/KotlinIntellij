fun printTemp(
  valorInicial: Double,
  unidadInicial: String,
  unidadFinal: String,
  formula: (Double) -> Double
) {
  val valorFinal = String.format("%.2f", formula(valorInicial))
  println("$valorInicial degrees $unidadInicial is $valorFinal degrees $unidadFinal")
}
fun main() {
  val celsiusAFahrenheit = { celsius: Double -> (9 * celsius) / 5 + 32}
  val kelvinACelsius = { kelvin: Double -> kelvin - 273.15}
  val fahrenheitAKelvin = { fahrenheit: Double -> 5 * (fahrenheit - 32) / 9 + 273.15}

  // Lo mismo pero mas "legible"
  // fun celsiusAFahrenheit(c: Double) = (9 * c) / 5 + 32
  // fun kelvinACelsius(k: Double) = k - 273.15
  // fun fahrenheitAKelvin(f: Double) = 5 * (f - 32) / 9 + 273.15
  printTemp(27.0,"Celsius","Fahrenheit",celsiusAFahrenheit)
  printTemp(350.0,"Kelvin","Celsius",kelvinACelsius)
  printTemp(10.0,"Fahrenheit","Kelvin",fahrenheitAKelvin)
}
