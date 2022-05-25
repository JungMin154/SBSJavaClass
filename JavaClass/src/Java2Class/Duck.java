package Java2Class;

public class Duck {
	private int numLeg =2;
	public void md1() {
		System.out.println(numLeg);
		md2();	
	}
   private void md2() {
	   System.out.println(numLeg);
	   md3();
   }
   void md3() {
	   System.out.println(numLeg);
	   
   }
}
