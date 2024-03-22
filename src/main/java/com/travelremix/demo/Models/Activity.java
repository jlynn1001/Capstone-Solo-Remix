package com.travelremix.demo.Models;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Activity {
    @Id
    @GeneratedValue

    private Integer activityId;



    @Column(name="name")
    private String name;



    @Column(name="location")
    private String location;



    @Column(name="description")
    private String description;


    @Column(name="cost")
    private double cost;


    @Column(name="indoor")
    private boolean isIndoor;


    @Column(name="rating")
    private Integer rating;

    @ManyToMany(mappedBy = "selectedActivities")

    private List<Trip> selectedByTrips;

    @ManyToMany(mappedBy = "likedActivities")

    private List<Trip> likedByTrips;
}
