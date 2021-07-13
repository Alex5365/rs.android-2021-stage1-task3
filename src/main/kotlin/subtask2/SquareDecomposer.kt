package subtask2

class SquareDecomposer {

    // TODO: Complete the following function

    fun decomposeNumber(number: Int): Array<Int>? {
        var list = dec(number, square(number.toLong()))
        return list
        throw NotImplementedError("Not implemented")
    }

    fun dec(x: Int, squr: Long): Array<Int>? {
        for (i in x - 1 downTo 1) {
            if (square(i.toLong()) == squr)
                return Array(1) { i }
            val diff = squr - square(i.toLong())
            if (diff > 0) {
                val arr = dec(i, diff)
                if (arr != null) return arr.plus(i)
            }
        }
        return null
    }

    fun square(i: Long) = (i * i)
}