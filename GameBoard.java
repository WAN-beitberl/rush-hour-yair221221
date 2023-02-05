
import java.util.Scanner;

public class GameBoard  {
    String [][] GameBoard;

    public static void main(String[] args) {
       pieces[] piecesArray = new pieces[8];
       piecesArray[0] = new pieces();
       piecesArray[0].create_piece("vertically", 3, 0, 0, 'Y');
       piecesArray[1] = new pieces();
       piecesArray[1].create_piece("vertically", 3, 1, 3, 'Q');
       piecesArray[2] = new pieces();
       piecesArray[2].create_piece("horizontally", 3, 5, 2, 'R');
       piecesArray[3] = new pieces();
       piecesArray[3].create_piece("vertically", 3, 3, 5, 'O');
       piecesArray[4] = new pieces();
       piecesArray[4].create_piece("horizontally", 2, 0, 1, 'F');
       piecesArray[5] = new pieces();
       piecesArray[5].create_piece("vertically", 2, 3, 0, 'B');
       piecesArray[6] = new pieces();
       piecesArray[6].create_piece("horizontally", 2, 4, 1, 'C');
       piecesArray[7] = new pieces();
       piecesArray[7].create_piece("horizontally", 2, 2, 1, 'X');


       char[][] gameboard = new char[6][6];
       pieces GameBoard = new pieces();
       GameBoard.initializeBoard(gameboard);


      // System.out.println(gameboard[2][3]);

       GameBoard.AddPiece(gameboard, piecesArray[0]);
       GameBoard.AddPiece(gameboard, piecesArray[1]);
       GameBoard.AddPiece(gameboard, piecesArray[2]);
       GameBoard.AddPiece(gameboard, piecesArray[3]);

       GameBoard.AddPiece(gameboard, piecesArray[4]);
       GameBoard.AddPiece(gameboard, piecesArray[5]);
       GameBoard.AddPiece(gameboard, piecesArray[6]);


       GameBoard.AddPiece(gameboard, piecesArray[7]);

       GameBoard.PrintBoard(gameboard);
       boolean win = false;
       while (!win){
          System.out.println("please enter the char of the car that you want to move");
          Scanner scan = new Scanner(System.in);
          char move_car = scan.next().charAt(0);
          int i;
          for(i = 0; i < 8; i++){
             if(piecesArray[i].Symbol == move_car){
                break;
             }
          }

          GameBoard.DeletePiece(gameboard, piecesArray[i]);
          GameBoard.MovePiece(piecesArray[i]);
          win = GameBoard.AddPiece(gameboard, piecesArray[i]);
          GameBoard.PrintBoard(gameboard);
       }









    }



}

