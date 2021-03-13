package condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
            if (Math.abs(x1 - x2) != Math.abs(y1 - y2)) {
            return 0;
        }
        return Math.abs(y1 - y2);
    }

    public static void main(String[] args) {

        int path = ChessBoard.way(-4, 0, 0, 4);
        if (path == 0) {
            System.out.println("Incorrect move");
        } else {
            System.out.println("The number of moves: " + path);
        }
    }
}
