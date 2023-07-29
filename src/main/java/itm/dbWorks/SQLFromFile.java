package itm.dbWorks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SQLFromFile {
    public static void exec(String fileName) throws SQLException, IOException {
        Statement stmt = Database.getInstance().getConnection().createStatement();
        String[] queries = new String(Files.readAllBytes(Paths.get("sql\\"+ fileName + ".sql")))
                .split("\\s*;\\n*\\s*(?=([^']*'[^']*')*[^']*$)");

        Boolean errorReturned = null;
        for(String query : queries) {
            if(errorReturned != null) System.out.print(errorReturned?"NOT OK, ":"OK, ");
            errorReturned = stmt.execute(query);
        }
        if(errorReturned != null) System.out.print(errorReturned?"NOT OK. ":"OK. ");
        stmt.close();
    }

    public static ResultSet execSelect(String fileName) throws SQLException, IOException {
        Statement stmt = Database.getInstance().getConnection().createStatement();
        String query = new String(Files.readAllBytes(Paths.get("sql\\"+ fileName + ".sql")));

        return stmt.executeQuery(query);
    }

    public static List<ResultSet> execSelectSet(String fileName) throws SQLException, IOException {
        Statement stmt = Database.getInstance().getConnection().createStatement();
        String[] queries = new String(Files.readAllBytes(Paths.get("sql\\"+ fileName + ".sql")))
                .split("\\s*;\\n*\\s*(?=([^']*'[^']*')*[^']*$)");

        List<ResultSet> rs = new ArrayList<>();
        for(String query : queries) {
            rs.add(stmt.executeQuery(query));
        }

        return rs;
    }
}
