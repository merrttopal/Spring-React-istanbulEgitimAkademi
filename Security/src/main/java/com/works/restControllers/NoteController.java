package com.works.restControllers;

import com.works.entities.Note;
import com.works.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/note")
public class NoteController {
    final NoteService service;
    @PostMapping("/save")
    public Note save(@RequestBody Note note){
        return service.save(note);
    }

    @GetMapping("/list")
    public List<Note> list(){
        return service.list();
    }
}
