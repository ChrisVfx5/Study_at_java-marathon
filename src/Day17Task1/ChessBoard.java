package Day17Task1;

import java.util.Arrays;

public class ChessBoard {


    private ChessPiece [][] figures;

    ChessBoard(ChessPiece[][] figures){
        this.figures = figures;
    }


    public void printBoard(){
        for (int i = 0; i < figures.length; i++){
            for (int j = 0; j < figures[i].length; j++){
                System.out.print(figures[i][j].getDesignationOfFigure());
            }
            System.out.println();
        }

    }


}
