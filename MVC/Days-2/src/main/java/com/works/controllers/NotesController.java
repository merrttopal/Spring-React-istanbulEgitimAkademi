package com.works.controllers;

import com.works.props.Notes;
import com.works.props.Users;
import com.works.services.NotesService;
import com.works.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NotesController {
    int status = -1;
    String message = "";
    int nid = 0;

    NotesService notesService = new NotesService();
    @GetMapping("/notes")
    public String notes(){
        return "notes";
    }

    @PostMapping("/noteSave")
    public String noteSave(Notes note){
        NotesService notesService = new NotesService();
        int status = notesService.saveNote(note);
        return "notes";}

    @GetMapping("/deleteNote/{nid}")
    public String deleteNote(@PathVariable int nid) {
        notesService.deleteNote(nid);
        status = notesService.deleteNote(nid);
        if (status > 0) {
            message = "Delete Success - " + nid;
            this.nid = nid;
        }else {
            message = "Delete Fail - " + nid;
        }
        return "redirect:/notes";
    }
}
