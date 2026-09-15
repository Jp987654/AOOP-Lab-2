public class Knight { //Author Dante Alanis Meraz
    //Knight Attributes
    private String piece_name;
    private String color;
    private char column;
    private int row;

    //Empty Knight Constructor
    public Knight() {
    }

    //Knight constructor that takes color, x, y
    public Knight(String color, char column, int row) {
        //this.piece_name = piece_name;
        this.color = color;
        this.column = Character.toLowerCase(column);
        this.row = row;
    }

    //Getters for name, color, x, y
    public String getPiece_name() { return piece_name; }
    public String getColor() { return color; }
    public char getColumn() { return column; }
    public int getRow() { return row; }

    //Setters for x and y
    public void setColumn(char column) { this.column = Character.toLowerCase(column); }
    public void setRow(int row) { this.row = row; }

    // Method for target verification
    public boolean verifyTarget(char targetColumn, int targetRow) {
        //checking if the target position is the same as the starting position
        if (this.column == Character.toLowerCase(targetColumn) && this.row == targetRow) {
            return false;
        }
        //checking logic for valid piece move
        int colDiff = Math.abs(Character.toLowerCase(targetColumn) - Character.toLowerCase(column));
        int rowDiff = Math.abs(targetRow - row);

        if ((colDiff == 2 && rowDiff == 1) || (colDiff == 1 && rowDiff == 2)) {
            return true;
        }
        return false;
    }
}