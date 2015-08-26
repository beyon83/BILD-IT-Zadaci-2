package zadaci_25_08_2015;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	
	/** Empty constructor */
	protected GeometricObject() {
		
	}
	
	/** Abstract method for area of the object */
	public abstract double getArea();
	
	/** Abstract method for perimeter of the object */
	public abstract double getPerimeter();
	
	/** max() method that compares two objects */
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		if (o1.compareTo(o2) > 0 ) {
			return o1;
		} else {
			return o2;
		}
	}
	
	/** Comparable interface */
	public interface Comparable {
		public int compareTo(GeometricObject o);
	}
	
	/** compareTo() method that compares two objects */
	@Override
	public int compareTo(GeometricObject o) {
		if (this.getArea() > o.getArea()) {
			return 1;
		} else if (this.getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}
