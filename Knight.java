public class Knight {
    private String color;//Knight Attributes
    private char column;
    private int row;

    public Knight(){//Empty Knight Constructor
    }
    //Knight constructor that takes color, x, y
    public Knight(String color, char column, int row){ 
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
