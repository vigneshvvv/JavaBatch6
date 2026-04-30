package sample;

public class Dimensions {
	


	double width;
	double height;
	double depth;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	@Override
	public String toString() {
		return "Dimensions [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}
	

}
