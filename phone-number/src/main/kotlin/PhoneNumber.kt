class PhoneNumber(private val input: String) {
    var number: String

    init {
        val sanitized = input.filter(Char::isDigit)
        require(arrayOf(10, 11).contains(sanitized.length))
        if (sanitized.length == 11) require(sanitized.startsWith("1"))
        number = sanitized.takeLast(10)
        require(('2'..'9').contains(number[0]))
        require(('2'..'9').contains(number[3]))
    }

}
