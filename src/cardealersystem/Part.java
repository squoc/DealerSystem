package cardealersystem;

public class Part {
    private int partID;
    private String description;
    private double price;
    private String origin;

    public Part(int id, String des, double price, String origin) {
        this.partID = id;
        this.description = des;
        this.price = price;
        this.origin = origin;
    }

    public int getPartID() {
        return this.partID;
    }

    public String getPartInfo() {
        String info = "Part ID: " + this.partID + "\nDescription: " + this.description + "\nPrice: " + this.price
                        + "\nOrigin: " + this.origin;

        return info;
    }
}
