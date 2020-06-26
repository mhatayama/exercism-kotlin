class IsbnVerifier {

    fun isValid(number: String): Boolean {
        if (!Regex("""^[0-9\-]+[0-9X]$""").matches(number)) return false
        val sanitized = number.filter { it.isDigit() || it == 'X' }
        if (sanitized.length != 10) return false
        val checksum = sanitized.map { if (it.isDigit()) it - '0' else 10 }
                .mapIndexed { index, n -> (10 - index) * n }.sum()
        return checksum % 11 == 0
    }
}
