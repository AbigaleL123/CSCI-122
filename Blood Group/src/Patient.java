public class Patient {
// declaring private variables
    private String id;
    private int age;
    private BloodData bloodData;

    // default constructor setting id and age to zero, with blood data set to default.
    public Patient() {
        id = "0";
        age = 0;
        bloodData = new BloodData();
    }

    // cosntructor
    public Patient(String id, int age, String bloodType, String rhFactor) {
        this.id = id;
        this.age = age;
        bloodData = new BloodData(bloodType, rhFactor);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public BloodData getBloodData() {
        return bloodData;
    }

    public void setBloodData(BloodData bloodData) {

        this.bloodData = bloodData;
    }


}
