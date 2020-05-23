import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(d: Any) {
    val date: LocalDateTime = when (d) {
        is LocalDate -> d.atTime(0, 0)
        is LocalDateTime -> d
        else -> throw IllegalArgumentException("none date value")
    }.plusSeconds(1_000_000_000)
}
