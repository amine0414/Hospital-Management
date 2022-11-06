create database HosptitalManagementSystem;
use HosptitalManagementSystem;
create table Users(
                      UserID int,
                      UserType varchar(50),
                      passwd varchar(50),
                      primary key(UserID,UserType)
);
insert into Users values(1,'admin','admin');
insert into Users values(2,'doctor','doctor123');
insert into Users values(3,'patient','patient123');
create table Patients(
                         pid int primary key,
                         FirstName varchar(50),
                         LastName varchar(50),
                         Gender varchar(10),
                         ContactNumber varchar(10),
                         age int,
                         Email varchar(50),
                         BloodGroup varchar(5),
                         Address varchar(50)
);

create table Doctors(
                        Did int primary key,
                        FirstName varchar(50),
                        LastName varchar(50),
                        Gender varchar(10),
                        ContactNumber varchar(10),
                        age int,
                        VisitCost int,
                        DoctorType varchar(20),
                        Email varchar(50)
);

create table Appointments(
                             Appid int primary key,
                             Pid int,
                             problem varchar(50),
                             Did int,
                             DoctorName varchar(50),
                             DoctorType varchar(20),
                             VisitCost int,
                             AppointmentStatus varchar(20),
                             constraint fk_pid foreign key(Pid) references Patients(pid),
                             constraint fk_did foreign key(Did) references Doctors(Did)

);
create table Reports(
                        Reportid int primary key,
                        Doctorid int,
                        Patientid int,
                        Appointmentid int,
                        Medicine_Treatment varchar(50),
                        Doctor_comment varchar(200),
                        constraint Doc_FK foreign key(Doctorid) references Doctors(Did),
                        constraint Pat_FK foreign key(Patientid) references Patients(pid),
                        constraint App_FK foreign key(Appointmentid) references Appointments(Appid)

);
create table FeedBacks(
                          Patientid int,
                          patientRate int,
                          DoctorFirstName varchar(50),
                          DoctorLastName varchar(50),
                          DoctorNature varchar(20),
                          PatientComment varchar(200)
);
