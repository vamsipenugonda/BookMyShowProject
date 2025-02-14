package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity(name="users")//table in sql
public class User extends BaseModel{
    private String name;
    private String email;
    @OneToMany
    private List<Booking> bookings;
}
