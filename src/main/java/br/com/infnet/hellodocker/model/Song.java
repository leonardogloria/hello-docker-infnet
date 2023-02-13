package br.com.infnet.hellodocker.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class Song {
    @Id
    private String id;
    private String name;
    private String artist;

}