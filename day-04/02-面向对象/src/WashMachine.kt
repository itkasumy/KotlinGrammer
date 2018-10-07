class WashMachine(var module:String, var size:Int) {
    fun openDoor() {
        println("洗衣机的门已经打开了...")
    }

    fun closeDoor() {
        println("洗衣机的门已经关闭了...")
    }

    fun start() {
        println("放水...")
        println("谁放满了...")
        println("点击开始转了...")
        println("衣服已经洗好了...")
    }
}