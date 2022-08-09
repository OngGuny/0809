//5.  다중 상속 가능. 대신 변수 전부다 초기화 해줘야함 


//6. interface에 주소는 해당 인터페이스의 재정의된 메소드만 접근가능   할아버지 주소로는 할아버지의재정의된 메소드만 접근할수있다. 
//7. interface 배열에는 해당 인터페이스의 자식 클래스를 넣을 수 있다.  포유류 -- 개 고양이 말  등등 


public class Interface1 extends Object implements Father, Mother {
	
	

	
	
	
	
	
	
	
	public static void main(String[] args) {
		// new 못쓰니 선언형은 할아버지 실행형은 손자 
		GrandFather gFather = new InterfaceDemo1(); gFather.grandFather();//할아버지의 인터페이스 주소 는 할아버지의 메소드만 접근가능 
		Father father = new InterfaceDemo1(); father.grandFather(); father.grandMother; father.father; // father는 클래스
		
		Mother [] array= new Mother[3];// 인터페이스로 배열 만들수있음 
		array[0]=new InterfaceDemo1();//부모형 배열에는 그 자식들을 넣을 수 있다. 
		array[0].mother(); // mother만, 마더의 메소드만 접근가능 
	
		// 같아도 충돌 x 주소없이접근하기때문에 
		System.out.println("Father's MAX = "+Father.MAX);
		System.out.println("Mother's MAX = "+Mother.MAX);
	
	
	}
	
	
	
	
	
	//todtjdwk qkedkdhsek. 
	
	public void	mother
//public void father
//public void	grandFater=()  +
//public void	grandMother()=  +;
//} 
	}
