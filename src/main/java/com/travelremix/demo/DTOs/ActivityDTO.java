package com.travelremix.demo.DTOs;

import com.travelremix.demo.Models.Trip;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ActivityDTO {

        private Integer activityId;

        private String name;

        private String location;

        private String description;

        private double cost;

        private boolean isIndoor;

        private Integer rating;


        @Getter
        @Setter
        private List<Trip> selectedByTrips;


        @Getter
        @Setter
        private List<Trip> likedByTrips;
}
