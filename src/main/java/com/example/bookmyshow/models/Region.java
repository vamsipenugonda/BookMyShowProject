package com.example.bookmyshow.models;

import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Region extends BaseModel{
    private String name;
    @OneToMany
    private List<Theatre> theatres;
    //private List<Movie> movies;
}
