
public class Test {
	
	public static void test(int x) {
		if (x ==1) {
			test1();
		}
		if (x ==2) {
			test2();
		}
		if (x==3) {
			test1();
			test2();
		}
			
	}
	
	public static void test1() {
		System.out.println("TEST 1");
		
	}
	
	public static void test2() {
		System.out.println("TEST 2");
		
	}
	

}
