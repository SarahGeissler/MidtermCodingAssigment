package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {

	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth,iLength);
		this.iDepth = iDepth;
	}

	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int iDepth) {
		iDepth = this.iDepth;
	}
	
	public double volume() {
		return (iDepth * getiLength() * getiWidth());
	}
	
	@Override
	public double area() {
		return (2*((getiWidth() * getiLength()) + (iDepth * getiLength())+ (iDepth * getiWidth())));
	}
	
	public double perimeter() {
		throw new UnsupportedOperationException("Cannot compute the perimeter of a Cuboid");
	}
	
	public int compareTo(Object c) {
		Cuboid cub1 = (Cuboid) c;
		return(Double.compare(this.area(), cub1.area()));
	}
	
	class SortByArea implements Comparator<Cuboid>{
		
		public int compare(Cuboid c1, Cuboid c2) {
			return (int) (c1.area()-c2.area());
		}
	}
	
	class SortByVolume implements Comparator<Cuboid>{

		public int compare(Cuboid c1, Cuboid c2) {
			return (int) (c1.volume()-c2.volume());
		}
	}
}