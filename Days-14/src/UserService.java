import models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    DB db = new DB();

    public int save(User user) {
        int status = 0;
        Connection connection = db.getConnect();
        try {
            String sql = "insert into users values(null, ? , ? , ? , ? , ?, ? , now() )";
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, user.getName());
            pre.setString(2, user.getSurname());
            pre.setString(3, user.getEmail());
            pre.setString(4, user.getPassword());
            pre.setBoolean(5, user.getStatus());
            pre.setInt(6, user.getAge());
            status = pre.executeUpdate();

        } catch (Exception ex) {
            System.err.println("Save Error: " + ex);

        } finally {
            db.close();
        }
        return status;
    }


    public int delete(int uid) {
        int status = 0;
        Connection connection = db.getConnect();
        try {
            String sql = "delete from users where uid = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, uid);
            status = preparedStatement.executeUpdate();

        } catch (Exception e) {
            System.err.println("Delete Error : " + e);
        } finally {
            db.close();
        }

        return status;
    }

    public int delete(int... uids) {
        int status = 0;
        Connection connection = db.getConnect();
        try {
            for (int item : uids) {
                String sql = "delete from users where uid = ? ";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, item);
                status = preparedStatement.executeUpdate();
            }

        } catch (Exception e) {
            System.err.println("Delete Error : " + e);
        } finally {
            db.close();
        }

        return status;
    }

    public int update(User user) {
        int status = 0;
        Connection connection = db.getConnect();
        try {
            String sql = "update users set  name = ? , surname = ? , email = ? , password = ?, Status = ? , age = ? where uid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setBoolean(5, user.getStatus());
            preparedStatement.setInt(6, user.getAge());
            preparedStatement.setInt(7, user.getUid());
            status = preparedStatement.executeUpdate();

        } catch (Exception exception) {
            System.err.println("Update Error : " + exception);
        } finally {
            db.close();
        }
        return status;
    }

    public List<User> allList() {
        List<User> ls = new ArrayList<>();
        Connection connection = db.getConnect();
        try {
            String sql = "Select * from users";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            parseTable(ls, rs);

        } catch (Exception ex) {
            System.err.println("AllList Error" + ex);
        } finally {
            db.close();
        }
        return ls;
    }

    public List<User> userSearch(String data, int page) {
        List<User> ls = new ArrayList<>();
        Connection connection = db.getConnect();
        try {
            data = "%" + data + "%";
            String sql = "SELECT * FROM users WHERE name like ? or surname like ? or email like ? limit ? , 10";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, data);
            preparedStatement.setString(2, data);
            preparedStatement.setString(3, data);
            preparedStatement.setInt(4,page);
            ResultSet rs = preparedStatement.executeQuery();
            parseTable(ls, rs);

        } catch (Exception ex) {
            System.err.println("Search Error" + ex);
        } finally {
            db.close();
        }
        return ls;
    }


    public boolean userLogin(String email, String password){
        boolean status = false;
        Connection connection = db.getConnect();
        try {
            String sql = "select uid from users where email = ? and password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,password);
            ResultSet rs = preparedStatement.executeQuery();
            status  = rs.next();


        }catch (Exception e){
            System.err.println("UserLogin Error"+e);
        }finally {
            db.close();
        }
        return status;
    }
    public void parseTable(List<User> ls, ResultSet rs) throws SQLException {
        while (rs.next()) {
            int uid = rs.getInt("uid");
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            String email = rs.getString("email");
            String password = rs.getString("password");
            Boolean status = rs.getBoolean("status");
            Integer age = rs.getInt("age");
            Date date = rs.getDate("date");

            User user = new User(name, surname, email, password, status, age);
            user.setUid(uid);
            user.setDate(date);
            System.out.println(uid);
        }
    }

}








