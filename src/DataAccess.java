
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nam
 */
public class DataAccess {

    private Connection connection;
    private Statement stmt;

    public DataAccess() {
        try {
            MyConnection myConnection = new MyConnection();
            connection = myConnection.getConnection();
            stmt = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public int Update(String str) {
        try {
            int i = stmt.executeUpdate(str);
            return i;
        } catch (Exception e) {
            System.out.println(e.toString());
            return -1;
        }
    }

    public ResultSet Query(String str) {
        try {
            ResultSet rs = stmt.executeQuery(str);
            return rs;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
