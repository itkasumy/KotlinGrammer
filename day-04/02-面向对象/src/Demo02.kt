class Girl(var chactor:String, var voice:String) {
    fun smile() {
        println("妹子笑了一下，么么哒...")
    }
    fun cry() {
        println("好伤心...")
    }
}

fun main(args: Array<String>) {
    var girl01 = Girl("温柔", "甜美")
    println("girl01这个妹子的声音是${girl01.voice}")
    girl01.smile()
    girl01.cry()
}