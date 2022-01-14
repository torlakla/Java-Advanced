package CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
    public Integer tires = 4;

     String getModel();
     String getColor();
     Integer getHorsePower();
     String countryProduced();



}
