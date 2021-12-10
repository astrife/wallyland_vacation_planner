package com.ist412.wallyland_vacation_planner.ride_ticket;

import com.ist412.wallyland_vacation_planner.control.*;
import javax.swing.*;

/**
 * View to display Ride Ticket QR code
 * 
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-11-21
 */
public class RideTicketView extends JDialog {
    public RideTicketView() {
        this.setTitle("Ride ticket");
        this.setSize(500, 500);
        ImageIcon icon = RideTicketController.getInstance().loadQRCode("assets/qr_code/code.png", "test");
        this.add(new JLabel(icon));
        this.setVisible(true);
    }
}
