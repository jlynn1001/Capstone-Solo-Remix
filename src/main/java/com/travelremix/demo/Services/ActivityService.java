package com.travelremix.demo.Services;

import com.travelremix.demo.DTOs.ActivityDTO;
import com.travelremix.demo.Models.Activity;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {
    private Activity convertToEntity(ActivityDTO activityDTO) {
        return new Activity(
                activityDTO.getActivityId(),
                activityDTO.getName(),
                activityDTO.getLocation(),
                activityDTO.getDescription(),
                activityDTO.getCost(),
                activityDTO.isIndoor(),
                activityDTO.getRating(),
                activityDTO.getSelectedByTrips(),
                activityDTO.getLikedByTrips()
        );
    }

    private ActivityDTO convertToDTO(Activity activity) {
        return new ActivityDTO(
                activity.getActivityId(),
                activity.getName(),
                activity.getLocation(),
                activity.getDescription(),
                activity.getCost(),
                activity.isIndoor(),
                activity.getRating(),
                activity.getSelectedByTrips(),
                activity.getLikedByTrips()
        );
    }
}
