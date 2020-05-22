object Pangram {

    fun isPangram(input: String): Boolean {
        return input.filter { it.isLetter() }.toLowerCase().toSet().size == 26
    }
}
