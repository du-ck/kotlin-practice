fun main() {

    //foreach
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    //for문
    for (i in 1..3) {
        println(i)
    }

    //for문 ++ 가 아닌 -- 일 경우
    for (i in 3 downTo 1) {
        println(i)
    }

    //for문 2씩 올라가는 경우
    for (i in 1..5 step 2) {
        println(i)
    }

    

}