fun main(args: Array<String>) {
	/*var nums1 = 1 until 100
	for(num in nums1) {
		println(num)
	}*/
	
	var nums2 = 1 .. 12
	/*for(a in nums2 step 2) {
		println(a)
	}*/
	
	var nums3 = nums2.reversed()
	for(a in nums3) {
		println(a)
	}
	
	println("����Ϊ${nums3.count()}")
}