package MesaAula12;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.*;

public class Main {
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Employees;CREATE TABLE Employees" +
            "("+"id INT PRIMARY KEY," +
            "Name VARCHAR(50) NOT NULL," +
            "Age INT NOT NULL," +
            "Email VARCHAR(100) NOT NULL," +
            "Address VARCHAR(100) NOT NULL" +
            ")";

    private static final String sqlCreateEmployee1 = "INSERT INTO Employees(id, Name, Age, Email, Address) VALUES (1,'issao',33,'issao@123.com','cristovao lins')";
    private static final String sqlCreateEmployee2 = "INSERT INTO Employees(id, Name, Age, Email, Address) VALUES (2,'marina',34,'marina@123.com','cristovao lins')";
    private static final String sqlCreateEmployee3 = "INSERT INTO Employees(id, Name, Age, Email, Address) VALUES (2,'robson',34,'robson@123.com','ataliba leonel')";
    private static final String sqlUpdateEmployee1 = "UPDATE Employees SET Address = 'CRISTOVAO LINS, 115' WHERE ID = 1";
    private static final Logger logger = Logger.getLogger(Main.class);

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

    private static void showTableEmployee(Connection connection) throws Exception{
        String sqlQuery = "SELECT * FROM Employees";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3) + " - " + resultSet.getString(4) + " - " + resultSet.getString(5));
        }
    }

    private static void addNewEmployee(String query) throws Exception {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        try {
            statement.execute(query);
            logger.info("cadastrado com sucesso");
        } catch (Exception ex){
            if(ex.getMessage().contains("Unique index or primary key violation")) {
                logger.info("usuário com mesmo id");
            }
        }
        finally {
            if(connection == null){
                return;
            }
            connection.close();
        }
    }

    private static void updateEmployee(String query) throws Exception {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        statement.execute(query);
        logger.debug("cadastrado atualizado com sucesso");
        if(connection == null){
            return;
        }
        connection.close();
    }

    private static void deleteEmployeeById(Integer id) throws Exception{
        String sqlSelectQuery = "SELECT * FROM Employees WHERE id =" + id.toString();
        String sqlDeleteQuery = "DELETE FROM Employees WHERE id =" + id;

        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
        while (resultSet.next()){
            logger.info(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3) + " - " + resultSet.getString(4) + " - " + resultSet.getString(5) + " sera excluido");
        }
        statement.execute(sqlDeleteQuery);
        logger.info("exclusao concluida com sucesso");
        if(connection == null){
            return;
        }
        connection.close();
    }

    private static void deleteEmployeeByColumn(String column, String info) throws Exception{
        String sqlSelectQuery = "SELECT * FROM Employees WHERE " + column + " = '" + info + "'";
        String sqlDeleteQuery = "DELETE FROM Employees WHERE " + column + " = '" + info + "'";

        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
        while (resultSet.next()){
            logger.info(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3) + " - " + resultSet.getString(4) + " - " + resultSet.getString(5) + " sera excluido");
        }
        statement.execute(sqlDeleteQuery);
        logger.info("exclusao concluida com sucesso");
        if(connection == null){
            return;
        }
        connection.close();
    }




    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        Connection connection = null;
        connection = getConnection();

        Statement statement = connection.createStatement();
        statement.execute(sqlCreateTable);

        addNewEmployee(sqlCreateEmployee1);
        addNewEmployee(sqlCreateEmployee2);
        addNewEmployee(sqlCreateEmployee3);
        showTableEmployee(connection);
        updateEmployee(sqlUpdateEmployee1);
        showTableEmployee(connection);

        deleteEmployeeById(1);
        showTableEmployee(connection);

        deleteEmployeeByColumn("Name", "marina");
        showTableEmployee(connection);


    }
}