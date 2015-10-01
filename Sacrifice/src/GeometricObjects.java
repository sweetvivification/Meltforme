
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
}


