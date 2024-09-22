import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 101) // Загадываем число от 1 до 100
    var attempts = 0

    println("Я загадал число от 1 до 100. Попробуй угадать!")

    while (true) {
        print("Введите ваше число: ")
        val guess = readLine()?.toIntOrNull()

        if (guess != null) {
            attempts++

            when {
                guess < secretNumber -> println("Слишком мало! Попробуй еще раз.")
                guess > secretNumber -> println("Слишком много! Попробуй еще раз.")
                else -> {
                    println("Угадал! Ты справился за $attempts попыток.")
                    break // Выходим из цикла, если угадали
                }
            }
        } else {
            println("Некорректный ввод. Введите целое число.")
        }
    }
}
