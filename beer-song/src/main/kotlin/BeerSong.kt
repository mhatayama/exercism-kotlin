object BeerSong {
    fun verses(startBottles: Int, takeDown: Int): String =
            (startBottles downTo takeDown).joinToString("\n") {
                when (it) {
                    0 -> """No more bottles of beer on the wall, no more bottles of beer.
                        |Go to the store and buy some more, 99 bottles of beer on the wall.
                        |""".trimMargin()
                    1 -> """1 bottle of beer on the wall, 1 bottle of beer.
                           |Take it down and pass it around, no more bottles of beer on the wall.
                           |""".trimMargin()
                    2 -> """2 bottles of beer on the wall, 2 bottles of beer.
                           |Take one down and pass it around, 1 bottle of beer on the wall.
                           |""".trimMargin()
                    else -> """$it bottles of beer on the wall, $it bottles of beer.
                        |Take one down and pass it around, ${it.dec()} bottles of beer on the wall.
                        |""".trimMargin()
                }
            }
}

