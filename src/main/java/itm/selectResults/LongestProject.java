package itm.selectResults;

public class LongestProject {
    private int id;
    private int monthsCount;
    public LongestProject(int id, int monthsCount) {
        this.id = id; this.monthsCount = monthsCount;
    }
    @Override
    public String toString() {
        return "Project_id: " + id + ", monthsCount: " + monthsCount;
    }
}
