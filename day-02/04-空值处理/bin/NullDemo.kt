//����һ�������������Ƿǿյ� String ���ͣ������ʺŴ�����ǲ�������Ϊ��
fun heat(str:String?):String {
	return "��" + str
}

fun main(args: Array<String>) {
	var res1 = heat("ˮ")
	println(res1)
	var res2 = heat("��")
	println(res2)
 
	var res3 = heat(null)
	println(res3)
}