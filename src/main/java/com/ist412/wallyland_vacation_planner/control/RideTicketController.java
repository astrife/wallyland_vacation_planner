package com.ist412.wallyland_vacation_planner.control;

import javax.swing.*;

/**
 * Controller for showing ride ticket use case.
 * 
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-11-21
 */
public class RideTicketController {
    private static RideTicketController controllerInstance = null;
    
    private RideTicketController() {}
    
    public static RideTicketController getInstance() {
        if (controllerInstance == null) {
            controllerInstance = new RideTicketController();
        }
        
        return controllerInstance;
    }
    
    public ImageIcon loadQRCode(String imagePath, String desc) {
        return new ImageIcon(imagePath, desc);
    }
}
