/**
 * java 는 암시적 타입변경이 되지만
 * kotlin 은 명시적으로 변경해야함
 * long > int 변경이 암시적으로 안됨
 */

/**
 * 코틀린에만 존재하는 타입 3가지
 * Any : Java 의 Object 역할
 *
 * Unit : java 의 void 와 동일한 역할
 *
 * Nothing : 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
 * ex)
 * fun fail(message: String) : Nothing {
 *      throw Exception(message)
 * }
 */

fun main() {
    val number1 = 3
    var number2: Long = number1.toLong()

    //nullable 일 경우
    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L


}


fun printAgeIfPerson(obj: Any) {    //  public static void printAgeIfPerson(Object obj) {

    if (obj is Person) {    // (obj instanceof Person)
        /*val person = obj    //Person person = (Person) obj;
        println(person.age)*/
        println(obj.age)

        /**
         * is 반대의미는 !is
         * as 반대의미는 !as
         */
    }
}

//nullable
fun printAgeIfPersonNull(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}


