package dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import model.User;
import util.DbUtil;
 
public class UserDAO {
 
    private static Connection connection = DbUtil.getConnection();
 
    public static User addUser(String cpf, String nome, String email, String telefone, String nickname, String cep, String endereco, String bairro,String datanasciemnto, String sexo) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("insert into users(cpf, nome, email, telefone, nickmane, cep, endereco, bairro, datanascimento, sexo) values (?, ?, ?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pStmt.setString(1, cpf);
            pStmt.setString(2, nome);
            pStmt.setString(3, email);
            pStmt.setString(4, telefone);
            pStmt.setString(5, nickname);
            pStmt.setString(6, cep);
            pStmt.setString(7, endereco);
            pStmt.setString(8, bairro);
            pStmt.setString(9, datanasciemnto);
            pStmt.setString(10, sexo);

            pStmt.executeUpdate();
            ResultSet rs = pStmt.getGeneratedKeys();
            if (rs.next()) {
                return new User(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome"), rs.getString("email"), rs.getString("telefone"),rs.getString("nickmane"), rs.getString("cep"), rs.getString("endereco"), rs.getString("bairro"), rs.getString("datanascimento"),rs.getString("sexo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return null;
    }
 
    public static User updateUser(int id, String cpf, String nome, String email, String telefone, String nickname, String cep, String endereco, String bairro,String datanasciemnto, String sexo) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("update users set cpf=?, nome=?, email=?, telefone=?, nickmane=?, cep=?, endereco=?, bairro=?, datanascimento=?, sexo=?",
                    Statement.RETURN_GENERATED_KEYS);
            pStmt.setString(1, cpf);
            pStmt.setString(2, nome);
            pStmt.setString(3, email);
            pStmt.setString(4, telefone);
            pStmt.setString(5, nickname);
            pStmt.setString(6, cep);
            pStmt.setString(7, endereco);
            pStmt.setString(8, bairro);
            pStmt.setString(9, datanasciemnto);
            pStmt.setString(10, sexo);
            pStmt.setInt(11, id);
            pStmt.executeUpdate();
            ResultSet rs = pStmt.getGeneratedKeys();
            if (rs.next()) {
                return new User(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome"), rs.getString("email"), rs.getString("telefone"),rs.getString("nickmane"), rs.getString("cep"), rs.getString("endereco"), rs.getString("bairro"), rs.getString("datanascimento"),rs.getString("sexo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return null;
    }
 
    public static void deleteUser(int id) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("delete from users where id=?");
            pStmt.setInt(1, id);
            pStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    public static List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from users order by id");
            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome"), rs.getString("email"), rs.getString("telefone"),rs.getString("nickname"), rs.getString("cep"), rs.getString("endereco"), rs.getString("bairro"), rs.getString("datanascimento"),rs.getString("sexo"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return users;
    }
 
    public static User getUser(int id) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("select * from users where id=?");
            pStmt.setInt(1, id);
            ResultSet rs = pStmt.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome"), rs.getString("email"), rs.getString("telefone"),rs.getString("nickmane"), rs.getString("cep"), rs.getString("endereco"), rs.getString("bairro"), rs.getString("datanascimento"),rs.getString("sexo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return null;
    }
 
    public static User getUserByLogin(String login) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("select * from users where login=?");
            pStmt.setString(1, login);
            ResultSet rs = pStmt.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome"), rs.getString("email"), rs.getString("telefone"),rs.getString("nickmane"), rs.getString("cep"), rs.getString("endereco"), rs.getString("bairro"), rs.getString("datanascimento"),rs.getString("sexo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return null;
    }
}