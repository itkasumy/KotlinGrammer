fun main(args: Array<String>) {
    var man1 = Man()
//    man1.Xdd()

    var tj = TaiJian()
//    tj.eat()
    var house = listOf<Human>(man1, tj)
    for(ps in house) {
        if(ps is Man) {
            ps.eat()
        }
    }
}