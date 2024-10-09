import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 101)
    var attempts = 0

    println("Добро пожаловать в игру 'Угадай число'!")
    println("Я загадал число от 1 до 100. Попробуйте его угадать.")

    while (true) {
        println("Введите ваше число:")
        val guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("Некорректный ввод. Пожалуйста, введите число.")
            continue
        }

        attempts++

        if (guess == secretNumber) {
            println("Поздравляю! Вы угадали число за $attempts попыток!")
            break
        } else if (guess < secretNumber) {
            println("Загаданное число больше.")
        } else {
            println("Загаданное число меньше.")
        }
    }
}

