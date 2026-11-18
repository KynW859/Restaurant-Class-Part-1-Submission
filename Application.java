import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Application {

    public static void main(String[] args){
        //setting up object and arraylist
        Restaurant restObject = new Restaurant();
        ArrayList<Restaurant> restList = new ArrayList<>();

        //JOptionPane input junk
        String inputName = JOptionPane.showInputDialog("Declare the name of your restaurant:");
        int inputWaitTime = Integer.parseInt(JOptionPane.showInputDialog("What is the wait time in minutes? (Input must be a FULL number)"));
        double inputStars = Double.parseDouble(JOptionPane.showInputDialog("From up to 10 to 0 stars, how well received is this restaurant? (Input decimal number)"));
        double inputPriceMin = Double.parseDouble(JOptionPane.showInputDialog("What is the MINIMUM price range for the restaurant? (Input decimal number)"));
        double inputPriceMax = Double.parseDouble(JOptionPane.showInputDialog("What is the MAXIMUM price range for the restaurant? (Input decimal number)"));
        String inputHours = JOptionPane.showInputDialog("What are the hours of worktime for the restaurant? (Input doesn't have to strictly be a number, but try to keep it proper ok?)");

        //calling constructor & toString
        restObject.restaurantConstructor(inputName,inputWaitTime,inputStars,inputPriceMin,inputPriceMax,inputHours);
        System.out.println(restObject.toString());
        restList.add(restObject);



    }//end main
}//end class
