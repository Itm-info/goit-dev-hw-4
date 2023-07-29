package itm.dbWorks;

import java.io.IOException;
import java.sql.SQLException;

public class DatabasePopulateService {
    public static void main(String[] args) throws SQLException, IOException {
        SQLFromFile.exec("populate_db");
    }
}
