val transMap = mapOf(Pair('G', 'C'), Pair('C', 'G'), Pair('T', 'A'), Pair('A', 'U'))

fun transcribeToRna(dna: String): String {
    return dna.toList().map { transMap[it] }.joinToString("")
}
