package chess;

import boardlayer.Board;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8); // quem precisa saber as dimensoes do tabuleiro e a classe ChessMatch
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];// o programa deve ter acesso somente
		for(int i=0;i<board.getRows();i++) {																			// as classes da camada de Chess e
			for(int j=0;j<board.getColumns();j++) {
				mat[i][j]=(ChessPiece)board.piece(i, j);//downcasting
			}
		}
		return mat;
																					// nao da de tabuleiro, por isso a
																					// matriz que ele tem acesso e do
																					// tipo ChessPiece e nao Piece
	}
}
