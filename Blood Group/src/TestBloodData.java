import java.util.Scanner;

public class TestBloodData {

    public static void main(String[] args) {

        BloodData bloodData1 = new BloodData();
        BloodData bloodData2 = new BloodData("B", "-");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your blood type: ");
        bloodData1.setBloodType(scan.next());

        System.out.println("Enter RH Factor: ");
        bloodData1.setRhFactor(scan.next());

        System.out.println(bloodData1);

        System.out.println(STR."Blood type: \{bloodData1.getBloodType()}");
        System.out.println(STR."RH Factor: \{bloodData1.getRhFactor()}");


        System.out.println(STR."Blood type: \{bloodData2.getBloodType()}");
        System.out.println(STR."RH Factor: \{bloodData2.getRhFactor()}");







    }
}