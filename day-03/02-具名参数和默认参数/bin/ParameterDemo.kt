val Pi = 3.1415926f

fun 获取矩形的面积(长:Float, 宽:Float):Float {
	return 长 * 宽
}

fun 获取圆的周长1(PI:Float = Pi, 半径:Float):Float {
	return PI * 半径 * 2
}

fun 获取圆的周长2(PI:Float = Pi, 直径:Float):Float {
	return PI * 直径
}

fun 获取圆柱体的体积(PI:Float = Pi, 半径:Float, 高:Float):Float {
	return PI * 半径 * 半径 * 高
}

fun 获取球体的表面积(PI:Float = Pi, 半径:Float):Float {
	return 4 * PI * 半径 * 半径
}

fun main(args: Array<String>) {
	var area = 获取矩形的面积(3.0f, 4.0f)
	println(area);

//具名参数
	var circleArea = 获取球体的表面积(半径 = 1.0f)
	println(circleArea)
}