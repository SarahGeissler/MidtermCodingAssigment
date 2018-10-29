package pkgShape;

public class Rectangle extends Shape {

	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength) {
		this.iWidth = iWidth;
		this.iLength = iLength;
	}

	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int iWidth) {
		iWidth = this.iWidth;
	}
	
	public int getiLength() {
		return iLength;
	}
	
	public void setiLength(int iLength) {
		iLength = this.iLength;
	}
	
	@Override
	public double area() {
		return iLength * iWidth;
	}
	
	@Override
	public double perimeter() {
		return (2*(iLength + iWidth));
	}
	
	public int compareTo(Object r) {
		Rectangle rec1 = (Rectangle) r;
		return(Double.compare(this.area(), rec1.area()));
	}
}