package RAM;

import Computers.Computer;
import Computers.HomeComputer;

public abstract class RAM {

    protected String manufacturer;
    protected double volumeMemory;
    protected double frequency;
    protected String typeMemory;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}