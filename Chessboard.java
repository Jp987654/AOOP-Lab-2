public class Chessboard {
    final int MAX_ROW = 8;
    final int MIN_ROW = 1;

    public boolean withinChessboard(char column, int row){
        if (column < 'a' || column > 'h') {
            return false;
        }
        else if (row < MIN_ROW || row > MAX_ROW) {
            return false;
        }
        else {
            return true;
        }
    }
}
