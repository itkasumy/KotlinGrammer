fun gradeCheck(score:Int) {
	when(score) {
		10 -> println("�������֣�������")
		9 -> println("�ɵĲ���")
		8 -> println("������")
		7 -> println("����Ŭ��")
		6 -> println("�պü���")
		else -> println("��û����")
	}
}

fun main(args: Array<String>) {
	gradeCheck(10)
	gradeCheck(8)
	gradeCheck(2)
}