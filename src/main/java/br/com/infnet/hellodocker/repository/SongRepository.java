package br.com.infnet.hellodocker.repository;

import br.com.infnet.hellodocker.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends MongoRepository<Song,String> {
}
