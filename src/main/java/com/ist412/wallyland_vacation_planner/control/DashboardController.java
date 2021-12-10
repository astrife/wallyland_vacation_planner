package com.ist412.wallyland_vacation_planner.control;

import com.google.zxing.WriterException;
import com.ist412.wallyland_vacation_planner.planning_trip.*;
import com.ist412.wallyland_vacation_planner.ride_ticket.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public void launchOrderFood() {
        new FoodOrderController();
    }
    
    public void launchShowRideTicket() {
        try {
            CreateRideTicket.generateCode();
        } catch (WriterException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        new RideTicketView();
    }
}
