fun DiaryGenerater(placeName:String):String {
	var template = """
		�����������ʣ��������ƣ�����ȥ${placeName}�棬
		����ӳ���������ǣ�${placeName}${placeName.length}���ֽ���֡�
	"""
	return template
}

fun main(args: Array<String>) {
	println(DiaryGenerater("���빫԰"))
	println(DiaryGenerater("�ʹ�"))
	println(DiaryGenerater("��������"))
	println(DiaryGenerater("���ǵ�"))
	println(DiaryGenerater("�찲��"))
}