package com.stackroute.listener;

import com.stackroute.packet.Music;
import com.stackroute.repository.MyMusicRepo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ApplicationStartup implements ApplicationRunner {

    @Autowired
    private MyMusicRepo myMusicRepo;



    @Override
    public void run(ApplicationArguments args) throws Exception {
        myMusicRepo.save(new Music(24,"ameedwen","qwwqe"));
    }
}
