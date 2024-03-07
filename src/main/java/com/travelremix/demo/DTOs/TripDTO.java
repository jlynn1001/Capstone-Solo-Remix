package com.travelremix.demo.DTOs;

import com.travelremix.demo.Models.Activity;
import com.travelremix.demo.Models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
public class TripDTO {
    @Getter
    @Setter
    private Integer tripId;
    @Getter
    @Setter
    private String tripLocation;
    @Getter
    @Setter
    private List<User> travelers;
    @Getter
    @Setter
    private List<Activity> selectedActivities;
    @Getter
    @Setter
    private List<Activity> likedActivities;
}
