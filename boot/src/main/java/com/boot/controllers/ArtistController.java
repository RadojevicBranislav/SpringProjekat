package com.boot.controllers;

import com.boot.models.Artist;
import com.boot.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    @Autowired
    private GalleryService service;

    @GetMapping
    public List<Artist> findAll()
    {
        return service.getArtists();
    }

    @GetMapping("{id}")
    public ResponseEntity<Artist> findById(@PathVariable Integer id)
    {
        return ResponseEntity.of(service.findArtistById(id));
    }

}
