public class Pawn { 
    //Pawn Attributes
    private String color;   
    private char column;
    private int row;

    //Empty Pawn Constructor
    public Pawn(){ 
    }
    //Pawn constructor that takes color, x, y
    public Pawn(String color, char column, int row){ 
        this.color = color;
        this.column = column;
        this.row = row;
    }
    //Getters for color, x, y
    public String getColor(){
        return color;
    }
    public char getColumn(){
        return column;
    }
    public int getRow(){
        return row;
    }
    //Setters for x and y
    public void setColumn(char column){
        this.column =column;
    }
    public void setRow(int row){
        this.row =row;
    }
    // Method for target verification
    public boolean verifyTarget(char column,int row){
        return false;
    }
}
