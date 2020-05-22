object PigLatin {
    val consonants = "bcdfghjklmnpqrstvwxyz"

    fun translate(phrase: String): String {
        return phrase.split(" ").map { piggify(it) }.joinToString(" ")
    }

    private fun piggify(word: String): String = when {
        Regex("""^[aeiou]|xr|yt""").containsMatchIn(word) -> word + "ay"
        Regex("""^ch|qu""").containsMatchIn(word) -> word.drop(2) + word.take(2) + "ay"
        Regex("""^sch""").containsMatchIn(word) -> word.drop(3) + word.take(3) + "ay"
        Regex("""^[$consonants]qu""").containsMatchIn(word) -> word.drop(3) + word.take(3) + "ay"
        Regex("""^[$consonants]y""").containsMatchIn(word) -> word.drop(2) + word.take(2) + "ay"
        Regex("""^[$consonants]""").containsMatchIn(word) -> word.drop(1) + word.first() + "ay"
        else -> word
    }
}
