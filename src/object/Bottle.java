package object;

import java.util.Objects;

public class Bottle {
    private int modelNumber;
    private String brandName;


    @Override
    public int hashCode() {
        return modelNumber;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public Bottle setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
        return this;
    }

    public String getBrandName() {
        return brandName;
    }

    public Bottle setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }


}
