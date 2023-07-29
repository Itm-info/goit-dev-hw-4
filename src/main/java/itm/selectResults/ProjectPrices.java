package itm.selectResults;

public class ProjectPrices {
    private int id;
    private int price;
    public ProjectPrices(int id, int price) {
        this.id = id; this.price = price;
    }
    @Override
    public String toString() {
        return "Project_id: " + id + ", price: " + price;
    }
}
