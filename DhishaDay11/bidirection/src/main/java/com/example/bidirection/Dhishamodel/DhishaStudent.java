package com.example.bidirection.Dhishamodel;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class DhishaStudent {
    @Id
    private int id;
    private String name;

    @JsonManagedReference
    @OneToOne(mappedBy = "student" , cascade = CascadeType.ALL)
    private DhishaStudentInfo studentInfo;
}