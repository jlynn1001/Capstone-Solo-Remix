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
@Getter
@Setter
public class TripDTO {

    private Integer tripId;

    private String tripLocation;

    private List<User> travelers;

    private List<Activity> selectedActivities;

    private List<Activity> likedActivities;
}
