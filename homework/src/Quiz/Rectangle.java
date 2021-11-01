package Quiz;

public class Rectangle {
	//필드
	private double width;
	private double height;
	
	//생성자
	public Rectangle(double d, double e) {
	this.width = d;
	this.height = e;
	}
	//메소드
	double getArea() {
		return width * height;
	}
	double getCircumference() {
		return (width + height) * 2;
	}
	
	public static void main(String[] args) {
	Rectangle rc = new Rectangle(3.82, 8.65);
	System.out.println("면적: " + rc.getArea());
	System.out.println("둘레: " + rc.getCircumference());
}
}