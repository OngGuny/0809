import java.util.Calendar;
import java.util.GregorianCalendar;

// perspective of abstract class  스태틱 써서 불러오는방법 
/*Abstract Class 
 * -Class 선언시 abstract으로 선언된 클래스 
 * -Instance 로 생성 할 수 없다
 * -1)자식 클래스를 통해 생성되는 방법
 * -2)static 멤버로 생성하는 방법 
 *-다형성의 강제화   api에서 abstract 보면 이제 new는 못쓰고 static 으로 되어있는 메소드를 찾던지, 자식메소드가 있는지 본다. 
 *abstract variable 은 없고 method 와 class에서만 쓸수 있다. 
 * 
 *자식을 만들던가. 캘린더를 만들어서 부르던가 
 */


public class AbstractClassDemo1 {
	private int age;
	public static void main(String[] args) {
	//super.(스태틱에선 사용 x )
	String str= Human.getInstance();
	//Human jimin = new Human("010-1234-5678","부산시 해운대구 센텀아파트");
	 
	
	
	// new 대응 첫번쨰. 자식을 통해 접근 

	//Calendar cal = new GregorianCalendar();
	  
	//  두번째는 static 을 이용하는 방법 
	Calendar cal = Calendar.getInstance();
	//머ㅏㄹ쩡한 ㅋ르래스에 abstract 붙이는 이유가 new 를 못쓰게하려는 것일 수 있다. 
	
	System.out.println("오늘은"+cal.get(Calendar.YEAR)+"년"+cal.get(Calendar.MONTH)+1+"월"+cal.get(Calendar.DATE)+"일입니다.");
	
	
	}
	
}
//꼭 2가지 방법으로밖에 abstract 안되나? 

class Human{ // 다양성 강제화
	private String tel;
	private String address;
	private static String str= "Hellod Neo";
	public s
	
	public human(String tel, String address) {
		this.tel=tel;
		this.address=address;
		
	}// 추상 클래스임에도 불구하고 쓰려고 직접 쓰려고 만드는 ㅓ갓

	
	abstract class Human getintstance() {
		if()
	}
	
	public static String getInstance() {
		
	}
	
	
	@Override
	public String toString() {
		return String.format("Human [tel=%s, address=%s]", tel, address);
	}
}