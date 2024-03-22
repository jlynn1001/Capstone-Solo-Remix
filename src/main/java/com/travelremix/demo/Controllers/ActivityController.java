package com.travelremix.demo.Controllers;

import com.travelremix.demo.Services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ActivityController {
    @Autowired
    private ActivityService activityService;
}
