fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.filter { it % 2 == 0 }.forEach { list.remove(it) }
    println(list)
}