object PigLatin {
    val consonants = "bcdfghjklmnpqrstvwxyz"

    fun translate(phrase: String): String {
        return phrase.split(" ").joinToString(" ") { piggify(it) }
    }

    private fun piggify(word: String): String = when {
        Regex("""^[aeiou]|^xr|^yt""").containsMatchIn(word) -> word + "ay"
        Regex("""^sch|^thr|^squ""").containsMatchIn(word) -> word.drop(3) + word.take(3) + "ay"
        Regex("""^ch|^qu|^rh|^th""").containsMatchIn(word) -> word.drop(2) + word.take(2) + "ay"
        Regex("""^[$consonants]y""").containsMatchIn(word) -> word.drop(1) + word.take(1) + "ay"
        Regex("""^[$consonants]""").containsMatchIn(word) -> word.drop(1) + word.take(1) + "ay"
        else -> word
    }
}
