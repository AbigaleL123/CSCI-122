// creating the enum

enum BloodType {
        Group("A+", "A-", "B+", "B-", "AB+", "AB-", "O-", "O+");


    private final String APlus;
    private final String ANeg;
    private final String BPlus;
    private final String BNeg;
    private final String ABPlus;
    private final String ABNeg;
    private final String OPlus;
    private final String ONeg;

    BloodType(String APlus, String ANeg, String BPlus, String BNeg, String ABPlus, String ABNeg, String OPlus, String ONeg) {
        this.APlus = APlus;
        this.ANeg = ANeg;
        this.BPlus = BPlus;
        this.BNeg = BNeg;
        this.ABPlus = ABPlus;
        this.ABNeg = ABNeg;
        this.OPlus = OPlus;
        this.ONeg = ONeg;
    }

    public String APlus() {
        return APlus;
    }

    public String ANeg() {
        return ANeg;
    }

    public String BPlus() {
        return BPlus;
    }

    public String BNeg() {
        return BNeg;
    }

    public String ABPlus() {
        return ABPlus;
    }

    public String ABNeg() {
        return ABNeg;
    }

    public String OPlus() {
        return OPlus;
    }

    public String ONeg() {
        return ONeg;
    }
}

public class BloodData{

    // declare private variables
    private String bloodType;
    private String rhFactor;



// default constructor for O+
    public BloodData() {
        this("O", "+");

    }

    public BloodData(String type, String rh) {
        bloodType = type;
        rhFactor = rh;

    }

    public void setBloodType(String type){
        bloodType = type;
    }

    public void setRhFactor(String factor){
        rhFactor = factor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }



}




