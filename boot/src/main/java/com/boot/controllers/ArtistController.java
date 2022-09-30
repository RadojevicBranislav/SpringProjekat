package com.boot.controllers;

import com.boot.models.Artist;
import com.boot.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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



}
