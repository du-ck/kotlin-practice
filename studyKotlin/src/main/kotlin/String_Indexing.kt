fun main() {

    val person = Person("NWU", 10)
    println("이름 : ${person.name} 나이 : ${person.age}")

    /**
     * 중괄호는 생략이 되지만
     * 가독성 , 일괄 변환,정규식 활용 면에서 쓰는게 낫다.
     */



    //여러줄을 걸친 String을 써야할때 큰따옴표 3번
    var str = """
        ABCD
        EFG
        ${person.name}
    """.trimIndent()
    println(str)

    //특정 문자열 가져오기 (.charAt())
    val str1 = "ABC"
    println(str1[0])
    println(str1[1])
    println(str1[2])
}