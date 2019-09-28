
/**
 * @purpose Test exceptions
 *
 * @author (Nitin Ramadoss)
 * @version (04/13/19)
 */

public class DataTester
{
   public static void main(String[] args){
   
       Data[] d = new Data[4];
       
       //d[0] = new Data("", "", new double[] {90.81, 84.56, 87.44, 60.77, 100.00});
       d[1] = new Data("Samuel", "Jacky", new double[] {90.41, 83.46, 50.44, 32.32, 59.59});
       d[2] = new Data("Pinky", "Mickey", new double[] {99.89, 95.54, 100.00, 93.77, 91.25});
       //d[3] = new Data("Juju", "Bean", new double[] {});
       
       //demonstrating empty score 
       //System.out.println(d[3]);
       
       //demonstrating empty name
       //System.out.println(d[0]);
       
       System.out.println(d[1]);
       System.out.println(d[2]);
   }
}
