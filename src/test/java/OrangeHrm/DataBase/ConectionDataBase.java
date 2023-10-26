package OrangeHrm.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectionDataBase {

    private static Connection con;

    public static Connection getConection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName = OrangeHrm", "Sap", "Fuentes1002");
        }catch (Exception e){
            con = null;
            e.printStackTrace();
        }
        return con;
    }
}
