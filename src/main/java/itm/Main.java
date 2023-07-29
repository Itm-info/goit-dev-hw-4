package itm;

import itm.dbWorks.DatabaseQueryService;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        System.out.println("Hello world!");
        DatabaseQueryService databaseQueryService = new DatabaseQueryService();

        databaseQueryService.findLongestProject().forEach(System.out::println); System.out.println();
        databaseQueryService.findMaxProjectsClient().forEach(System.out::println); System.out.println();
        databaseQueryService.findMaxSalaryWorker().forEach(System.out::println); System.out.println();
        databaseQueryService.findProjectPrices().forEach(System.out::println); System.out.println();
        databaseQueryService.findYoungestEldestWorkers().forEach(System.out::println); System.out.println();
    }
}
