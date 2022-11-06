package HMS.Model;

public class Doctor extends Person{
    String PersonType="DOCTOR";
    int Did;
    String Doctortype;
    int VisitCost;

    @Override
    public String getPersonType() {
        return PersonType;
    }
}
