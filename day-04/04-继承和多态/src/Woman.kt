class Woman(name:String):Human(name) {
    override fun eat() {
        println("${name}细嚼慢咽地小口吃")
    }

    override fun pee() {
        println("${name}蹲着尿尿")
    }
}