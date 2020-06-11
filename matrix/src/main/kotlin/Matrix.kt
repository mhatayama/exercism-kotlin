class Matrix(private val matrixAsString: String) {
    private val spaceRegex = """\s+""".toRegex()
    private val matrix: List<List<Int>> = matrixAsString.lines()
            .map { it.trim().split(spaceRegex).map(String::toInt) }

    fun column(colNr: Int): List<Int> = matrix.map { it[colNr - 1] }
    fun row(rowNr: Int): List<Int> = matrix[rowNr - 1]
}