import java.lang.IllegalArgumentException

/**
 * 파라미터가 0보다 적을 경우 exception 뱉는 함수
 *
 * throw exception 을 할때 new 를 안씀.
 * void 를 안씀
 */
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없음.")
    }
}


fun getPassOrFail(score: Int): String {
    //자바에서 삼항연산자의 값을 리턴하는것처럼
    //여긴 if 문 자체를 return 가능
    // if 문이 Expression 이므로


    /*if (score >= 50) {
        return "P"
    } else {
        return "F"
    }*/
    //위 문법을 아래처럼 가능
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
    //따라서 Kotlin 은 삼항연산자가 없음
}


/**
 * 0~100 등의 범위를 따질 때
 * if (score in 0..100)  식으로 가능
 */


fun getGradeWithSwitch(score: Int): String {
    /*return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }*/
    return when (score / 10) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

/**
 * is Type 형식도 가능
 */
fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}


fun judgeNumber(num: Int) {
    when (num) {
        1, 0, -1 -> println("어디서 많이 본 숫자 입니다")
        else -> println("1, 0, -1 숫자가 아닙니다")
    }
}

fun judgeNumber2(num: Int) {
    when {
        num == 0 -> println("주어진 숫자는 0 입니다")
        num % 2 == 0 -> println("주어진 숫자는 짝수 입니다")
        else -> println("주어진 숫자는 홀수 입니다")
    }
}