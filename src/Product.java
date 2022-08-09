
											//복제가능한개체라는걸 표시하기위해 여기에 cloneable 붙여준다. 멤버 하나도업슨ㄴ데. 런걸 flag라고한다. 
class Product implements Comparable<Product>, Cloneable { // 기능 붙이고싶으면 이렇게 추가하면된다. 멤버 하나도없는것들 그냥 붙이기만하면됨. 기능 추가도 인터페이스
															// 계속 붙이면됨. abstract interface 있으면 자식에서 재정의해주면된다.
	private String name, maker;
	private int price;

	// 상속받은 객체 안에서 복제해라 object의 자식인 애가 clone 하라는것
	Object copy() {
		Object obj = null; //초기화해줌 
		try { // 이것도 저번에 파일 찾아갈때처럼 예외상황에 대한걸 만들어준다
			obj = this.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("이 객체는 복제를 지원안함 ");
		}
		return obj;
	}

	public Product(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

	@Override
	public int compareTo(Product o) {
		return o.name.compareTo(this.name);
	}

	@Override
	public String toString() {
		return String.format("Product [name=%s, price=%d, maker=%s]", name, price, maker);
	}
}