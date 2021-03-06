import java.util.Scanner;

 public class weighted{
  public static void main(String[] args) {
    System.out.println("Input up to 100 numbers to be averaged. The program will keep track as you go. Type in 'CLEAR' to reset the program!");
    Scanner input = new Scanner(System.in);
    int counter = 0;
    double total = 0;
    double average, weightGrade;
    String grade, rawGrade, multiplier, shortMultiplier;
    String reset = "CLEAR";
    String yes = "YES";
    String no = "NO";
    
    System.out.println("Is this a weighted average?: type 'yes' or 'no'");
    
    try{
    String waverage= input.nextLine().toUpperCase(); //takes 'yes', 'no' , or other response. then converts to all uppercase for uniformity.
    
    if(waverage.equals(yes)){ // statement for if the answer is 'yes'
       do{
            try{
                System.out.println("Input raw grade value:");
                rawGrade = input.nextLine();
                double parseRawgrade = Double.parseDouble(rawGrade); // turns string value of the raw grade to a double value to be used in calculations
                System.out.println("Input the weight of the raw grade value in percent (ex. 45%):");
                multiplier = input.nextLine();
                shortMultiplier = multiplier.replace("%", ""); //takes off the "%" by removing the character, this allows the String to be converted to a Double value
                double parseMultiplier = Double.parseDouble(shortMultiplier); //turns string value of the weighted multiplier to a double value to be used in calculations
                parseMultiplier = parseMultiplier/100; // conversion from percentage to decimal
                weightGrade = parseRawgrade*parseMultiplier; // this operation multiplies the grade with its weight to get the weighted grade value
                total = total + weightGrade; //adds all values calculated to get the weigted grade average
            }catch(NumberFormatException ex){
                System.out.println("Sorry what you have entered is invalid. Please re-enter a numerical value. Starting with the raw grade value.");
                continue;
            }
        counter++; //increments counter by +1
        average = total; // the outputed total is the value of all weighted grades summed up
        System.out.println("So far you have input: " + counter + " grades(s)");
        System.out.println("Your current grade weighted average is: " + average);
        }while (counter < 100); //loops for 100 values input 
    }else{
            if(waverage.equals(no)){ //statement for if the answer is 'no'
                do{
                     System.out.println("We will calculate your normal average then.");
                     break;
                }while (!waverage.equals(no)); 
            }else{}
    }
    }catch(inputMismatchException e){
                        System.out.println("Please respond with either 'yes' or 'no'");
        }
    catch(Exception e){
                        System.out.println(e);
        }
    }
}
