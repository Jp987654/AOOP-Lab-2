public class Chessboard {
    public static final int MAX_ROW = 8;
    public static final int MIN_ROW = 1;
    public static final char MIN_COL = 'a';
    public static final char MAX_COL = 'h';

    public boolean withinChessboard(char column, int row){
        char lowerColumn = Character.toLowerCase(column);

        if (lowerColumn < MIN_COL || lowerColumn > MAX_COL) {
            return false;
        }
        if (row < MIN_ROW || row > MAX_ROW) {
            return false;
        }
        return true;
    }
}
