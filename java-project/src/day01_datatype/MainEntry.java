package day01_datatype;

import java.awt.desktop.SystemSleepEvent;

/*
public class MainEntry {

	public static void main(String[] args) {
		System.out.print("hello java");
		System.out.println(100);  // 정수형은 long 이 아닌 int 로 인식(조금 더 빠름)
		System.out.printf("1");
		
	}

}
*/

public class MainEntry {

	public static void main(String[] args) {
		/*
		int su = 9;
		char ch = 'A';  // '문자'
		String str = "korea";
		double d = 12.34;
		float f = 12.34f;  // 에러 float 타입을 f 붙여줘야함 (단삼대는 오른쪽에서 왼쪽으로 컴파일)
		long num = 9;  // 데이터타입 없을 경우 L붙여줘서 long 선언
		
		System.out.println(3.5);
		System.out.println(3.5f);
		System.out.println(100);
		System.out.println(100L);  // long 8byte
		System.out.println(su);
		System.out.println(ch);  // char 2byte
		System.out.println(str);
		System.out.println(d);
		System.out.println(su+ch+str+d);
		int su2;
		// System.out.println(su2);  // c, c++은 쓰레기값 출력, java 는 에러, 지역변수는 반드시 초기화 해야함

		
		// 자동형변환(5버전 이후부터 가능)
		int x = 2;  // 기본자료형
		Integer y = 2;  //참조형
		x = y.intValue();  // 예전 버전에서는 직접 해줘야함
		y = x;
		x = y;
		
		String str = "A";  // A\0 (\0는 null 의미, A\0이므로 2byte
		char ch = 'A';  // A 2byte

		
		// 형변환
		short sh = -32768;
		int su = 32769;
		
		su = sh;  // 묵시적(자동) 형변환
		sh = (short)su;  // 명시적 형변환, 데이터 손실 발생
		System.out.println(sh + ", " + su);
		
		
		int num = 9;
		int xNum = 0x9;  // 0x숫자 16진수
		int oNum = 011;  //0숫자 8진수
		int bNum = 0B1010;  // 0b숫자 2진수
		
		
		
		// float 소수점 조절해서 출력
		System.out.printf("%10.1f %.2f\n", 33.5678, 33.5678);  //10.1 : 10자리 중 1자리만 소수점, .2 : 소수점 2번째 까지
		// 아스키코드
		for(int i = 65; i <= 90; i++) {
			System.out.print((char)i + " ");
		}
		*/
		// boolean
		// System.out.println("\n\n boolean type");
		boolean flag = true;
		// int b = flag;  //
		System.out.println(flag);

	}

}

