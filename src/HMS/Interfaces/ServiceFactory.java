package HMS.Interfaces;

import HMS.ServicesHopital.Appointment;
import HMS.Model.Person;
import HMS.ServicesHopital.FeedBack;
import HMS.ServicesHopital.Report;

public class ServiceFactory extends AbstractHopitalFactory {

    @Override
    public SerivceHopital getService(String serviceName) {
        if(serviceName==null){
            return null;
        }
        if(serviceName.equalsIgnoreCase("APPOINTMENT"))
        {
          return new Appointment();
        }
        if(serviceName.equalsIgnoreCase("REPORT"))
        {
            return new Report();
        }
        if(serviceName.equalsIgnoreCase("FEEDBACK"))
        {
            return new FeedBack();
        }
        return null;
    }

    @Override
    public Person getPerson(String personType) {
        return null;
    }
}
