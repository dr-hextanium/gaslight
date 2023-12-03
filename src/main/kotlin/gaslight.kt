object Statistics {
    fun String.characterCount() = this.chars().count().toInt()
    fun String.wordCount() = this.words().size

    fun String.wordDistribution() = this.words().groupingBy { it }.eachCount()
}

object Cleanup {
    fun String.prepend(prefix: String) = prefix + this
    fun String.append(suffix: String) = this + suffix
}

object Order {
    fun List<String>.alphabetize() = this.sorted()
    fun List<String>.byLength() = this.sortedWith { a, b -> a.length - b.length }
}


fun String.words() = this.split(" ")

