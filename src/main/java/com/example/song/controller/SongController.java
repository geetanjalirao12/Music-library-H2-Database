/*
 * 
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */

// Write your code here
package com.example.song.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.model.Song;
import com.example.song.service.SongH2Service;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class SongController{
    @Autowired
    public SongH2Service songService;

    @GetMapping("/songs")
    public ArrayList<Song> getSongs(){
        return songService.getSongs();
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable ("songId") int songId){
        return songService.getSongById(songId);
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return songService.addSong(song);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable ("songId") int songId,@RequestBody Song song){
        return songService.updateSong(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable ("songId") int songId){
        songService.deleteSong(songId);
    }
}