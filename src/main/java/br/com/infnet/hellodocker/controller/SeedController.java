package br.com.infnet.hellodocker.controller;

import br.com.infnet.hellodocker.model.Song;
import br.com.infnet.hellodocker.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/seed")
public class SeedController {
    @Autowired
    SongRepository songRepository;
    @GetMapping()
    public void seed(){
        Song song1 = Song.builder().name("Time").artist("Pink Floyd").build();
        Song song2 = Song.builder().name("High Hopes").artist("Pink Floyd").build();
        Song song3 = Song.builder().name("Metropolis Pt1").artist("Dream Theater").build();
        Song song4 = Song.builder().name("Sea of Lies").artist("Simphony X").build();
        List<Song> songs = Arrays.asList(song1, song2, song4, song3);
        songRepository.saveAll(songs);
    }
}
