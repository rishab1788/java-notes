import java.sql.*;

/**
 * Created by Rishabh on 5/19/2017.
 */
public class MySql1 {

    public static void main(String... args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college", "root", "root");
            Statement Stmt = Con.createStatement();
            String sql = "delete from student where name=\'g\';";
            Stmt.executeUpdate(sql);

            PreparedStatement ps = Con.prepareStatement("select * from student");

            ResultSet ri = Stmt.executeQuery("select * from student");
            while (ri.next()) {
                System.out.println(ri.getInt(1) + " " + ri.getString(2));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
