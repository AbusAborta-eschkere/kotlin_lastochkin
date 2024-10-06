fun main() {
        println("Введите количество элементов массива:")
        val size = readLine()!!.toInt()
        val numbers = IntArray(size)
        println("Введите элементы массива (через пробел):")
        val input = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
        for (i in 0 until size) {
            numbers[i] = input[i]
        }
        val sortedNumbers = sortArray(numbers)
        println("Отсортированный массив: ${sortedNumbers.contentToString()}")
    }

    fun sortArray(array: IntArray): IntArray {
        val sortedArray = array.clone()
        for (i in 0 until sortedArray.size - 1) {
            for (j in i + 1 until sortedArray.size) {
                if (sortedArray[i] > sortedArray[j]) {
                    val temp = sortedArray[i]
                    sortedArray[i] = sortedArray[j]
                    sortedArray[j] = temp
                }
            }
        }
        return sortedArray
    }

