package com.example.demo.Model;
//import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Data
@Table(name = "message")
public class Message {

   
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "channel")
    private String channel;

    @Column(name = "sender")
    private String sender;

    @Column(name = "content")
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "timestamp")
    private Date timestamp;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "read_date")
    private Date readDate;

}