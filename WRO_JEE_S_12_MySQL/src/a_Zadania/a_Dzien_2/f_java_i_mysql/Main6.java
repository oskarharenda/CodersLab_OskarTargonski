package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main6 {
    public static void main(String[] args) {

        String[] column = {"rating"};

        try (Connection conn = DBUtil.connect()) {
            DBUtil.printData(conn, "SELECT AVG(rating) FROM movies;", column);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}
