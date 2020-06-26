object Series {
    fun slices(n: Int, s: String): List<List<Int>> {
        require(s.length >= n)
        return s.map { it.toString().toInt() }.windowed(n)
    }
}
