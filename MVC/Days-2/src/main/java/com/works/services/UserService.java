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
        try {
            String sql = "select * from users";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                Users user = new Users();
                user.setUid(rs.getInt("uid"));
                user.setName(rs.getString("name"));
                user.setSurname(rs.getString("surname"));
                user.setEmail(rs.getString("email"));
                user.setDate(rs.getString("date"));
                ls.add(user);

            }

        } catch (Exception exception) {
            System.err.println("Users Error " + exception);
        } finally {
            db.close();
        }
        return ls;
    }

    public int deleteUser(int uid) {
        int status = 0;
        try {
            String sql = "update users set `deletedUsers` = 1 where uid = ?";
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
    public int undeleteUser(int uid) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "update users set `deletedUsers` = 0 where uid = ?";
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
}
