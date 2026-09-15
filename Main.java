import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    //Enums for PieceType,Color, and Location of x
    enum Color {
        WHITE, BLACK
    }
    enum PieceType {
        PAWN, KNIGHT, BISHOP, ROOK, KING, QUEEN
    }
    enum LocationColumn  {
        A, B, C, D, E, F, G, H
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //User input collection and error handling for piece type selection
        PieceType pieceName; //Create variable to hold enum value for piece type
        while (true){ //Loop to keep asking for user input in case user enters invalid piece type
            System.out.println("Available Chess Pieces: \n1.Pawn \n2.Knight \n3.Bishop \n4.Rook \n5.King \n6.Queen");
            System.out.print("Select a piece by typing its name: ");
            String userInput = input.nextLine().toUpperCase(); //Turns user answer into uppercase to match enum values

            try{ //Try catch block to catch invalid piece type input
            pieceName = PieceType.valueOf(userInput.toUpperCase());
            System.out.println("You selected: " + pieceName);
            break; //Breaks out of the loop if user input is valid
            } catch(IllegalArgumentException e){
                System.out.println("Invalid piece type. Please select a valid piece.");
            }
        }
        
        //User input collection and error handling for color selection
        Color pieceColor; //Create variable to hold enum value for color
        while (true){ //Loop to keep asking for user input in case user enters invalid color
            System.out.println("Chose Colors: \n1.White \n2.Black");
            System.out.print("Select a color by typing it: ");
            String userInput = input.nextLine().toUpperCase(); //Turns user answer into uppercase to match enum values

            try{ //Try catch block to catch invalid color input
            pieceColor = Color.valueOf(userInput.toUpperCase());
            System.out.println("You selected: " + pieceColor);
            break; //Breaks out of the loop if user input is valid
            } catch(IllegalArgumentException e){
                System.out.println("Invalid color. Please select a valid color.");
            }
        }

        //asking user to prompt starting position
        LocationColumn startingColumn;

        while (true) { // loop to keep asking for the user input in case user enters invalid column
            System.out.print("Enter the starting column by typing a letter (a-h): ");
            String userInput = input.nextLine().trim().toUpperCase(); //Turns user answer into uppercase to match enum values

            try {
                startingColumn = LocationColumn.valueOf(userInput.toUpperCase());
                System.out.println("You selected column: " + startingColumn);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid column. Please select a valid column.");
            }

        }

        int startingRow;
        while(true) { //loop to keep asking for the user input in case user enters invalid row
            System.out.print("Enter the starting row by typing a number (1-8): ");
            String userInput = input.nextLine().trim();

            try {
                startingRow = Integer.parseInt(userInput);

                if (startingRow >= 1 && startingRow <= 8) {
                    System.out.println("You selected: " + startingRow);
                    break;
                } else {
                    System.out.println("Please enter a number beetween 1-8:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer number.");
            }
        }

        //verify if the starting position is within the chesboard
        Chessboard board = new Chessboard();
        char currentColumn = startingColumn.name().charAt(0);
        boolean isValid = board.withinChessboard(currentColumn, startingRow);
        System.out.println(pieceColor.name() + " " + pieceName.name() + " at (" + startingColumn + ", " + startingRow + ") is within board? " + isValid);
    }
}