package Java2class;

public class Java2 {

	public static void main(String[] args) {
		
			  Circle c=new Circle(2,2,4);
			  c.showCirclelnfo();
	}
	class point{
		int xPos,yPos;
		public point(int x,int y) {
			xPos = x;
			yPos = y;
			}
		public void showPointUnfo() {
			System.out.println("["+xPos+","+yPos+"]");
		}
	}
	class Cricle{
		int rad;
		Point center;
		
	public Circle (int x,int y,int r) {
			center=new Point(x,y);
			rad=r;
			
		}
	}
	}

