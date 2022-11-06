package HMS.ServicesHopital;

import HMS.Interfaces.SerivceHopital;

public class Report implements SerivceHopital {
    private String ServiceName="REPORT";
   int ReportId;
   int DoctorId;
   int AppointmentId;
   int PatientId;
   String MedicineTreatment;
   String DoctorComment;
    @Override
    public String getServiceName() {
        return ServiceName;
    }

}
