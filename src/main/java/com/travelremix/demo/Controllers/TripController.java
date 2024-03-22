package com.travelremix.demo.Controllers;

import com.travelremix.demo.Services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TripController {
    @Autowired
    private TripService tripService;
}
