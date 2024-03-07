package com.travelremix.demo.Models;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Activity {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Integer activityId;


    @Getter
    @Setter
    @Column(name="name")
    private String name;


    @Getter
    @Setter
    @Column(name="location")
    private String location;


    @Getter
    @Setter
    @Column(name="description")
    private String description;

    @Getter
    @Setter
    @Column(name="cost")
    private double cost;

    @Getter
    @Setter
    @Column(name="indoor")
    private boolean isIndoor;

    @Getter
    @Setter
    @Column(name="rating")
    private Integer rating;

    @ManyToMany(mappedBy = "selectedActivities")
    @Getter
    @Setter
    private List<Trip> selectedByTrips;

    @ManyToMany(mappedBy = "likedActivities")
    @Getter
    @Setter
    private List<Trip> likedByTrips;
}
