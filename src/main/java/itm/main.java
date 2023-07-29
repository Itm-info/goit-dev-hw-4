package itm;

import itm.dbWorks.DatabaseQueryService;

import java.io.IOException;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException, IOException {
        DatabaseQueryService databaseQueryService = new DatabaseQueryService();

        databaseQueryService.findLongestProject().forEach(System.out::println); System.out.println();
        databaseQueryService.findMaxProjectsClient().forEach(System.out::println); System.out.println();
        databaseQueryService.findMaxSalaryWorker().forEach(System.out::println); System.out.println();
        databaseQueryService.findProjectPrices().forEach(System.out::println); System.out.println();
        databaseQueryService.findYoungestEldestWorkers().forEach(System.out::println); System.out.println();
    }
}
