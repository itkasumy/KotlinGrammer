fun main(args: Array<String>) {
    /*var gss = Man("入云龙公孙胜")
    gss.eat()

    var cixi = Woman("柳如是")
    cixi.eat()*/

    var person01 = Man("秦始皇")
    var person02 = Woman("太平公主")
    var person03 = Man("乾隆")
    var person04 = Woman("刘亦菲")
    var person05 = Man("ksm")

    var houseList = listOf<Human>(person01, person02, person03, person04, person05)

    for(ps in houseList) {
        ps.pee()
    }
}