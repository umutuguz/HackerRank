fun main() {
    val s = "Umut"
    val number = 17
    s.replaceRange(0,2,"$number").take(3)
    println(s.replaceRange(0,2,"$number").take(3))
    println(s.replaceRange(0,2,"$number"))
}