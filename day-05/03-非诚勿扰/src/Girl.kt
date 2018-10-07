data class Girl(var name:String, var age:Int, var height:Int, var address:String)

var 非诚勿扰数据库 = listOf<Girl>(
        Girl("依儿", 18, 168, "山东"),
        Girl("笑笑", 19, 175, "河南"),
        Girl("小百合", 17, 155, "福建"),
        Girl("michel", 22, 148, "广东"),
        Girl("猫咪", 28, 159, "广西"),
        Girl("玲儿", 23, 169, "广东"),
        Girl("环环", 25, 172, "安徽"),
        Girl("胖嘟嘟", 32, 180, "河北"),
        Girl("乔乔", 35, 180, "广东"),
        Girl("小可爱", 27, 150, "江西"),
        Girl("一生有你", 22, 163, "山东"),
        Girl("敏儿", 28, 155, "黑龙江"),
        Girl("月儿", 25, 178, "吉林"),
        Girl("花儿", 21, 183, "山东"),
        Girl("s小糖", 49, 190, "新疆"),
        Girl("悦悦", 19, 160, "广西"),
        Girl("小可爱", 29, 158, "广东"),
        Girl("紫琪", 49, 149, "新疆"),
        Girl("糖心", 26, 165, "甘肃"),
        Girl("棒棒糖", 23, 172, "浙江"),
        Girl("猪猪侠", 18, 173, "山东"),
        Girl("喵喵", 27, 164, "河南"),
        Girl("安琦", 19, 159, "河北"),
        Girl("叶子", 20, 160, "广东")
)

/*fun filterGirlsByAddress(address: String) {
    var 某个地区的妹子 = ArrayList<Girl>()
    for (girl in 非诚勿扰数据库) {
        if (girl.address == address) {
            某个地区的妹子.add(girl)
        }
    }

    for (girl in 某个地区的妹子) {
        println("${girl.address} ${girl.age}岁的美女 ${girl.name}")
    }
}

fun filterGirlsByAge(age: Int) {
    var 某个年龄以下的妹子 = ArrayList<Girl>()
    for (girl in 非诚勿扰数据库) {
        if (girl.age < age) {
            某个年龄以下的妹子.add(girl)
        }
    }

    for (girl in 某个年龄以下的妹子) {
        println("${girl.address} ${girl.age}岁的美女 ${girl.name}")
    }
}

fun filterGirlsByAddressHeightAge(address: String, height: Int, age: Int, flag:Boolean) {
    var 符合条件的妹子 = ArrayList<Girl>()

    if(flag) {
        for (girl in 非诚勿扰数据库) {
            if ((girl.address == address) and (girl.age < age) and (girl.height > height)) {
                符合条件的妹子.add(girl)
            }
        }
    } else {
        for (girl in 非诚勿扰数据库) {
            if ((girl.address == address) and (girl.age > age) and (girl.height > height)) {
                符合条件的妹子.add(girl)
            }
        }
    }

    for (girl in 符合条件的妹子) {
        println("${girl.address} ${girl.age}岁的美女 ${girl.name} 身高 ${girl.height}cm")
    }
}*/



/*fun List<Girl>.查找嫩妹子年龄小于(age: Int) {
    filter {
        it.age < age
    }.forEach(::println)
}*/

infix fun List<Girl>.查找嫩妹子年龄小于(age: Int) {
    filter {
        it.age < age
    }.forEach(::println)
}

infix fun List<Girl>.查找老妹子年龄大于(age: Int) {
    filter {
        it.age > age
    }.forEach(::println)
}

infix fun List<Girl>.查找嫩妹子来自(address: String) {
    filter {
        it.address == address
    }.forEach(::println)
}