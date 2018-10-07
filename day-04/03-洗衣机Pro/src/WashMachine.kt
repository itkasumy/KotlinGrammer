class WashMachine(module:String, size:Int) {
    var isDoorOpen = true
    var curMode = 0

    fun openDoor() {
        isDoorOpen = true
        println("洗衣机门已经打开了...")
    }

    fun closeDoor() {
        isDoorOpen = false
        println("洗衣机门已经关闭了...")
    }

    fun selectMode(mode:Int) {
        curMode = mode
        when(mode) {
            0 -> println("初始模式，请您选择模式")
            1 -> println("轻揉")
            2 -> println("狂甩")
            else -> println("模式错误")
        }
    }

    fun start() {
        if(isDoorOpen) {
            println("洗衣机门开着，无法启动洗衣机...")
        } else {
           when(curMode)  {
               0 -> {
                   println("选择模式错误，不能开始洗衣服")
               }
               1 -> {
                   println("开始放水...")
                   println("水已经放好了...")
                   println("开始轻轻地洗衣服啦...")
                   setMotorSpeed(100)
                   println("衣服已经洗好了...")
               }
               2 -> {
                   println("开始放水...")
                   println("水已经放好了...")
                   println("开启狂甩模式洗衣服啦...")
                   setMotorSpeed(1000)
                   println("衣服已经洗好了...")
               }
               3 -> {
                   println("选择模式错误，不能开始洗衣服")
               }
           }
        }
    }

    private fun setMotorSpeed(speed:Int) {
        println("当前发动机的转速为${speed}r/s")
    }
}