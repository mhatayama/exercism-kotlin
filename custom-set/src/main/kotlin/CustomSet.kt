class CustomSet(private vararg var elements: Int) {
    fun isEmpty(): Boolean = elements.isEmpty()
    fun isSubset(other: CustomSet): Boolean = elements.all { it in other.elements }
    fun isDisjoint(other: CustomSet): Boolean = elements.none { it in other.elements }
    fun contains(other: Int): Boolean = other in elements
    fun intersection(other: CustomSet): CustomSet = CustomSet(*elements.filter { it in other.elements }.toIntArray())
    fun add(other: Int) = elements.plus(other).let { elements = it }

    override fun equals(other: Any?): Boolean = other is CustomSet && this.isSubset(other) && other.isSubset(this)
    operator fun plus(other: CustomSet): CustomSet = CustomSet(*elements, *other.elements.filter { it !in elements }.toIntArray())
    operator fun minus(other: CustomSet): CustomSet = CustomSet(*elements.filter { it !in other.elements }.toIntArray())
}
