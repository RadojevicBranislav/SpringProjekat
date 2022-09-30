package com.boot.config;

import com.boot.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppInit implements CommandLineRunner {

    @Autowired
    private GalleryService galleryService;


    @Override
    public void run(String... args) throws Exception {

        galleryService.initializeDB();

    }


}
