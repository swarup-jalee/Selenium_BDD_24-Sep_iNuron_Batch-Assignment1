package assignments_set1;

public class Swipe_Numbers {

	public static void main(String[] args) {
		int x=90;
		int y=50;
		System.out.println("Before Swapping of Numbers");
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		
		x=x+y;//now x=30
		y=x-y;//now y=10
		x=x-y;//now x=30-10=20
		
		System.out.println("After Swapping of Numbers");
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}

}
