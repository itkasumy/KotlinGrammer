fun main(args: Array<String>) {
    var s1:Son = Son.小小驴()
    var s2:Son = Son.小骡子()
    var s3:Son = Son.小小驴()

    var list = listOf<Son>(s1, s2, s3)

    for(s in list) {
        if (s is Son.小小驴) {
            s.sayHi()
        }
    }
}