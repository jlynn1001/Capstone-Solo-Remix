package com.travelremix.demo.DTOs;

import com.travelremix.demo.Models.Trip;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
public class ActivityDTO {
        @Getter
        @Setter
        private Integer activityId;


        @Getter
        @Setter
        private String name;


        @Getter
        @Setter
        private String location;


        @Getter
        @Setter
        private String description;

        @Getter
        @Setter
        private double cost;

        @Getter
        @Setter
        private boolean isIndoor;

        @Getter
        @Setter
        private Integer rating;


        @Getter
        @Setter
        private List<Trip> selectedByTrips;


        @Getter
        @Setter
        private List<Trip> likedByTrips;
}
