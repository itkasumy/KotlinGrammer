fun main(args: Array<String>) {
	var str1 = "Andy"
	var str2 = "andy"
	println(str1 == str2)
	println(str1.equals(str2))
	println("-------------")
	println(str1.equals(str2, true))
	println(str1.equals(str2, false))
//	�ڶ�������Ϊ true ���������ĸ�Ĵ�Сд
}