class Man(name:String):Human(name) {
    override fun eat() {
       println("${name}狼吞虎咽地大口吃")
    }

    override fun pee() {
        println("${name}站着尿尿")
    }
}