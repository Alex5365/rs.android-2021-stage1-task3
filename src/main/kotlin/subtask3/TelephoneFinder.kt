package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val list = arrayListOf<String>()
        return if (number.toInt() < 0) {
            null
        } else {
            number.forEachIndexed { i, cifra ->
                getSosed(cifra).forEach {
                    val str = number.substring(0, i) + it + number.substring(i + 1)
                    list.add(str)
                }
            }
            list.toTypedArray()
        }
        throw NotImplementedError("Not implemented")
    }

    fun getSosed(i: Char): Array<Char> {
        return when(i)
        {
            '1' -> arrayOf('2', '4')
            '2' -> arrayOf('1', '3', '5')
            '3' -> arrayOf('2', '6')
            '4' -> arrayOf('1', '5', '7')
            '5' -> arrayOf('2', '4', '6', '8')
            '6' -> arrayOf('3', '5', '9')
            '7' -> arrayOf('4', '8')
            '8' -> arrayOf('5', '7', '9', '0')
            '9' -> arrayOf('6', '8')
            '0' -> arrayOf('8')
            else -> arrayOf()
        }

    }
}

