


/**
 * 함수가 하나의 결과값이라면
 * 중괄호도 = 으로 생략 가능
 *
 * 반환 타입이 모두 Int 일 경우
 * 함수앞에 선언하는 Int 도 생략 가능
 * 이때 생략하는 경우 중괄호 대신 = 썼을때만 가능
 */
fun max(a: Int, b: Int)/*: Int*/ =
    if (a > b) {
        a
    } else {
        b
    }

fun max2(a: Int, b: Int) = if (a > b) a else b


/**
 * default parameter 가능
 */

fun main() {
    repeat("Hello World")
    //중간 파라미터는 기본값을, 세번째 파라미터를 조정하고 싶을때 아래 방식 사용
    repeat("Hello World", useNewLine = false)


    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    //kotlin 에서는 배열을 가변인자에 넣어줄때 앞에 *이 필요 (spread)
    printAll(*array)
}

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}


/**
 * 가변인자 함수
 */
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}