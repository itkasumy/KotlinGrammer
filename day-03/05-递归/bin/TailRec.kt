fun main(args: Array<String>) {
	var result = 0
	println(addAll(2, result))
}

tailrec fun addAll(num:Int, res:Int):Int {
	println("�������${num}������,res=${res}")
	
	if(num == 0) {
		return 1
	} else {
		return addAll(num - 1, res + num)
	}
}