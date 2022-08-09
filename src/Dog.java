//재정의 안하면 dog 도 abstract class 가 되어야함 
public class Dog extends Mammal {

	public Dog(String name, int age) {
		super(name,age);
		
	}
	@Override // dog 는 saysomething 을 재정의하는구나
	public void saySomething() { //자식이 이 의무를 유보하면 또 dog의 자식클래스가 의무를 받음 
		// TODO Auto-generated method stub
System.out.println("Bark! Bark!");
	}
// 부모는 선언! 자식은 정의! abstract 쓰면 강제적으로 정의함 .안하면 나도 채무자가되어 오류뜸 
}
