package MesaAula13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main {
    public static final String sqlCreate = "DROP TABLE IF EXISTS DENTISTA;" +
            "CREATE TABLE DENTISTA" +
            "("+
            "Nome VARCHAR(100) NOT NULL," +
            "Sobrenome VARCHAR(100) NOT NULL," +
            "Matricula INT PRIMARY KEY" +
            ");";

    private static final String sqlInsert = "INSERT INTO DENTISTA(Nome, Sobrenome, Matricula)" +
            "VALUES (?,?,?)";

    private static final String sqlUpdate = "UPDATE DENTISTA SET Matricula = ? WHERE Nome = ?;";

    public static void main(String[] args) throws Exception {
        Dentista dentista = new Dentista("joao", "silva", 123456);
        Connection connection = null;

        try {
            connection = ConnectionJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreate);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);
            preparedStatementInsert.setString(1,dentista.getNome());
            preparedStatementInsert.setString(2,dentista.getSobrenome());
            preparedStatementInsert.setInt(3,dentista.getMatricula());

            preparedStatementInsert.execute();


            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setInt(1, 654321);
            preparedStatementUpdate.setString(2, dentista.getNome());

            preparedStatementUpdate.execute();
            connection.setAutoCommit(true);

        }catch (Exception e){
            e.printStackTrace();
            connection.rollback();
        }finally {
            connection.close();
        }
    }
}
