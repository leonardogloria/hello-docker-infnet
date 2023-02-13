package br.com.infnet.hellodocker.controller;

import br.com.infnet.hellodocker.model.Song;
import br.com.infnet.hellodocker.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {
    @Autowired
    SongRepository songRepository;
    @GetMapping
    public ResponseEntity getAll(){
        List<Song> songs = songRepository.findAll();
        return ResponseEntity.ok(songs);
    }
}
