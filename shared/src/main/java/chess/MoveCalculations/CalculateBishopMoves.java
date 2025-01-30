package chess.MoveCalculations;

import chess.*;
import java.util.Collection;
import java.util.HashSet;

public class CalculateBishopMoves implements PieceMoveCalculator {

    public static Collection<ChessMove> getMoves(ChessBoard board, ChessPosition position) {
        int[][] bishopMoves = {{1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
        return PieceMoveCalculator.slidingPieces(board, position, bishopMoves);
    }
}
