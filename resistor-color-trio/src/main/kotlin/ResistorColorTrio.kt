object ResistorColorTrio {

    fun text(vararg input: Color): String =
            when (input[1]) {
                Color.BLACK -> nums(input.toList().take(1)) + ohms(input.last().ordinal + 1)
                else -> nums(input.toList().take(2)) + ohms(input.last().ordinal)
            }
}

private fun nums(input: List<Color>): String = input.joinToString("") { it.ordinal.toString() }
private fun ohms(exp: Int): String =
        "0".repeat(exp % 3) + " " + Unit.values()[exp / 3].name.toLowerCase()
