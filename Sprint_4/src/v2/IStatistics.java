package v2;

public interface IStatistics {

    int getServices();
    int getReviews();
    double getStars();
    int getDistance();
    int getBilling();
    void updateServices();
    void updateReviews();
    void updateStars(int stars);
    void updateDistance(int distance);
    void updateBilling(int billing);

} // interface IStatistics