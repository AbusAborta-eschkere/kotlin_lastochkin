fun main() {
    println("## Типы данных в Kotlin")
    println("--------------------------")

    println("### Основные типы данных:")
    println(" ")

    println("**Числовые типы:**")
    println(" - **Byte:** 8-битное целое число со знаком (-128..127).")
    println(" - **Short:** 16-битное целое число со знаком (-32768..32767).")
    println(" - **Int:** 32-битное целое число со знаком (-2147483648..2147483647).")
    println(" - **Long:** 64-битное целое число со знаком (-9223372036854775808..9223372036854775807).")
    println(" - **Float:** 32-битное число с плавающей точкой.")
    println(" - **Double:** 64-битное число с плавающей точкой.")
    println(" ")

    println("**Символьные типы:**")
    println(" - **Char:** 16-битный символ Unicode.")
    println(" ")

    println("**Логический тип:**")
    println(" - **Boolean:** Логическое значение (true или false).")
    println(" ")

    println("**Строковый тип:**")
    println(" - **String:** Строка символов.")
    println(" ")

    println("### Дополнительные типы данных:")
    println(" ")

    println("**Массив:**")
    println(" - Array<T>: Содержит элементы одного типа T.")
    println(" - Создается с помощью arrayOf<T>() или Array(size) { ... }.")
    println(" ")

    println("**Список:**")
    println(" - List<T>: Упорядоченный набор элементов одного типа T.")
    println(" - Создается с помощью listOf<T>(), mutableListOf<T>() или arrayListOf<T>().")
    println(" ")

    println("**Множество:**")
    println(" - Set<T>: Неупорядоченный набор уникальных элементов одного типа T.")
    println(" - Создается с помощью setOf<T>(), mutableSetOf<T>() или hashSetOf<T>().")
    println(" ")

    println("**Карта:**")
    println(" - Map<K, V>: Хранит пары ключ-значение, где K - тип ключа, а V - тип значения.")
    println(" - Создается с помощью mapOf<K, V>(), mutableMapOf<K, V>() или hashMapOf<K, V>().")
    println(" ")

    println("**Перечисление:**")
    println(" - enum class:  Определяет набор констант (значений).")
    println(" ")

    println("**Функция:**")
    println(" -  fun <name>(<parameters>): <returnType> { ... } : Блок кода, выполняющий задачу.")
    println(" ")

    println("**Класс:**")
    println(" -  class <name> { ... }:  Шаблон для создания объектов.")
    println(" ")

    println("**Интерфейс:**")
    println(" -  interface <name> { ... }:  Определяет контракт (методы), которые должны быть реализованы классами.")
    println(" ")
}
