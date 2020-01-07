package com.example.elasticsearch_project.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Data
@Document(indexName = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String userName;

    private String fristName;

    private String lastName;

    public String toSting(){
        return this.getId()+this.fristName+this.lastName+this.userName;
    }
}
