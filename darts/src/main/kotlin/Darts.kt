import kotlin.math.sqrt
import kotlin.math.pow

object Darts {
    fun score(x: Number, y: Number): Int {
        val radius = sqrt(x.toDouble().pow(2) + y.toDouble().pow(2))
        return when {
            radius > 10 -> 0
            radius > 5 -> 1
            radius > 1 -> 5
            else -> 10
        }
    }
}
