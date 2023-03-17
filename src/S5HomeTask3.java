import com.sun.xml.internal.bind.v2.TODO;

public class S5HomeTask3 {
    //    На шахматной доске расставить 8 ферзей так,
//    чтобы они не били друг друга. И вывести Доску.
//0x000000
//0000x000
//00x00000
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        int size = input.Int("Задайте размер поля");
        printBoard(table(size, size));
        System.out.println("Введите координаты для первого ферзя");
        int x = input.Int("x: ");
        int y = input.Int("y: ");
        String[][] first = topography(table(size, size), x, y);
        printBoard(first);
        System.out.println();
        String[][] res = nextQuin(first, x, y, 0);
        printBoard(res);

    }

    public static String[][] table(int sizeX, int sizeY) {
        String[][] chessBoard = new String[sizeX][sizeY];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
//                if (i == 0) {
//                    Integer x = j;
//                    chessBoard[i][j] = x.toString();
//                } else if (j == 0) {
//                    Integer y = i;
//                    chessBoard[i][j] = y.toString();
//                } else
                    chessBoard[i][j] = "o";
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

    public static String[][] topography(String[][] board, int x, int y) {
        String[][] filledBoardFirst = board;
        filledBoardFirst[x][y] = "x";
        return filledBoardFirst;
    }

//    public static String[][] nextQuin(String[][] board, int xs, int ys, int stepIndex, int counter) {
//        String[][] filledBoard = board;
//        if (counter == 8) return filledBoard;
//
//        if (stepIndex>7) stepIndex = 0;
//        int[][] steps = new int[8][];
//        steps[0] = new int[]{-2, -1};
//        steps[1] = new int[]{-2, 1};
//        steps[2] = new int[]{-1, -2};
//        steps[3] = new int[]{-1, 2};
//        steps[4] = new int[]{1, -2};
//        steps[5] = new int[]{1, 2};
//        steps[6] = new int[]{2, -1};
//        steps[7] = new int[]{2, 1};
//        int xStep = steps[stepIndex][0];
//        int yStep = steps[stepIndex][1];
//
//        int x = xs;
//        int y = ys;
//        while (counter < 8) {
//            try {
//                if (filledBoard[x][y].contains("o")) {
//                    if (freeCell(filledBoard,x,y)) {
//                        filledBoard[x][y] = "x";
//                        counter++;
//                    }
//                        xs += xStep;
//                        ys += yStep;
//
//                } else {
//                    x += xStep;
//                    y += yStep;
//                }
//            } catch (IndexOutOfBoundsException e) {
//                return nextQuin(filledBoard, xs, ys, stepIndex+1, counter);
//            }
//        }
//        return filledBoard;
//    }

    public static String[][] nextQuin(String[][] board, int x, int y, int counter){
        while (counter < 8) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (freeCell(board, i, j)) {
                        board[i][j] = "x";
                        counter++;
                        printBoard(board);
                        System.out.println();
                    }
                }

            }
        }
        return board;
    }
    public static boolean freeCell (String[][] board, int x, int y){
        for (int i = 0; i < board.length; i++) {
            if (board[x][i].equals("x") ||
                    board[i][y].equals("x") ||
                    board[x][y].equals("x")) return false;
        }
        for (int i = 0; i < board.length; i++) {
            if ((x+i < board.length && y+i< board.length)) {
                if (board[x + i][y + i].equals("x")) return false;
            }
            if ((x-i >= 0 && y-i >= 0)) {
                if (board[x - i][y - i].equals("x")) return false;
            }
            if ((x+i < board.length && y-i >= 0)) {
                if (board[x + i][y - i].equals("x")) return false;
            }
            if ((x-i >= 0 && y+i < board.length)) {
                if (board[x - i][y + i].equals("x")) return false;
            }
        }
        return true;
    }

}