import java.util.Scanner;

 public class weighted{
  public static void main(String[] args) {
    System.out.println("Input up to 100 numbers to be averaged. The program will keep track as you go. Type in 'CLEAR' to reset the program!");
    Scanner input = new Scanner(System.in);
    int counter = 0;
    double total = 0;
    double average;
    double weightGrade;
    String grade;
    String rawGrade;
    String multiplier;
    String reset = "CLEAR";
    String yes = "YES";
    String no = "NO";
    
    
    
    System.out.println("Is this a weighted average?: type 'yes' or 'no'");
    String waverage= input.nextLine().toUpperCase();
    
    if(waverage.equals(yes)){
      
    do{
            System.out.println("Input raw grade value:");
            rawGrade = input.nextLine();
            double parseRawgrade = Double.parseDouble(rawGrade);
            System.out.println("Input the weight of the raw grade value in percent:");
            multiplier = input.nextLine();
            double parseMultiplier = Double.parseDouble(multiplier);
            weightGrade = parseRawgrade*parseMultiplier;
            total = total + weightGrade;
    
      counter++;
      average = total;
      System.out.println("So far you have input: " + counter + " grades(s)");
      System.out.println("Your current grade weighted average is: " + average);
     
    }while (counter < 100);
    } else{
            if(!waverage.equals(yes)){
              if(!waverage.equals(no)){
                do{
                System.out.println("Please respond with either 'yes' or 'no'");
                continue;
                }while (!waverage.equals(no));
              }else{
            System.out.println("We will calculate your normal average then");
              }
            }
          }
    
  }
}
