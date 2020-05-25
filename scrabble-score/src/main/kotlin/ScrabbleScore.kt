object ScrabbleScore {
    private val VALUES = listOf(1 to "AEIOULNRST", 2 to "DG", 3 to "BCMP",
            4 to "FHVWY", 5 to "K", 8 to "JX", 10 to "QZ")

    private fun scoreLetter(c: Char): Int =
            VALUES.first { it.second.contains(c) }.first

    fun scoreWord(word: String): Int =
            word.toList().map { scoreLetter(it.toUpperCase()) }.sum()
}

