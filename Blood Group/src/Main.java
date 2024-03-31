//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your blood type");
        String bloodType = myObj.nextLine();
        System.out.println(BloodType.Group.APlus());
        switch(bloodType){
            case "A+":
                System.out.println("My Blood group is " + BloodType.Group.APlus());
                break;
            case "A-":
                System.out.println("My Blood group is " + BloodType.Group.ANeg());
                break;
            case "B+":
                System.out.println("My Blood group is B+" + BloodType.Group.BPlus());
                break;
            case "B-":
                System.out.println("My Blood group is B-" + BloodType.Group.BNeg());
                break;
            default:
                System.out.println("Invalid Type ");
        }
    }
}