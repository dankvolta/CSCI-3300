package v1;

import java.util.List;

public interface IVehicle {

    int getId();
    ILocation getLocation();
    ILocation getDestination();
    IStatistics getStatistics();
    VehicleStatus getStatus();
    void setService(List<IService> service);
    void setCompany(ITaxiCompany company);
    void pickService(IService service);
    void startService();
    void endService();
    void notifyArrivalAtPickupLocation();
    void notifyArrivalAtSecondaryPickUpLocation();
    void notifyArrivalAtDropoffLocation();
    boolean isFree();
    boolean isInService();
    void move();
    int calculateCost();
    String showDrivingRoute();
    String toString();
    IService getService();
    List<IService> getServices();

}