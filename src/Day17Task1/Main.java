package Day17Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {




        //ChessPiece[] chessPieces = {ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,
        //ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK};

        //System.out.println(Arrays.toString(chessPieces));


       ChessPiece[][] chessPieces = new ChessPiece[][]{
               {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_BLACK,ChessPiece.KING_BLACK,ChessPiece.EMPTY},
               {ChessPiece.EMPTY,ChessPiece.ROOK_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK},
               {ChessPiece.PAWN_BLACK,ChessPiece.KNIGHT_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY},
               {ChessPiece.QUEEN_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
               {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_BLACK,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
               {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY},
               {ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.QUEEN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE},
               {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_WHITE,ChessPiece.KING_WHITE,ChessPiece.EMPTY}
        };



       ChessBoard chessBoard = new ChessBoard(chessPieces);
       chessBoard.printBoard();












    }
}
