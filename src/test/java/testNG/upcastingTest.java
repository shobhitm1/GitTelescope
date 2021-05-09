package testNG;

public class upcastingTest {
	
	public static void main(String[] args) {
		
		parentTest p = new child();
		p.display();
		System.out.println(p.a);
	
		}
}
	
	


  
	
  
