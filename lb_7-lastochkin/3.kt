fun main() {
    fun Points(wins: Int, draws: Int, losses: Int): Int {
        return wins * 3 + draws * 1 + losses * 0
    }

    val wins = 3
    val draws = 7
    val losses = 3
    val points = Points(wins, draws, losses)
    println("Количество очков: $points")
}
