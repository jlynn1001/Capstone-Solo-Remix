package com.travelremix.demo.Services;
import com.travelremix.demo.DTOs.TripDTO;
import com.travelremix.demo.Models.Trip;
import org.springframework.stereotype.Service;

@Service
public class TripService {
    private Trip convertToEntity(TripDTO tripDTO) {
        return new Trip(
                tripDTO.getTripId(),
                tripDTO.getTripLocation(),
                tripDTO.getTravelers(),
                tripDTO.getSelectedActivities(),
                tripDTO.getLikedActivities()
        );
    }

    private TripDTO convertToDTO(Trip trip) {
        return new TripDTO(
                trip.getTripId(),
                trip.getTripLocation(),
                trip.getTravelers(),
                trip.getSelectedActivities(),
                trip.getLikedActivities()
        );
    }
}
