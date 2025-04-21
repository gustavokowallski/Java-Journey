package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
	private Double widht;
	private Double height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(Color color, Double widht, Double height) {
		super(color);
		this.widht = widht;
		this.height = height;
	}

	public Double getWidht() {
		return widht;
	}

	public void setWidht(Double widht) {
		this.widht = widht;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() { //implementando um metódo para o rectangle
		return widht *height;
	}
	
	
	
}
