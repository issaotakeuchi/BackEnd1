package MesaAula11;

import java.sql.*;

public class Main {
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Figuras; CREATE TABLE Figuras" +
            "("+"id INT PRIMARY KEY," +
            "Figura VARCHAR(25) NOT NULL," +
            "Cor VARCHAR(25) NOT NULL" +
            ")";
    private static final String sqlInsertCirculo1 = "INSERT INTO Figuras(id,Figura,Cor) VALUES (1, 'CIRCULO', 'VERMELHO')";
    private static final String sqlInsertCirculo2 = "INSERT INTO Figuras(id,Figura,Cor) VALUES (2, 'CIRCULO', 'AZUL')";
    private static final String sqlInsertQuadrado1 = "INSERT INTO Figuras(id,Figura,Cor) VALUES (3, 'QUADRADO', 'AZUL')";
    private static final String sqlInsertQuadrado2 = "INSERT INTO Figuras(id,Figura,Cor) VALUES (4, 'QUADRADO', 'VERMELHO')";
    private static final String sqlInsertQuadrado3 = "INSERT INTO Figuras(id,Figura,Cor) VALUES (5, 'QUADRADO', 'VERDE')";

    private static void selectFiguras(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM Figuras";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }
    }

    private static void selectCirculoVermelho(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM Figuras WHERE Figura = 'CIRCULO' AND Cor = 'VERMELHO'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }
    }

    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            statement.execute(sqlInsertCirculo1);
            statement.execute(sqlInsertCirculo2);
            statement.execute(sqlInsertQuadrado1);
            statement.execute(sqlInsertQuadrado2);
            statement.execute(sqlInsertQuadrado3);

            selectFiguras(connection);
            selectCirculoVermelho(connection);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (connection == null){
                return;
            }
            connection.close();
        }
    }
}
