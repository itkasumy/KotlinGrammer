fun main(args: Array<String>) {
	while(true) {
		println("��ӭʹ��ksm������")
	
		println("������һ������")
		var num1Str = readLine()
		println("������ڶ�������")
		var num2Str = readLine()
		
		try {
			var num1:Int = num1Str!!.toInt()
			var num2:Int = num2Str!!.toInt()
			println("${num1} + ${num2} = ${num1 + num2}")
		} catch(e:Exception) {
			println("�������ֵ������ȷ�������ֵΪ����")
		}
	}
}