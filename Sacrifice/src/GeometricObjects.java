public class GeometricObjects {

	public Vertex pos;
	public double height;
	public double width;
	
	
	public GeometricObjects(double width, double height, Vertex pos){
		this.pos=pos;
		this.width=width;
		this.height=height;
		
		if(this.width<0){
			this.width = -this.width;
			pos.x = pos.x -this.width;
			}
		if(this.height<0){
			this.height = -this.height;
			pos.y = pos.y -this.height;
			}
	
	}
	
	public GeometricObjects(double width, double height){
		this(width, height, new Vertex(0,0));
	}
	
	public GeometricObjects(double width){this(width,width);}
	
	public GeometricObjects(Vertex pos){this(0,0,pos);}
	
	public GeometricObjects(){this(10);}
	
    public double getWidth(){return width;}
	
    public double getHeight(){return height;}
    
    public Vertex getPos(){return pos;}
	
    public String toString(){
    	return "width="+width+", height="+height+", pos="+pos;
    }
    public double circumference(){return 2*(width+height);} 
        
    public double area(){return width*height;}
    
    public boolean contains(Vertex v){
    	return v.x >=pos.x && v.x <=pos.x+width // ist x drin?
    	&& v.y >=pos.y && v.y <=pos.y+height;  // ist y drin?
    }
    
    public boolean isLargerThan(GeometricObjects that){
    	return this.area()>that.area();
    }
    
    public void moveTo(Vertex pos){this.pos=pos;}
    
    public void moveTo(double x, double y){
    	moveTo(new Vertex(x,y));
    }
    
    public void move(Vertex v){moveTo(pos.add(v));
}
    public boolean equals(Object thatObject){
		if(thatObject instanceof GeometricObjects){
			GeometricObjects that = (GeometricObjects)thatObject;
			
			return this.width==this.width && this.height == that.height
					&&this.pos.equals(that.pos);
		 }
		return false;
		}

}


