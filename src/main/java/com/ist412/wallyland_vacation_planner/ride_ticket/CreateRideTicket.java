package com.ist412.wallyland_vacation_planner.ride_ticket;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import java.io.IOException;
import java.nio.file.Paths;


/**
 * Model class to create QR codes when user makes a reservation.
 * 
 * @author Shreyas, Jason C. Nucciarone
 * @version 1.0
 * @since 2021-11-21
 */
public class CreateRideTicket {
    public static void generateCode() throws WriterException, IOException{
        String data = "Ticket # 423222"; 
        String path = "assets/qr_code/code.png"; 
        
        BitMatrix matrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 500, 500); 
        MatrixToImageWriter.writeToPath(matrix, "png", Paths.get(path));
    }
}
