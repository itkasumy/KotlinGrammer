var print = fun (v:String) {
    println(v)
}

fun main(args: Array<String>) {
    var list = listOf<String>("xiaoming", "xiaohong", "xiaomei", "xiaodong")

    list.forEach(print)

    /*list.forEach {
        v -> println(v)
    }*/

    /*list.forEach {
        println(it)
    }*/
}