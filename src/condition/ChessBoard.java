package condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {

        if ((x1 < 0 || x1 > 7) || (y1 < 0 || y1 > 7)) {
            return -1;
        } else if ((x2 < 0 || x2 > 7) || (y2 < 0 || y2 > 7)) {
            return -1;
        } else if ((x1 == x2) || (y1 == y2) || (Math.abs(x1 - x2) != Math.abs(y1 - y2))) {
            return 0;
        }
        return Math.abs(y1 - y2);
    }

    public static void main(String[] args) {

        int path = ChessBoard.way(-5, 0, 5, 4);
        if (path == 0) {
            System.out.println("Incorrect move");
        } else if (path == -1) {
            System.out.println("Incorrect data");
        } else {
            System.out.println("The number of moves: " + path);
        }
    }
}
