package CSCHW;

public class TruckObject {
    private int TruckID;
    private int TruckZip;
    private int TruckPackages;

    @Override
    public String toString() {
        return "TruckObject{" +
                "TruckID=" + TruckID +
                ", TruckTruckZip=" + TruckZip +
                ", TruckPackages=" + TruckPackages +
                '}';
    }
    public TruckObject(int TruckID, int TruckZip, int TruckPackages) {
        this.TruckID = TruckID;
        this.TruckZip = TruckZip;
        this.TruckPackages = TruckPackages;
    }


    public int getID() {
        return TruckID;
    }

    public int getTruckZip() {
        return TruckZip;
    }

    public void setTruckZip(int TruckZip) {
        TruckZip = TruckZip;
    }

    public int getTruckPackages() {
        return TruckPackages;
    }

    public void setTruckPackages(int TruckPackages) {
        TruckPackages = TruckPackages;
    }

    public void setID(int TruckID) {
        this.TruckID = TruckID;
    }
}
