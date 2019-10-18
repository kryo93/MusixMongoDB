package com.stackroute.listener;

import com.stackroute.packet.Music;
import com.stackroute.repository.MyMusicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Commandline implements CommandLineRunner {

    @Autowired
    MyMusicRepo myMusicRepo;


    @Override
    public void run(String... args) throws Exception
    {
        myMusicRepo.save(new Music(23,"wdeqy","3ed13"));

    }
}
