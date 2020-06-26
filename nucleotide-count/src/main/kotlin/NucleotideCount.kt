class Dna(private val input: String) {
    init {
        require(Regex("""[ACGT]*""").matches(input))
    }
    
    val nucleotideCounts = "ACGT".toCharArray().map { it to input.count { c -> it == c } }.toMap()
}
