import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(d: LocalDateTime) {
    val date: LocalDateTime = d.plusSeconds(1_000_000_000)

    constructor(d: LocalDate) : this(d.atTime(0, 0))
}
