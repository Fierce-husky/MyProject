package designpatterns.flyweight;

import java.util.Hashtable;

public class PieceFactory {
	private Hashtable<String, Piece> pieces = new Hashtable<String, Piece>();
	
	public Piece getPiece(String key) {
		if (!pieces.containsKey(key)) {
			pieces.put(key, new Piece(key));
		}
		return pieces.get(key);
	}
	
	public int getPieceCount() {
		return pieces.size();
	}
}
