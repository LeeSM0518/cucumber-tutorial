class GuessNumberGame(
    private val answer: String
) {
    fun check(input: String): String {
        var a = 0
        var b = 0

        for (i in input.indices) {
            if (answer[i] == input[i]) a++
            else if (answer.contains(input[i])) b++
        }

        return "${a}A${b}B"
    }
}

// 1234 1934