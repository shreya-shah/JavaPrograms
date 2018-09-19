public class Chessboard {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();
        chessboard.createChessboard(8);
    }

    public void createChessboard(int size){
        String[][] board = new String[size][size];
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if(i%2==0 && j%2==0){
                    board[i][j] = "WW";
                }else if(i%2==0 && j%2!=0){
                    board[i][j] = "BB";
                }else if(i%2!=0 && j%2==0){
                    board[i][j] = "BB";
                }else{
                    board[i][j] = "WW";
                }
            }
        }

        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
    }
}
