import java.util.Scanner;
public class pieces {
    String Direction;
    int Size;
    int Row;
    int Col;
    char Symbol;

    public void create_piece(String direction,int size, int row, int col, char symbol){
        this.Direction = direction;
        this.Size = size;
        this.Row = row;
        this.Col = col;
        this.Symbol = symbol;
    }
    public void initializeBoard(char [][] GameBoard){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                GameBoard[i][j] = ' ';
            }
        }

    }
    public boolean AddPiece(char[][] BoardGame, pieces new_piece) {
        if(new_piece.Symbol == 'X'){
            if(new_piece.Row == 2 && new_piece.Col == 5){
                return true;
            }
        }
        if(BoardGame[new_piece.Row][new_piece.Col] != ' '){
            System.out.println("ILLEGAL MOVE");
            return false;
        }
        if(new_piece.Row >= 6 || new_piece.Col >= 6){
            System.out.println("ILLEGAL MOVE");
            return false;
        }
        if(new_piece.Row < 0 || new_piece.Col < 0){
            System.out.println("ILLEGAL MOVE");
            return false;
        }

        if(new_piece.Direction == "vertically"){
        for(int i = new_piece.Row; i < new_piece.Row + new_piece.Size; i++) {
            BoardGame[i][new_piece.Col] = new_piece.Symbol;
        }
        }else{
            for(int i = new_piece.Col; i < new_piece.Col + new_piece.Size; i++) {
                BoardGame[new_piece.Row][i] = new_piece.Symbol;
            }
        }
        return false;
    }
    public void DeletePiece(char[][] BoardGame, pieces new_piece) {
        if(new_piece.Direction == "vertically"){
            for(int i = new_piece.Row; i < new_piece.Row + new_piece.Size; i++) {
                BoardGame[i][new_piece.Col] = ' ';
            }
        }else{
            for(int i = new_piece.Col; i < new_piece.Col + new_piece.Size; i++) {
                BoardGame[new_piece.Row][i] = ' ';
            }
        }
    }
    public void PrintBoard(char[][] GameBoard){
        for(int i = 0; i < 20; i++){
            System.out.println();
        }

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(GameBoard[i][j]);
            }
            System.out.print('\n');
        }
    }
    public void MovePiece( pieces Move_Piece){

        Scanner scan = new Scanner(System.in);
        char dir = scan.next().charAt(0);
        if(Move_Piece.Direction == "vertically"){
             if (dir == 'w'){
                  Move_Piece.Row-- ;

             }
             if(dir == 's'){
                 Move_Piece.Row++ ;

             }

        }else {
            if (dir == 'd') {
                 Move_Piece.Col++;

            }
            if (dir == 'a') {
               Move_Piece.Col --;
            }
        }
    }

}
