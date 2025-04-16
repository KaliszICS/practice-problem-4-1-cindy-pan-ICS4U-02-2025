
	public class Rectangle{
		private double length;
		private double width;
	
	public Rectangle(double length1,double width1){
		this.width = width1;
		this.length = length1;
	}
	public double getLength(){
		return this.length;
	}
	public double getWidth(){
		return this.width;
	}
	public double area(){
		return (this.length * this.width);
	}
	public double perimeter(){
		return (this.length+this.width)*2;
	}
}

