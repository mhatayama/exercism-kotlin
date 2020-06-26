class Series(private val input: String) {
    init {
        require(input.all(Char::isDigit)) { "nondigits in source sequence" }
    }

    fun getLargestProduct(span: Int): Long {
        require(span >= 0) { "negative span" }
        require(input.length >= span) { "span longer than string length" }
        if (span == 0) return 1
        return input.map { it.toString().toLong() }.windowed(span)
                .map { it.reduce { acc, i -> acc * i } }.max()!!
    }
}
