package HMS.Interfaces;

public class HopitalFactoryCreator {
    public AbstractHopitalFactory getFactory(String name){
        if(name.equalsIgnoreCase("ServiceHopital")){
            return new ServiceFactory();
        }
        if(name.equalsIgnoreCase("Person")){
            return new PersonFactory();
        }
        if(name==null){
            return null;
        }
        return null;
    }
}
