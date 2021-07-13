package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        return computation(array.get(0), array.get(1).toLong())
        throw NotImplementedError("Not implemented")
    }

    fun computation (m: Int, n: Long): Int?
    {
        if(m < 0 && n <= 0)
        {
            return null
        }
        else
        {
            try {
                var x: Long = 1
                while (true)
                {
                    val rez: Long = factorial(n) / (factorial(x) * (factorial(n - x)))
                    println(x)
                    println("m = $m")
                    println("rez = $rez")
                    if (m == rez.toInt()) {
                        break
                    }
                    x++
                }
                return x.toInt()
            }
            catch (e: UnsupportedOperationException)
            {
                return null
            }

        }
    }

    fun factorial(num: Long) = (1..num).reduce(Long::times)

}
