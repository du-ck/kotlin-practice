fun main(args: Array<String>) {

    /**
     * kotlin 에서는 컴파일러가 type을 출원해주기 때문에
     * 굳이 type 선언을 안해도됨
     * 하려면 : 을 붙여서 가능.
     *
     * ex) var number1: Long = 10L
     *
     * var : 변경 가능
     * val : read-only
     */

    //long number1 = 10L;
    var number1 = 10L

    //final long number2 = 10L;
    val number2 = 10L


    //초기값을 지정해주지 않는 경우는 타입선언을 해야함.
    var number: Int
    // print(number)    << 대신 값이 없으면 컴파일 에러가 발생함



    // long > primitive type , Long > reference type 인데
    // kotlin 은 구분이 없음
    // 코틀린이 알아서 처리를 함 , 박싱과 언박싱을 고려 안해도됨


    // nullable (타입? 선언)
    var number3: Long? = 10L
    number3 = null


    //객체 인스턴스화
    // Person person = new Person("NWU");
    var person = Person("NWU")

}

class Person(s: String) {

}
