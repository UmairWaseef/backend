package com.example.muzfi.Model.Post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@Document(collection = "topics")
public class Topic extends Post {

}
