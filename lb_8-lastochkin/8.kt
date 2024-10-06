fun calculateFrames(minutes: Int, fps: Int): Int {
    val seconds = minutes * 60
    return seconds * fps
}

fun main() {
    println("Введите количество минут:")
    val minutes = readLine()!!.toInt()

    println("Введите частоту кадров (FPS):")
    val fps = readLine()!!.toInt()

    val totalFrames = calculateFrames(minutes, fps)
    println("За $minutes минут компьютер покажет $totalFrames кадров.")
}
