
public class SimpleTriangle extends GeometricObjects {
	public SimpleTriangle(double w, double h, Vertex pos){
		super(w,h,pos);
	}
	@Override public double area(){return width*height/2;}	
	
	
	@Override public String toString(){
		return "SimpleTriangle("+super.toString()+")"; //

	
}
	@Override public boolean equals(Object that){
		return (that instanceof SimpleTriangle) && 
				super.equals(that);
	}
}