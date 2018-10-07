fun gradeCheck(score:Int) {
	when(score) {
		10 -> println("考了满分，棒棒哒")
		9 -> println("干的不错")
		8 -> println("还可以")
		7 -> println("还需努力")
		6 -> println("刚好及格")
		else -> println("你没救了")
	}
}

fun main(args: Array<String>) {
	gradeCheck(10)
	gradeCheck(8)
	gradeCheck(2)
}