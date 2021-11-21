package com.ist412.wallyland_vacation_planner.control;

import com.ist412.wallyland_vacation_planner.planning_trip.*;

/**
 * Controller for user dashboard after they authenticate in the app.
 * 
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-11-7
 */
public class DashboardController {
    private static DashboardController controllerInstance = null;
    
    private DashboardController() {}
    
    public static DashboardController getInstance() {
        if (controllerInstance == null) {
            controllerInstance = new DashboardController();
        }
        
        return controllerInstance;
    }
    
    public void launchPlanTrip() {
        new PlanTripView();
    }
}
