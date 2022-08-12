package Aula12;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static MesaAula12.Main.getConnection;

public class Main {
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario"+
            "("+
            "id INT PRIMARY KEY," +
            "Primeiro_Nome VARCHAR(100) NOT NULL," +
            "Sobrenome VARCHAR(100) NOT NULL," +
            "Idade INT NOT NULL" +
            ")";

    private static final String sqlInsert1 = "INSERT INTO Usuario(id, Primeiro_Nome, Sobrenome, Idade) VALUES (1, 'issao', 'takeuchi', 33)";
    private static final String sqlInsert2 = "INSERT INTO Usuario(id, Primeiro_Nome, Sobrenome, Idade) VALUES (2, 'marina', 'agueda', 34)";
    private static final String sqlInsert3 = "INSERT INTO Usuario(id, Primeiro_Nome, Sobrenome, Idade) VALUES (3, 'robson', 'reis', 34)";

    private static final String sqlDelete = "DELETE FROM Usuario WHERE id = 2";
    private static final Logger logger = Logger.getLogger(Main.class);

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);

            statement.execute(sqlDelete);

            logger.info("excluido o usuario com o id 2");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(connection == null){
                return;
            }
            connection.close();
        }
    }
}
