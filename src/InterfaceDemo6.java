
public class InterfaceDemo6 {
public static void main(String[] args) {
	Product ballpen = new Product("Ballpen", 200, "Monami");
//	Product another = ballpen; // 주소복사 
// 값복사는? 하나하나해야하나? 
// api object 가보면 맨위에 clone 있다. 
	//
	//protected Object clone() throws CloneNotSupportedException 
// Product를 복제해보자  근데 clone 은 protected로 보호되어있다. 그 자식만 쓸 수 있다. 즉 product 메소드 안에서 쓰라는것.  Product 가서 카피를 하나 한다. 
	Product another = (Product)(ballpen.copy());
	System.out.println(ballpen);
	System.out.println(another);




}
}
