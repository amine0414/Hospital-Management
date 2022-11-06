package HMS.ServicesHopital;

import HMS.Interfaces.SerivceHopital;

public class FeedBack implements SerivceHopital {
    private String ServiceName="FEEDBACK";
     int PatientId;
     int Rate;
     String DoctorNature;
     String DoctorName;
     String PatientComment;
    @Override
    public String getServiceName() {
        return ServiceName;
    }
}
