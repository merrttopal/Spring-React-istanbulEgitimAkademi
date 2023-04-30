package com.works.services;

import com.works.props.Users;
import com.works.utils.DB;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SearchService {

    List<Users> ls = new ArrayList<>();
    DB db = new DB();

    public List<Users> searchlist(String q) {
        List<Users> ls = new ArrayList<>();
        DB db = new DB();
        try {
            q = "%"+q+"%";
            String sql = "select * from users where name like ? or surname like ? or email like ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, q);
            pre.setString(2, q);
            pre.setString(3, q);
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
}
