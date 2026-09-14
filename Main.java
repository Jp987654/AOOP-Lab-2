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
    enum LocationX  {
        A, B, C, D, E, F, G, H
    }
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   //User input collection and error handling for piece type selection
   PieceType piece; //Create variable to hold enum value for piece type
   while (true){ //Loop to keep asking for user input in case user enters invalid piece type
    System.out.println("Available Chess Pieces: \n1.Pawn \n2.Knight \n3.Bishop \n4.Rook \n5.King \n6.Queen");
    System.out.print("Select a piece by typing its name: ");
    String userInput = input.nextLine().toUpperCase(); //Turns user answer into uppercase to match enum values

    try{ //Try catch block to catch invalid piece type input
    PieceType pieceType = PieceType.valueOf(userInput.toUpperCase());
    System.out.println("You selected: " + pieceType);
    break; //Breaks out of the loop if user input is valid
      }
   catch(IllegalArgumentException e){
    System.out.println("Invalid piece type. Please select a valid piece.");
    }
   }

   //User input collection and error handling for color selection
   Color color; //Create variable to hold enum value for color
   while (true){ //Loop to keep asking for user input in case user enters invalid color
    System.out.println("Chose Colors: \n1.White \n2.Black");
    System.out.print("Select a color by typing it: ");
    String userInput = input.nextLine().toUpperCase(); //Turns user answer into uppercase to match enum values

    try{ //Try catch block to catch invalid color input
    Color pieceColor = Color.valueOf(userInput.toUpperCase());
    System.out.println("You selected: " + pieceColor);
    break; //Breaks out of the loop if user input is valid
      }
   catch(IllegalArgumentException e){
    System.out.println("Invalid color. Please select a valid color.");
    }
   }
 }
}