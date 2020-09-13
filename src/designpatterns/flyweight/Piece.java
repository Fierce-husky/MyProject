package designpatterns.flyweight;

public class Piece {
	private String color;
	
	private Position position;

	public Piece(String color) {
		super();
		this.color = color;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	public void show() {
		System.out.println(color+"棋子，位置"+position);
	}
}
