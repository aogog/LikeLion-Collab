package work.com.workshop5.shape;

public class Triangle extends Shape implements Resize {

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getArea() {
		return (this.getWidth() * this.getHeight()) / 2;
	}

	@Override
	public void setResize(int size) {
		// Triangle에서의 setResize() 함수는 세로(height)의 값에 size 값을 더한다
		this.setHeight(this.getHeight() + size);	
	}
	
	
	
}