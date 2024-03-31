import java.util.Scanner;

public class TestPatient {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
// three patient objects
        Patient patient1 = new Patient("1234", 19, "A", "-");
        Patient patient2 = new Patient();
        Patient patient3 = new Patient();
        BloodData bloodData2 = new BloodData();


        System.out.println("Patient 2 enter id number: ");
        patient2.setId(scan.next());

        System.out.println("Patient 2 enter age: ");
        patient2.setAge(Integer.parseInt(scan.next()));

// blood data set to default
        patient2.setBloodData(bloodData2);



        System.out.println("Patient 3 enter id number: ");
        patient3.setId(scan.next());

        System.out.println("Patient 3 enter age: ");
        patient3.setAge(Integer.parseInt(scan.next()));

// blood data set to default
        patient3.setBloodData(bloodData2);

        // compatible blood types



// patient 1 infor
        System.out.println("Patient 1 id: " + patient1.getId());
        System.out.println("Patient 1 age: " + patient1.getAge());
        System.out.println("Patient 1 Blood type: " + patient1.getBloodData().getBloodType());
        System.out.println("Patient 1 RH Factor: " + patient1.getBloodData().getRhFactor());

        // compatiblility with other blood types
        if(patient1.getBloodData().getBloodType().equals("A") && patient2.getBloodData().getRhFactor().equals("+")) {
            System.out.println("Patient 1 if compatible with A+, A-, O+, and O- blood types!");
        }

        else if(patient1.getBloodData().getBloodType().equals("A") && patient2.getBloodData().getRhFactor().equals("-")){
            System.out.println("Patient 1 if compatible with A- and O- blood types!");
        }

        else if(patient1.getBloodData().getBloodType().equals("B") && patient2.getBloodData().getRhFactor().equals("+")){
            System.out.println("Patient 1 if compatible with B+, B-, O+, and O- blood types!");
        }

        else if(patient1.getBloodData().getBloodType().equals("B") && patient2.getBloodData().getRhFactor().equals("-")){
            System.out.println("Patient 1 if compatible with B- and O- blood types!");
        }

        else if(patient1.getBloodData().getBloodType().equals("O") && patient2.getBloodData().getRhFactor().equals("+")){
            System.out.println("Patient 1 if compatible with O+ and O- blood types!");
        }

        else if(patient1.getBloodData().getBloodType().equals("O") && patient2.getBloodData().getRhFactor().equals("-")){
            System.out.println("Patient 1 if compatible with O- blood types!");
        }

        else {
            System.out.println("Not compatible with any blood type :(");
        }

// patient 2 info
        System.out.println("Patient 2 id: " + patient2.getId());
        System.out.println("Patient 2 age: " + patient2.getAge());
        System.out.println("Patient 2 Blood type: " + patient2.getBloodData().getBloodType());
        System.out.println("Patient 2 RH Factor: " + patient2.getBloodData().getRhFactor());

        if(patient2.getBloodData().getBloodType().equals("A") && patient2.getBloodData().getRhFactor().equals("+")) {
            System.out.println("Patient 2 if compatible with A+, A-, O+, and O- blood types!");
        }

        else if(patient2.getBloodData().getBloodType().equals("A") && patient2.getBloodData().getRhFactor().equals("-")){
            System.out.println("Patient 2 if compatible with A- and O- blood types!");
        }

        else if(patient2.getBloodData().getBloodType().equals("B") && patient2.getBloodData().getRhFactor().equals("+")){
            System.out.println("Patient 2 if compatible with B+, B-, O+, and O- blood types!");
        }

        else if(patient2.getBloodData().getBloodType().equals("B") && patient2.getBloodData().getRhFactor().equals("-")){
            System.out.println("Patient 2 if compatible with B- and O- blood types!");
        }

        else if(patient2.getBloodData().getBloodType().equals("O") && patient2.getBloodData().getRhFactor().equals("+")){
            System.out.println("Patient 2 if compatible with O+ and O- blood types!");
        }

        else if(patient2.getBloodData().getBloodType().equals("O") && patient2.getBloodData().getRhFactor().equals("-")){
            System.out.println("Patient 2 if compatible with O- blood types!");
        }

        else {
            System.out.println("Not compatible with any blood type :(");
        }




// patient 3 info
        System.out.println("Patient 3 id: " + patient3.getId());
        System.out.println("Patient 3 age: " + patient3.getAge());
        System.out.println("Patient 3 Blood type: " + patient3.getBloodData().getBloodType());
        System.out.println("Patient 3 RH Factor: " + patient3.getBloodData().getRhFactor());

        if(patient3.getBloodData().getBloodType().equals("A") && patient2.getBloodData().getRhFactor().equals("+")) {
            System.out.println("Patient 3 if compatible with A+, A-, O+, and O- blood types!");
        }

        else if(patient3.getBloodData().getBloodType().equals("A") && patient2.getBloodData().getRhFactor().equals("-")){
            System.out.println("Patient 3 if compatible with A- and O- blood types!");
        }

        else if(patient3.getBloodData().getBloodType().equals("B") && patient2.getBloodData().getRhFactor().equals("+")){
            System.out.println("Patient 3 if compatible with B+, B-, O+, and O- blood types!");
        }

        else if(patient3.getBloodData().getBloodType().equals("B") && patient2.getBloodData().getRhFactor().equals("-")){
            System.out.println("Patient 3 if compatible with B- and O- blood types!");
        }

        else if(patient3.getBloodData().getBloodType().equals("O") && patient2.getBloodData().getRhFactor().equals("+")){
            System.out.println("Patient 3 if compatible with O+ and O- blood types!");
        }

        else if(patient3.getBloodData().getBloodType().equals("O") && patient2.getBloodData().getRhFactor().equals("-")){
            System.out.println("Patient 3 if compatible with O- blood types!");
        }

        else {
            System.out.println("Not compatible with any blood type :(");
        }







    }
}
