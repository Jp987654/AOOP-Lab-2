import java.io.*;
import java.util.Scanner;
public class Main {
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.println("Available Chess Pieces: \n1.Pawn \n2.Kight \n3.Bishop \n4.Rook \n5.King \n6.Queen");
   System.out.print("Select a pice: ");
   int pieceChoice = input.nextInt();
   //TO-DO ERROR HANDELING FOR INCORRECT PICE + I THINKS ITS SUPOSED TO BE A CHAR
   System.out.println("Please Select a Color: 1.Black 2.White");
   int pieceColor = input.nextInt();
   System.out.println("Please Enter a column: (a-h)");
   char pieceColumn = input.next().charAt(0);
   System.out.print("Please Enter a row: (1-8)");
   int pieceRow = input.nextInt();
   System.out.println(pieceColor);

 }
}