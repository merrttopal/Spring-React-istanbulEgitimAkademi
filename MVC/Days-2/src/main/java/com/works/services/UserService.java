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

    public List<Users> users(int p) {
        List<Users> ls = new ArrayList<>();
        DB db = new DB();
        try {
            p = p-1;
            p = p*50;
            String sql = "select * from users where status = 1 order by uid desc limit ?,50";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1,p);
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

    public int totalCount(){
        int count = 0;
        DB db = new DB();
        try {
            String sql =  "select count(uid) as count from  users where status = 1";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            if (rs.next()){
                count = rs.getInt("count");
            }

        }catch (Exception e){
            System.err.println(e);
        }finally {
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
    public Users showUser(int uid){
        Users user = new Users();
        int status =0;
        DB db = new DB();
        try {
            String sql = "select * from users where uid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, uid);
            ResultSet rs = pre.executeQuery();
            if (rs.next()){
                user.setUid(rs.getInt(uid));
                user.setName( rs.getString("name") );
                user.setSurname( rs.getString("surname") );
                user.setEmail( rs.getString("email") );
                user.setDate( rs.getString("date") );
            }

        }catch (Exception e){
            System.err.println(e);
        }finally {
            db.close();
        }
        return user;
    }
}
