
/**
 * @purpose Test exceptions
 *
 * @author (Nitin Ramadoss)
 * @version (04/13/19)
 */

public class Data
{
    // instance variables - replace the example below with your own
    private String firstName, lastName, grade;
    private double[] score;

    /**
     * Constructor for objects of class Data
     */
    public Data(String firstName, String lastName, double[] score)
    {
        if(firstName.length() == 0 || lastName.length() == 0){
        throw new IllegalArgumentException("String value cannot be empty!");
        
        } else{
        this.firstName = firstName;
        this.lastName = lastName;   
        }
        
        this.grade = determineGrade(score);
        this.score = score;
    }
    
    public String determineGrade(double[] s){
       
       if(s.length == 0)
       throw new NullPointerException("There are no scores available!");
      
       
       int sum = 0;
       String letterGrade = "";
       
       for(double score : s)
       sum += score;
       
       double avg = sum/(double)s.length;
       
       if(avg > 90.0)
       letterGrade = "A";
       else if(avg > 80.0 && avg < 90.0)
       letterGrade = "B";
       else if(avg > 70.0 && avg < 80.0)
       letterGrade = "C";
       else if(avg > 60.0 && avg < 70.0)
       letterGrade = "D";
       else
       letterGrade = "F";
       
       
       return letterGrade;
    }
  
    public String toString()
    {
      return String.format("%-10s %-10s %-4s %4s %-2s %-7f %-7f %-7f %-7f %-7f ", this.firstName, this.lastName, "-", this.grade, ":", this.score[0], this.score[1], this.score[2], this.score[3], this.score[4] );  
    }
}
