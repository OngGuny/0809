
public class AbstractCalssDemo {
public static void main(String[] args) {
//	Mammal m = new Mammal("포유류", 10); //abstract class 라 new로 못부른다 
	Mammal m = new Dog("포유류", 10);// 부모 안되니까 자식 호출한다 
	System.out.println(m);
	m.saySomething();
}
}
