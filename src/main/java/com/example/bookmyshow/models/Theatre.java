package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String name;
    @ManyToOne
    private Region region;
    @ManyToOne
    private List<Show> shows;
}
