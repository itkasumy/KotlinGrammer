fun main(args: Array<String>) {
	var lists = listOf("�����", "�򼦵�", "�����˹", "������")
	/*for(list in lists) {
		println(list)
	}*/
	for((i, e) in lists.withIndex()) {
		println("$i    $e")
	}
}