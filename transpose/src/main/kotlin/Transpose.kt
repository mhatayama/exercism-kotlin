object Transpose {

    fun transpose(input: List<String>): List<String> =
            (0 until maxLen(input)).map { i ->
                input.indices.map { j ->
                    when {
                        i < input[j].length -> input[j][i]
                        i < maxLen(input.drop(j)) -> " "
                        else -> ""
                    }
                }.joinToString("")
            }

    private fun maxLen(input: List<String>): Int = input.maxBy { it.length }.orEmpty().length
}
