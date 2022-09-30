package com.boot.service;


import com.boot.models.Artist;
import com.boot.models.Type;
import com.boot.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GalleryService {

    private ArtistRepository artistRepository;

    @Autowired
    public GalleryService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public void initializeDB()
    {
        artistRepository.saveAll(List.of(
                new Artist(Type.SCULPTOR, "Donatello", "di Betto Bardi"),
                new Artist(Type.PAINTER, "Leonardo", "da Vinci"),
                new Artist(Type.SCULPTOR, "Michelangelo", "Buanarotti"),
                new Artist(Type.PAINTER, "Raffaello", "Sanzio"),
                new Artist(Type.ILLUSTRATOR, "Splinter", "Master")
        )).forEach(System.out::println);
    }

    public List<Artist> getArtists()
    {
        return artistRepository.findAll();
    }

    public Artist saveArtist(Artist artist)
    {
        return artistRepository.save(artist);
    }

    public Optional<Artist> findArtistById(Integer id)
    {
        return artistRepository.findById(id);
    }
}
