package com.stackroute.repository;

import com.stackroute.packet.Music;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyMusicRepo extends MongoRepository<Music,Integer>
{
    Music findById(int id);
    //@Query(value="from Music where album =?1")
    List<Music> findByAlbum(String song);
}
