package Java2class;

public class Point {

	public static void main(String[] args) {
	  Circle c=new Circle(2,2,4);
	  c.showCirclelnfo();

	}
	class Point{
		int xPos,yPos;
		public point(int x,int y) {
			xPos = x;
			yPos = y;
			}
		public void showPointUnfo() {
			System.out.println("["+xPos+","+yPos+"]");
		}
	}


}
