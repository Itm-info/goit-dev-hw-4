package itm.dbWorks;

import java.io.IOException;
import java.sql.SQLException;

public class DatabaseInitService {
    public static void main(String[] args) throws SQLException, IOException {
        SQLFromFile.exec("init_db");
    }
}
