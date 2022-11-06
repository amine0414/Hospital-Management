package HMS.Interfaces;

import HMS.Model.Person;

public abstract class AbstractHopitalFactory {
    public abstract SerivceHopital getService(String serviceName);
    public abstract Person getPerson(String personType);
}
