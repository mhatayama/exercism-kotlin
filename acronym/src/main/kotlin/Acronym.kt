object Acronym {
    fun generate(phrase: String): String {
        return phrase.toUpperCase().split(Regex("""[^A-Z']"""))
                .filter { it.isNotBlank() }.map { it.first() }.joinToString("")
    }
}
