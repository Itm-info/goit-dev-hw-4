package itm.selectResults;

public class MaxSalaryWorker {
    private String name;
    private int salary;
    public MaxSalaryWorker(String name, int salary) {
        this.name = name; this.salary = salary;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", salary: " + salary;
    }
}
