package com.works.services;

import com.works.props.Notes;
import com.works.props.Users;
import com.works.utils.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NotesService {
    List<Users> ls = new ArrayList<>();
    DB db = new DB();
    public List<Notes> notes() {
        List<Notes> ls = new ArrayList<>();
        DB db = new DB();
        try {
            String sql = "select * from notes order by nid DESC ";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()) {
                Notes notes = new Notes();
                notes.setNid( rs.getInt("nid") );
                notes.setTitle( rs.getString("title") );
                notes.setDescription( rs.getString("detail") );
                ls.add(notes);
            }
        }catch (Exception ex) {
            System.err.println("Users Error : " + ex);
        }finally {
            db.close();
        }
        return ls;
    }
    public int saveNote(Notes note) {
        System.out.println(note);
        int status = 0;

        try {
            String sql = "insert into notes (nid, title, description) values (NULL,?,?)";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, note.getTitle());
            pre.setString(2, note.getDescription());
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            db.close();
        }
        return status;
    }
    public int deleteNote (int nid) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "delete from notes where nid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1,nid);
            status = pre.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            db.close();
        }
        return status;
    }
}
