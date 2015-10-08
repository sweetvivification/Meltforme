
public class TestGeometricObjects {
	
public static void main(String[] args){
	GeometricObjects o1 = new GeometricObjects(17,4, new Vertex(42,23));
	GeometricObjects o2 = new GeometricObjects(17,4);
	GeometricObjects o3 = new GeometricObjects(17);
	GeometricObjects o4 = new GeometricObjects();
	
	System.out.println(o1.equals(o2));
	o2.moveTo(42,23);
	System.out.println(o1.equals(o2));
	System.out.println(o3.contains(new Vertex(10,3)));
	System.out.println(o4);
}
}
