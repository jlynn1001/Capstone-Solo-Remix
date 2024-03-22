package com.travelremix.demo.Models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "trip_id")
    private Integer tripId;


    @Column(name = "trip_location")
    private String tripLocation;


    @ManyToMany
    @JoinTable(
            name = "trip_travelers",
            joinColumns = @JoinColumn(name = "trip_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )

    private List<User> travelers;


    @ManyToMany
    @JoinTable(
            name = "trip_activities",
            joinColumns = @JoinColumn(name = "trip_id"),
            inverseJoinColumns = @JoinColumn(name = "activity_id")
    )

    private List<Activity> selectedActivities;

    @ManyToMany
    @JoinTable(
            name = "trip_liked_activities",
            joinColumns = @JoinColumn(name = "trip_id"),
            inverseJoinColumns = @JoinColumn(name = "activity_id")
    )

    private List<Activity> likedActivities;
}
