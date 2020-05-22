object Raindrops {

    fun convert(n: Int): String {
        val map = mapOf(Pair(3, "Pling"), Pair(5, "Plang"), Pair(7, "Plong"))
        return map.entries
                .filter { (k, v) -> n % k == 0 }
                .joinToString(separator = "") { (k, v) -> v }
                .ifEmpty { n.toString() }
    }
}
