package com.stackroute.packet;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;

@Document(collection = "music")
//
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Music
{
    @Id
    private int trackId;
    private String album;
    private String comment;

}
