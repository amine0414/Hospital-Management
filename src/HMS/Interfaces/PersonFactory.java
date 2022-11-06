package HMS.Interfaces;

import HMS.Model.Doctor;
import HMS.Model.Patient;
import HMS.Model.Person;

public class PersonFactory extends AbstractHopitalFactory{
    @Override
    public SerivceHopital getService(String serviceName) {
        return null;
    }

    @Override
    public Person getPerson(String personType) {
        if(personType==null){
            return null;
        }

       if(personType.equalsIgnoreCase("PATIENT")){
           return new Patient();
       }
        if(personType.equalsIgnoreCase("DOCTOR")){
            return new Doctor();
        }

        return null;
    }
}
