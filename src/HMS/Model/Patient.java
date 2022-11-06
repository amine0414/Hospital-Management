package HMS.Model;

public class Patient extends Person{
    String PersonType="PATIENT";
    private int Pid;
    private String BloodGroup;

    @Override
    public String getPersonType() {
        return PersonType;
    }

}
