package itm.selectResults;

public class MaxProjectsClient {
    private String name;
    private int projectCount;
    public MaxProjectsClient(String name, int projectCount) {
        this.name = name; this.projectCount = projectCount;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", projectCount: " + projectCount;
    }
}

