import `class`.Money

fun main() {
    /**
     * 대부분 같지만
     * 객체를 비교할때 자바는 compareTo 를 쓰지만
     *
     * Kotlin 은 그냥 연산자로 해도
     * 자동으로 compareTo를 호출해준다.
     */


    /**
     * 동등성 : 두 객체의 값이 같은가?
     * java >> equals
     * kotlin >>   ==  (equals 호출해줌)
     *
     *
     * 동일성 : 주소값까지 같은 동일한 객체인가?
     * java >> ==
     * kotlin >> ===
     */


    val money1 = 1_000L
    val money2 = money1
    val money3 = 1_000L
    println(money1 == money3)   //true
    println(money1 === money2)  //true

    /**
     * &&
     * ||
     * !
     * 자바와 같음
     */

    val money4 = Money(1_000L)
    val money5 = Money(2_000L)
    println(money4 + money5)
}
