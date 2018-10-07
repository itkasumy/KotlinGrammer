fun main(args: Array<String>) {
    var washMachine = WashMachine("小天鹅", 12)

    washMachine.openDoor()
    println("放入贴身衣物")
    washMachine.closeDoor()
    washMachine.selectMode(1)
    washMachine.start()

    var washMachineAgain = WashMachine("格力", 12)

    washMachineAgain.openDoor()
    println("放入我最帅气的外套")
    washMachineAgain.closeDoor()
    washMachineAgain.selectMode(2)
    washMachineAgain.start()
}