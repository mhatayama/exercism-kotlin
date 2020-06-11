object RunLengthEncoding {
    private val encodeRegex = """([A-Za-z ])\1*""".toRegex()
    private val decodeRegex = """(\d*)([A-Za-z ])""".toRegex()

    fun encode(input: String): String =
            encodeRegex.findAll(input).joinToString("") { match ->
                val numStr = if (match.value.length == 1) "" else match.value.length.toString()
                numStr + match.value.first()
            }

    fun decode(input: String): String =
            decodeRegex.findAll(input).joinToString("") { match ->
                val num = if (match.groupValues[1].isEmpty()) 1 else match.groupValues[1].toInt()
                match.groupValues[2].repeat(num)
            }
}
