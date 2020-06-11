import java.math.BigDecimal
import java.math.RoundingMode

class SpaceAge(private val seconds: Int) {
    private val oneYearOnEarth: Double = 31557600.toDouble()
    fun onEarth(): Double = divideRound(oneYearOnEarth)
    fun onMercury(): Double = divideRound(oneYearOnEarth * 0.2408467)
    fun onVenus(): Double = divideRound(oneYearOnEarth * 0.61519726)
    fun onMars(): Double = divideRound(oneYearOnEarth * 1.8808158)
    fun onJupiter(): Double = divideRound(oneYearOnEarth * 11.862615)
    fun onSaturn(): Double = divideRound(oneYearOnEarth * 29.447498)
    fun onUranus(): Double = divideRound(oneYearOnEarth * 84.016846)
    fun onNeptune(): Double = divideRound(oneYearOnEarth * 164.79132)
    private fun divideRound(divisor: Double): Double = seconds.toBigDecimal().divide(BigDecimal(divisor), 2, RoundingMode.HALF_DOWN).toDouble()
}
