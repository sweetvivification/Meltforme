
public class GeometricObjects {
public Vertex pos;
double height;
double width;

public double getHeight(){return height;
}
public double getWidth(){return width;
}
public Vertex getPos(){return pos;
}

public GeometricObjects(double height, double width, Vertex pos){
	this.pos=pos;
	this.height=height;
	this.width=width;
	
	if(width<0){
		width= -width;
		pos.x =pos.x -width;
	}
	if(height<0){
		height = -height;
		pos.y =pos.y -height;
		
	}
}
public GeometricObjects(double hight, double width){
	this(hight, width, new Vertex(0,0));
}

public GeometricObjects(double height){
	this(height,height);
}
public GeometricObjects(){
	this(10);
}
public GeometricObjects(Vertex pos){
	this(0,0,pos);
}
public String toString(){
	return "width="+width+"height="+height+"position="+pos;
	
}
public double circumference(){
	return 2*(width+height);
	}//Umfang
public double area(){
	return height*width;
}
public boolean contains(Vertex v){
	return v.x >= pos.x && v.x <=pos.x+width &&
			v.y >=pos.y && v.y <=pos.y+height;
}
public boolean isLargerThan(GeometricObjects that)
{return that.area() > this.area();

}
public void moveTo(Vertex pos){
	this.pos=pos;
}
}
