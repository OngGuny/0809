import java.util.Arrays;

public class InterfaceDemo5 {
	public static void main(String[] args) {
		// 제품 3개만 해보자
		Product[] array = new Product[3];
		array[0] = new Product("Ballpen", 200, "모나미");
		array[1] = new Product("Notebook", 2500000, "Apple");
		array[2] = new Product("Keyboard", 20000, "Logitech");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}
}
class Product implements Comparable<Product>{
	private String name, maker;
	private int price;
	//멤버변수 만들었으니 당연히 생성자 만들어줌 
	public Product(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
	}
	//이름기준 오름차순 정렬
	@Override
	public int compareTo(Product o) {
		return o.name.compareTo(this.name); // 이 2개의 이름 위치만 바꾸면 내림차순, 오름차순 바뀌고 이름말고 다른 변수 넣어도 된다.
	}
	//앞의 객체 - 뒤의 객체 : 오름차순 (뺴기)
	//뒤의 객체 - 앞의 객체 : 내림 차순 
	
	
// tostring 도 당연히 해줌 
	@Override
	public String toString() {
		return String.format("Product [name=%s, price=%d, maker=%s]", name, price, maker);
	}
	
}
// Interface Serializable 직렬화 : 12명 학생 째로 복사해서 가져가는거 
// 근데 직렬화 api는 멤버가 하나도 없음;  어떻게 씀? 
//	직렬화의 자식이면된다.  
//초기화 안해도 되는거 
// flag  기준으로 판단함 .
// cloneable 과 연동시켜서함 