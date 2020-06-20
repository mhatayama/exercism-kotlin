object Bob {
    fun hey(input: String): String {
        val trimmed = input.trim()
        val isYelling = trimmed.contains(Regex("""[A-Z]""")) and !trimmed.contains(Regex("""[a-z]"""))
        val isQuestioning = trimmed.endsWith("?")
        return when {
            trimmed.isEmpty() -> "Fine. Be that way!"
            isYelling and isQuestioning -> "Calm down, I know what I'm doing!"
            isYelling -> "Whoa, chill out!"
            isQuestioning -> "Sure."
            else -> "Whatever."
        }
    }
}

