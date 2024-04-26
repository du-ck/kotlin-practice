import java.lang.Exception

//java 에서 쓰이는 방식의 코드
fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}




fun main() {
    //safe call
    //null 이 아니면 실행하고, null 이면 실행하지 않는다 ( 그대로 null )
    var str: String? = "ABC"
    // str.length  >> 불가능 (위에 선언한 str 이 nullable 이므로)
    str?.length     // 가능


    //Elvis 연산자
    // A ?: B   ( A 가 null 이면 B 값을 사용)
    str?.length ?: 0


    //위의 3개를 kotlin 스럽게 변경

    fun startsWithA1_Kotlin(str: String?): Boolean {
        return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다")
    }

    fun startsWithA2_Kotlin(str: String?): Boolean? {
        return str?.startsWith("A")
    }

    fun StartsWithA3_Kotlin(str: String?): Boolean {
        return str?.startsWith("A") ?: false
    }


    //null 일수가 없는 상황에서 사용법
    fun startsWith(str: String?): Boolean {
        return str!!.startsWith("A")
    }

}






