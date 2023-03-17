public class test {
    public static void main(String[] args) {
        String[][] tesTable =table(8,8);
//        printBoard(tesTable);
        freeCell(tesTable, 7, 6);
        printBoard(tesTable);

    }
    public static String[][] table(int sizeX, int sizeY) {
        String[][] chessBoard = new String[sizeX + 1][sizeY + 1];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
//                if (i == 0) {
//                    Integer x = j;
//                    chessBoard[i][j] = x.toString();
//                } else if (j == 0) {
//                    Integer y = i;
//                    chessBoard[i][j] = y.toString();
//                } else
                    chessBoard[i][j] = "oo";
            }
        }
        return chessBoard;
    }

    public static void printBoard(String[][] board) {
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                System.out.printf("%s ", board[x][y]);
            }
            System.out.println();
        }
    }

    public static void freeCell (String[][] board, int x, int y){
        int limit;
        if (x >= y) limit = x;
        else limit = y;
        for (int i = 0; i < board.length; i++) {
            board[x][i]="xi";
            board[i][y]="iy";
            board[x][y]="MW";
        }
        for (int i = 0; i < board.length; i++) {
            if ((x+i < board.length && y+i< board.length)) {
                board[x + i][y + i] = "##";
            }
            if ((x-i >= 0 && y-i >= 0)) {
            board[x-i][y-i] = "##";
            }
            if ((x+i < board.length && y-i >= 0)) {
                board[x+i][y-i] = "**";
            }
            if ((x-i >= 0 && y+i < board.length)) {
            board[x-i][y+i] = "**";
            }
        }

    }
}
