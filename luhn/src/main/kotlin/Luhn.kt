object Luhn {

    fun isValid(candidate: String): Boolean {
        if (candidate.contains(Regex("""[^0-9 ]"""))) return false
        val sanitized = candidate.filter(Char::isDigit)
        if (sanitized.length < 2) return false
        val checksum = sanitized.map(Character::getNumericValue).reversed().mapIndexed { index, num ->
            if (index % 2 == 0) num else doubling(num)
        }.sum()
        return checksum % 10 == 0
    }

    private fun doubling(num: Int): Int = if (num * 2 > 9) num * 2 - 9 else num * 2
}
