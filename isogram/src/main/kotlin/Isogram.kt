object Isogram {

    fun isIsogram(input: String): Boolean {
        return input.filter { it.isLetter() }.toLowerCase().let { it.length == it.toSet().size }
    }
}
