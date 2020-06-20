class Anagram(private val source: String) {
    private val sortedSource = source.sorted()

    fun match(anagrams: Collection<String>): Set<String> =
        anagrams.filter { sortedSource == it.sorted() }
                .filterNot { it.equals(source, true) }
                .toSet()
}

fun String.sorted() = this.toLowerCase().toList().sorted()

