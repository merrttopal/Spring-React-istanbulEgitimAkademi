package com.works.services;


import com.works.props.Users;
import com.works.utils.DB;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    final TinkEncDec tinkEncDec;

    public List<Users> users(int p) {
        List<Users> ls = new ArrayList<>();
        DB db = new DB();
        try {
            p = p - 1;
            p = p * 50;
            String sql = "select * from users where status = 1 order by uid desc limit ?,50";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, p);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                Users u = new Users();
                u.setUid(rs.getInt("uid"));
                u.setName(rs.getString("name"));
                u.setSurname(rs.getString("surname"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setAge(rs.getInt("age"));
                u.setDate(rs.getString("date"));
                ls.add(u);
            }
        } catch (Exception ex) {
            System.err.println("Users Error : " + ex);
        } finally {
            db.close();
        }
        return ls;
    }

    public int totalCount() {
        int count = 0;
        DB db = new DB();
        try {
            String sql = "select count(uid) as count from  users where status = 1";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                count = rs.getInt("count");
            }

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            db.close();
        }
        return count;
    }

    public int deleteUser(int uid, int dbStatus) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "update users set status = ? where uid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, dbStatus);
            pre.setInt(2, uid);
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            db.close();
        }
        return status;
    }

    public int undeleteUser(int uid) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "update users set status = 0 where uid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, uid);
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            db.close();
        }
        return status;
    }

    public int saveUser(Users user) {
        System.out.println(user);
        int status = 0;
        DB db = new DB();
        try {
            String sql = "insert into users (uid,name,surname, email, password,date,status,age) values (null,?, ?, ?,?,now(),1,?)";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, user.getName());
            pre.setString(2, user.getSurname());
            pre.setString(3, user.getEmail());
            String encriptPass = tinkEncDec.encrypt(user.getPassword());
            pre.setString(4, encriptPass);
            pre.setInt(5, user.getAge());
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            db.close();
        }
        return status;
    }

    public Users showUser(int uid) {
        Users user = new Users();
        int status = 0;
        DB db = new DB();
        try {
            String sql = "select * from users where uid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, uid);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                user.setUid(rs.getInt("uid"));
                user.setName(rs.getString("name"));
                user.setSurname(rs.getString("surname"));
                user.setEmail(rs.getString("email"));
                user.setDate(rs.getString("date"));
            }

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            db.close();
        }
        return user;
    }

    public int updateUser(Users user) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "update users set name = ?, surname = ?, email= ?, password=?,age= ? where uid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, user.getName());
            pre.setString(2, user.getSurname());
            pre.setString(3, user.getEmail());
            pre.setString(4, user.getPassword());
            pre.setInt(5, user.getAge());
            pre.setInt(6, user.getUid());
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            db.close();
        }
        return status;
    }

    public Users userLogin(Users user) {
        Users u = null;
        DB db = new DB();
        try {
            String sql = "select * from users where email = ? ";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, user.getEmail());

            ResultSet rs = pre.executeQuery();
            String password = "";
            if (rs.next()) {

                password = tinkEncDec.decrypt( rs.getString("password"));
            }
            if (password == "") {
                String sql1 = "select * from users where email = ? and  password = ?";
                PreparedStatement pre1 = db.connect().prepareStatement(sql1);

                pre1.setString(1, user.getEmail());
                pre1.setString(2, user.getPassword());

                ResultSet rs1 = pre1.executeQuery();

                if (rs1.next()) {
                    u = new Users();
                    u.setUid(rs1.getInt("uid"));
                    u.setName(rs1.getString("name"));
                    u.setSurname(rs1.getString("surname"));
                    u.setEmail(rs1.getString("email"));
                    u.setPassword(rs1.getString("password"));
                    u.setAge(rs1.getInt("age"));
                    u.setDate(rs1.getString("date"));
                }

            } else if (password != null && user.getPassword().equals(password)) {

                String sql2 = "select * from users where email = ?";
                PreparedStatement pre2 = db.connect().prepareStatement(sql2);

                pre2.setString(1, user.getEmail());

                ResultSet rs2 = pre.executeQuery();

                if (rs2.next()) {
                    u = new Users();
                    u.setUid(rs2.getInt("uid"));
                    u.setName(rs2.getString("name"));
                    u.setSurname(rs2.getString("surname"));
                    u.setEmail(rs2.getString("email"));
                    u.setPassword(rs2.getString("password"));
                    u.setAge(rs2.getInt("age"));
                    u.setDate(rs2.getString("date"));
                }
            }

        } catch (Exception ex) {
            System.out.println("userLogin Error: " + ex);
        } finally {
            db.close();
        }
        return u;
    }

}
