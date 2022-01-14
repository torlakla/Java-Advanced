package HotelReservation;

public enum DiscountType {
    VIP(0.20),
    SECOND_VISIT(0.10),
    NONE(0);
    private double percentage;
    DiscountType(double percentage){
        this.percentage=percentage;
    }
    public double getPercentage(){
        return this.percentage;
    }

}
