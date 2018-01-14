    import java.sql.*;
    import java.util.Scanner;

/**
 * Created by Rishabh on 5/19/2017.
 */
public class SqlOperation {

    public static void main(String... args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college", "root", "root");
            Statement Stmt = Con.createStatement();
            System.out.print("enter id name and then one char");
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            String c = scan.next();
            System.out.print(c);
            String sql = "INSERT INTO employee(id,name) VALUES ("+n+",'"+ c +"');";
            System.out.print(sql);

            Stmt.executeUpdate(sql);

            PreparedStatement ps = Con.prepareStatement("select * from employee");

            ResultSet ri = Stmt.executeQuery("select * from employee");
            while (ri.next()) {
                System.out.println(ri.getInt(1) + " " + ri.getString(2));
            }


            System.out.println("what char you want to delete ");
            c = scan.next() ;
             sql = "delete from student where name='"+c+"'";
            Stmt.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
