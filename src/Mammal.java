//추상클래스라고 입력해준다. 가상의 클래스라는것. 실제로 존재하지않는다. 그래서 이거 부를 때 new에 의해서 생성되지 않는다.  

/*Abstract Method 
 * -메소드의 선언부(header)만 있고 구현부(Body)가 없는 메소드 
 * -Method의 return type 앞에 abstract keyword를 통해 compiler 에게 body가 없는 method 라고 선언
 * -부모 class 에서 선언된 method 가 자식 class 에서 정의 할 수 있도록 만든 메소드
 * -Override의 강제화를 위한 메소드  재정의 강제 
 * 만일 class 에 한개 이상의 abstract method 를 가지만 반드시 그 클래스는 abstract class 가 되어야 한다. 
 * 예시 : public abstract class InputStream ---abstract 붙으면 스태틱or public 
 *		Calendar도 abstract 다 
 * abstract 붙으면 부를대 new 를 붙이지 못한다 
 * abstract method 는 override된 자식 메소드로써만 그 기능,자료를 부를수있다. 자식들은 반드시 
 *
 *
 *
 *
 *
 *
 */
public abstract class Mammal {
	private String name;
	private int age; 
	// 새로운 클래스니까 생성자로 이름하고 나이를 받으면 
	// 너는 포유류가 될것 
	public Mammal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//포유류는 classbody를 정의할수없다. 개도아니고 고양이도아니기때문에 
	public abstract void saySomething(); // 바디가 없다. 메소드만 선언했다, 정의를 하지 않음. 그럼 누가? 바디는 자식들이 다룰 것이야. 
	//그러니 이 메소드를 abstract method로 해 주세요  : abstract 이 메소드를 추상화하는 키워드. 나의 자식들이 이 메소드의 바디를 의무적으로 정의하게 하겠습니다. 
	// 포유류의 핵심 메소드를 선언하고 자식메소드에서 반드시 정의하도록. 
	// 추상메소드를 하나라도 가지고있으면 추상 클래스가된다. 포유류->> 추상클래스
	@Override
	public String toString() {
		return String.format("Mammal [name=%s, age=%s]", name, age);
	}
}
