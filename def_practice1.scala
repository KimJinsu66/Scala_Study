// 함수 add1를 만들고 Int형 파라미터 2개를 생성 후 return type Int로 해준다.
def add1(x:Int,y:Int):Int = {
  return x + y
  
}

println(add1(3,4))

// 함수 2를 만들고 Unit으로 설정해준다.
// Unit은 return type 없음을 나타낸다. Unit은 생략 가능

def add2(x:Int,y:Int):Unit = {
  println(x+y)
}

//1라인으로 처리 가능한 경우 중괄호({}) 없이 선언 가능

// 중괄호 없이 선언
def printUpper(message:String):Unit = println(message.toUpperCase())
// 반환타입도 생략
def printLower(message:String) = println(message.toLowerCase())
