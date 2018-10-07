import java.math.BigInteger

fun main(args: Array<String>) {
	var num = BigInteger("1000")
	var res = fact(num)
	println(res)
}

fun fact(num:BigInteger):BigInteger {
	if(num == BigInteger.ONE) {
		return BigInteger.ONE
	} else {
		return num * fact(num - BigInteger.ONE)
	}
}