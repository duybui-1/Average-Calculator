import java.util.Scanner;

 public class Main{
  public static void main(String[] args) {
    System.out.println("Input up to 100 numbers to be averaged. The program will keep track as you go. Type in 'CLEAR' to reset the program!");
    Scanner input = new Scanner(System.in);
    double total = 0;
    String grade;
    String reset = "CLEAR";
    double average;
    int counter = 0;
    
    do{
      System.out.println("Input: ");
      grade = input.nextLine();
      
            if(grade.equals(reset)){
            total = 0;
            counter = 0;
            System.out.println("The program has reset");
            continue;
            } else {}
            
      double parseGrade = Double.parseDouble(grade);
      total = total + parseGrade;
      counter++;
      average = total/counter;
      System.out.println("So far you have inputted: " + counter + " grades(s)");
      System.out.println("Your current grade average is: " + average);
    }while (counter < 100);
    
  }
}
