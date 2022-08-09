import java.util.Scanner;//밑에 위치에 스캐너가 없어서 import로 가져온것  profiles에 java11버젼 저장한 폴더에 있다. 자바 밑에 유틸 밑에 스캐너
//시스템 어디있어. 
import static java.lang.System.out; // 이건 생략되있음  원래 import 는 class 까지만 하면 된다. 근데 스태틱 붙여서 out까지 내려올 수 있다. 이러면 아래에서 쓸 때 생략가능; 
//import java.lang.Math; // 이것도 여기서 가져오는거  시스템,매스 둘다 더 내려갈수있다 스태틱 변수까지 . 
//import static java.lang.Math.PI; 

//랜덤은 메소드니까 조심 괄호쓰면안됨 
//import static java.lang.Math.random;

//다필요하다면. 
import static java.lang.Math.*; //이러면 위에 없어도 된다. math안붙여도됨


//chap.11 17p
public class StaticImportDemo {
	public static void main(String[] args) { // 여기서부터 스태틱이란거니까 
		Scanner sc= new Scanner(System.in);
		int rand= (int)(random()*6+1); // 랜덤이 math의 스태틱 메소드라는것. 
		out.println("rand = "+rand);
		out.println("PI = "+PI); // 파이도 매쓰의 스태틱이란것 
	}
}
