package itm.dbWorks;

import itm.selectResults.*;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class DatabaseQueryService {
    public List<LongestProject> findLongestProject() throws SQLException, IOException {
        ResultSet rs = SQLFromFile.execSelect("find_longest_project");

        List<LongestProject> res = new LinkedList<>();
        while(rs.next()) {
            res.add(new LongestProject(
                    rs.getInt("id"),
                    rs.getInt("MONTH_COUNT")));
        }

        return res;
    }

    public List<MaxProjectsClient> findMaxProjectsClient() throws SQLException, IOException {
        ResultSet rs = SQLFromFile.execSelect("find_max_projects_client");

        List<MaxProjectsClient> res = new LinkedList<>();
        while(rs.next()) {
            res.add(new MaxProjectsClient(
                    rs.getString("CLIENT_NAME"),
                    rs.getInt("PROJECT_COUNT")));
        }

        return res;
    }

    public List<MaxSalaryWorker> findMaxSalaryWorker() throws SQLException, IOException {
        ResultSet rs = SQLFromFile.execSelect("find_max_salary_worker");

        List<MaxSalaryWorker> res = new LinkedList<>();
        while(rs.next()) {
            res.add(new MaxSalaryWorker(
                    rs.getString("name"),
                    rs.getInt("salary")));
        }

        return res;
    }

    public List<ProjectPrices> findProjectPrices() throws SQLException, IOException {
        ResultSet rs = SQLFromFile.execSelect("print_project_prices");

        List<ProjectPrices> res = new LinkedList<>();
        while(rs.next()) {
            res.add(new ProjectPrices(
                    rs.getInt("project_id"),
                    rs.getInt("PRICE")));
        }

        return res;
    }

    public List<YoungestEldestWorkers> findYoungestEldestWorkers() throws SQLException, IOException {
        ResultSet rs = SQLFromFile.execSelect("find_youngest_eldest_workers");

        List<YoungestEldestWorkers> res = new LinkedList<>();
        while(rs.next()) {
            res.add(new YoungestEldestWorkers(
                    rs.getString("TYPE"),
                    rs.getString("name"),
                    LocalDate.parse(rs.getString("birthday"))));
        }

        return res;
    }
}
