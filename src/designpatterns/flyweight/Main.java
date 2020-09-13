package designpatterns.flyweight;

public class Main {

	public static void main(String[] args) {
		PieceFactory factory = new PieceFactory();
		Piece whitePiece = factory.getPiece("白色");
		whitePiece.setPosition(new Position(1, 1));
		whitePiece.show();
		
		Piece whitePiece2 = factory.getPiece("白色");
		whitePiece2.setPosition(new Position(2, 2));
		whitePiece2.show();
		
		Piece blackPiece = factory.getPiece("黑色");
		blackPiece.setPosition(new Position(3, 3));
		blackPiece.show();
		
		Piece blackPiece2 = factory.getPiece("黑色");
		blackPiece2.setPosition(new Position(4, 4));
		blackPiece2.show();
		
		System.out.println("对象个数："+factory.getPieceCount());
	}

}
