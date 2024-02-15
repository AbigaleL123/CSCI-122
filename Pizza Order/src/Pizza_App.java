import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Pizza_App extends JFrame{

    private JComboBox<String> pizzaSizeComboBox;
    private JCheckBox cheeseCheckBox;
    private JCheckBox mushroomsCheckBox;
    private JCheckBox pepperoniCheckBox;
    private JCheckBox olivesCheckBox;

    private JButton calculateButton;
    private JLabel totalPriceLabel;


    public Pizza_App() {
       // Set up for the frame
       setTitle("Big Y Pizza Order");
       setSize(400, 300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);

       // Create the components

        pizzaSizeComboBox = new JComboBox<>(new String[]{"Small", "Medium", "Large", "Super"});
        cheeseCheckBox = new JCheckBox("Cheese");
        mushroomsCheckBox = new JCheckBox("Mushrooms");
        pepperoniCheckBox = new JCheckBox("Pepperoni");
        olivesCheckBox = new JCheckBox("Olives");

        // This is my creativity, I made it so that you can click on a button and it will show the final price.
        calculateButton = new JButton("Calculate Price");
        totalPriceLabel = new JLabel("Total Price: $0.0");

        // Set up of layout, BoxLayout allows for the components to organized in a column on the y axis

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));


        // Adding the components to the frame

        add(new JLabel("Select  Pizza Size: "));
        add(pizzaSizeComboBox);
        add(new JLabel("Select Toppings: "));
        add(cheeseCheckBox);
        add(mushroomsCheckBox);
        add(pepperoniCheckBox);
        add(olivesCheckBox);

        add(calculateButton);
        add(totalPriceLabel);


        // Adding the ActionListener to the calculate button

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatePrice();
            }
        });

    }

    private void calculatePrice(){
        // get the selected pizza size
        String pizzaSize = (String) pizzaSizeComboBox.getSelectedItem();

        // Calculate starting price from size of the pizza
        double startPrice = getPriceBySize(pizzaSize);

        // Calculate topping charge
         double toppingCharge = calculateToppingCharge();

         // Calculate the total price
        double totalPrice = startPrice + toppingCharge;

        // Display total price
        totalPriceLabel.setText("Total Price: $ " + totalPrice);

    }

    private double getPriceBySize(String pizzaSize) {
       // Assigns the price to each size of pizza

        if ("Small".equals(pizzaSize)) {
            return 5.0;
        }
        else if ("Medium".equals(pizzaSize)) {
            return 10.0;
        }
        else if ("Large".equals(pizzaSize)) {
            return 15.0;
        }
        else if ("Super".equals(pizzaSize)){
            return 20.0;
        }
        else{
            return 0.0;
        }

    }

    private double calculateToppingCharge() {
        int numberOfToppings = 0;

        // check toppings other than cheese

        if (mushroomsCheckBox.isSelected())
            numberOfToppings++; // the ++ makes it so that the numberOfToppings is incimented by  1
        if (pepperoniCheckBox.isSelected()) numberOfToppings++;
        if (olivesCheckBox.isSelected()) numberOfToppings++;


        // Apply additional Charge from the amount of toppings

        double additionalCharge;
        if (numberOfToppings == 1 || numberOfToppings == 2){ // the || are an or statement
            additionalCharge = numberOfToppings * 0.5;
        }
        else if (numberOfToppings == 3){
            additionalCharge = 1.25;
        }
        else {
            additionalCharge = 0.0;
        }
        return additionalCharge;

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Pizza_App().setVisible(true));
    }
}