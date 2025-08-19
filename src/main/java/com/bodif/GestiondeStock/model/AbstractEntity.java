package com.bodif.GestiondeStock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import jakarta.persistence.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
