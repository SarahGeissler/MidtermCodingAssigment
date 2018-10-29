package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTests {

	@Test
	public void RectangleConstructorTest() {
		Rectangle rec1 = new Rectangle(4, 5);
		assertEquals(true, rec1 instanceof Rectangle);
		}
	
	@Test
	public void testSetandGetiLength() {
		Rectangle rec1 = new Rectangle(4,5);
		assertEquals(5, rec1.getiLength());
	}
	
	@Test
	public void testSetandGetiWidth() {
		Rectangle rec1 = new Rectangle(4,5);
		assertEquals(4, rec1.getiWidth());
	}
	
	@Test
	public void testArea() {
		Rectangle rec1 = new Rectangle(4,5);
		assertEquals(20, rec1.area());
	}
	
	@Test
	public void testPerimeter() {
		Rectangle rec1 = new Rectangle(4,5);
		assertEquals(18, rec1.perimeter());
	}
	
	@Test
	public void rectangleTestCompareTo() {
        Rectangle rec1 = new Rectangle(2,2);
        Rectangle rec2 = new Rectangle(4,6);
        assertTrue(Integer.signum(rec1.compareTo(rec2)) == -Integer.signum(rec2.compareTo(rec1)));
	}
	
	@Test
	public void CuboidConstructorTest() {
		Cuboid cub1 = new Cuboid(2,3,4);
		assertEquals(true, cub1 instanceof Cuboid);
	}
	
	@Test
	public void testSetandGetiLengthCuboid() {
		Cuboid cub1 = new Cuboid(4,5,6);
		assertEquals(5, cub1.getiLength());	
	}
	
	@Test
	public void testSetandGetiWidthCuboid() {
		Cuboid cub1 = new Cuboid(4,5,6);
		assertEquals(4, cub1.getiWidth());	
	}
	
	@Test
	public void testSetandGetiDepth() {
		Cuboid cub1 = new Cuboid(4,5,6);
		assertEquals(6, cub1.getiDepth());	
	}
	
	@Test
	public void testAreaCuboid() {
		Cuboid cub1 = new Cuboid(4,5,6);
		assertEquals(148, cub1.area());	
	}

	@Test
	public void PerimeterExceptionTest() {
	    try {
	    	Cuboid cub1 = new Cuboid(4,5,6);
	        cub1.perimeter();
	        fail("expected exception was not occured.");
	    } catch(UnsupportedOperationException e) {
	    }
	}
	
	@Test
	public void sortByAreaTest() {
		Cuboid cub1 = new Cuboid(2,2,2);
	    Cuboid cub2 = new Cuboid(3,3,3);
	    assertTrue(Integer.signum(cub1.compareTo(cub2)) == -Integer.signum(cub2.compareTo(cub1)));
		}
	
	@Test
	public void sortByVolumeTest() {
		Cuboid cub1 = new Cuboid(2,2,2);
	    Cuboid cub2 = new Cuboid(3,3,3);
	    assertTrue(Integer.signum(cub1.compareTo(cub2)) == -Integer.signum(cub2.compareTo(cub1)));
		}
}

	
	
	
