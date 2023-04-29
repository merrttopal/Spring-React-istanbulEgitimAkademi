package com.works.services;


import com.works.props.Users;
import com.works.utils.DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<Users> ls = new ArrayList<>();
    DB db = new DB();

    public List<Users> users() {
        List<Users> ls = new ArrayList<>();
        DB db = new DB();
        try {
            String sql = "select * from users where status = 1";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()) {
                Users u = new Users();
                u.setUid( rs.getInt("uid") );
                u.setName( rs.getString("name") );
                u.setSurname( rs.getString("surname") );
                u.setEmail( rs.getString("email") );
                u.setDate( rs.getString("date") );
                ls.add(u);
            }
        }catch (Exception ex) {
            System.err.println("Users Error : " + ex);
        }finally {
            db.close();
        }
        return ls;
    }

    public int deleteUser(int uid, int dbStatus) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "update users set status = ? where uid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1,dbStatus);
            pre.setInt(2,uid);
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
            pre.setInt(1,uid);
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
            String sql = "insert into users (uid,name,surname, email, password,status,date,age) values (null,?, ?, ?,?,?,now(),1)";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, user.getName());
            pre.setString(2, user.getSurname());
            pre.setString(3, user.getEmail());
            pre.setString(4, user.getPassword());
            pre.setInt(5, user.getAge());
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            db.close();
        }
        return status;
    }
}
