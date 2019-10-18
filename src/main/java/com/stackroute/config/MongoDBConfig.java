package com.stackroute.config;



import com.stackroute.repository.MyMusicRepo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = MyMusicRepo.class)
@Configuration
public class MongoDBConfig {

}
