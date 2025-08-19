package com.bodif.GestiondeStock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
     private Integer id;

    @CreatedDate
    @Column(name="creationDate",nullable = false)
    @JsonIgnore
    private Date creationDate;

    @LastModifiedDate
     @Column(name="lastModifiedDate")
    @JsonIgnore
    private Date lastModifiedDate;
}
