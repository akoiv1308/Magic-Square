/* Websites Used */
// https://www.mathpages.com/home/kmath417.htm 
// https://cosmosmagazine.com/mathematics/how-solve-magic-square 

//importing java library
import java.util. *;

public class Main {
  public static void main (String[] args) {
    // creating a while loop to determine whether the user wants to continue after the code is executed//
    System.out.println("MAGIC SQUARE PROGRAM");
    boolean run = true;
    while(run) {
      // asking user for square specifications //
      Scanner input = new Scanner(System.in);
      System.out.println("\nWhat's the size of a magic square? ");
      int num = input.nextInt();
      // creating a 2D array //
      int square[][] = new int[num][num];
      // enter array elements //
      System.out.println("Enter " + (num*num) + " Array Elements : ");
      for(int i = 0; i < num; i++) {
       for(int j = 0; j < num; j++) {
         square[i][j] = input.nextInt();
       }
      }
      // printing a 2D array //
      System.out.print("The Array is :\n");
      for(int i = 0; i < num; i++) {
       for(int j = 0; j < num; j++) {
         System.out.print(square[i][j]+ "  ");
       }
       System.out.println();
      }
      // printing results //
      if(magicSquare(square, num)) {
        System.out.println("It's a Magic Square!");
      }
      else {
        System.out.println("Not a Magic Square!");
      }
      System.out.println("\nDo you want to contine? y/n");
      String s = input.next();
      if(s.equalsIgnoreCase("y")) {
        run = true;
      }
      else {
        run = false;
      }
    }
  }

  public static boolean magicSquare(int[][] arr, int n) {
    // initializing variable total to count the sum of numbers diagonally //
    int total = 0; 
    // going through each number and adding to total //
    for(int i = 0; i < n; i++) {
      total+=arr[i][i]; 
    }
    // going through each row //
    for (int i = 0; i < n; i++) { 
      // initializing variabel rowTotal for each row //
      int rowTotal = 0; 
      // adding each number to rowTotal //
      for (int j = 0; j < n; j++) {
        rowTotal+=arr[i][j];
      } 
      // checking whether every row sum is equal to diagonal total //
      if (rowTotal != total) {
        return false; 
      }
    } 
  
    // going through each column // 
    for (int i = 0; i < n; i++) { 
      // colTotal for each column total amount //
      int colTotal = 0; 
      for (int j = 0; j < n; j++) {
        // adding numbers in a certain column //
        colTotal+=arr[j][i];
      } 
      // check whether every column total is equal to diagonal total //
      if (total != colTotal) {
        return false;
      } 
    }
    // if its a magic square, meaning every total variable adds up to certain amount, then return true // 
    return true; 
  }
}
