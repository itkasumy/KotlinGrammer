fun DiaryGenerater(placeName:String):String {
	var diary = """
		�����������ʣ��������ƣ�����ȥ${placeName}�棬
		����ӳ���������ǣ�${placeName}${numToChinese(placeName.length)}���ֽ���֡�
	"""
	return diary
}

fun numToChinese(num:Int):String {
	var res = when(num) {
		1 -> "һ"
		2 -> "��"
		3 -> "��"
		4 -> "��"
		5 -> "��"
		6 -> "��"
		else -> num.toString()
	}
	return res
}

fun main(args: Array<String>) {
	println(DiaryGenerater("�������鶫�����鶫������"))
}