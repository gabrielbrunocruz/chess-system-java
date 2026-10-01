package boardlayer;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) { //a posicao de uma peca recem criada e nula, por isso nao passamos no construtor
		this.board = board;
		position = null;
	}


	protected Board getBoard() {
		return board;
	}


	
	
	
	
	

}
