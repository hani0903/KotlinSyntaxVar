package com.metacoding.kotlinsyntaxvar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //모든 프로그래밍 언어는 "시작점"이 있다.
    //시작점은 어플리케이션을 실행했을 때 가장 먼저 실행되는 코드를 말한다.
    //안드로이드에서는 onCreate함수가 시작점이다.
    //따라서 코드를 작성할 때에는 onCreate함수 안에 선언한다
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //초기화
        val variable = "홍길동"

        //타입특정 후-> 타입을 바꿀 수 없다
        val variable2:String
        variable2="안녕하세요"

        //코틀린의 기본타입

        //1. 실수형 - double,float
        //실수형을 입력하면 더블로 간주하기 때문에 float 변수에 저장할거라면 casting해줘야 한다.
        var doubleValue : Double = 35.6
        var floatValue:Float = 123.7f//float의 경우, 맨 뒤에 f를 넣어줘야 한다.

        //2. 정수형 - long, int, short, byte
        //우리가 에디터에 입력하는 모든 정수형 값은 int로 인식한다.
        var intValue:Int = 12345678
        var longValue:Long = 2_147_483_647//자릿수를 구분해 개발자가 보기 편하게 하기 위해 _를 사용해도 된다
        var shortValue:Short = 123
        var byteValue:Byte = 127

        //3. 문자형 - Char
        var charValue:Char = 'a'
        var stringValue:String="문자형 길이에 상관없이 값을 입력할 수 있다 = 크기를 특정할 수 없다."

        //4. 불린형
        var booleanValue:Boolean = true

        //-----------------------------------------------------

        //상수형 : 키워드 - val
        //상수명 작성 규칙 :상수를 사용할 때에는 상수 이름을 지을 때, 모든 글자를 대문자로 작성한다.
        //변수명 작성 규칙 :새로운 단어가 나타나면 대문자로 작성해준다. 또는 새로운 단어가 나타나면 _를 사용해준다
        val VALVALUE:Boolean = true
    }
}