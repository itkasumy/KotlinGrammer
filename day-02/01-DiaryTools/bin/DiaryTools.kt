fun DiaryGenerater(placeName:String):String {
	var template = """
		今天天气晴朗，万里无云，我们去${placeName}玩，
		首先映入眼帘的是：${placeName}${placeName.length}个镏金大字。
	"""
	return template
}

fun main(args: Array<String>) {
	println(DiaryGenerater("中央公园"))
	println(DiaryGenerater("故宫"))
	println(DiaryGenerater("人民大会堂"))
	println(DiaryGenerater("金銮殿"))
	println(DiaryGenerater("天安门"))
}