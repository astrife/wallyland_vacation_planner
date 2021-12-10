package com.ist412.wallyland_vacation_planner.ride_ticket;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Class to handle reading QR codes.
 * 
 * @author Shreyas, Jason C. Nucciarone
 * @version 1.0
 * @since 2021-11-21
 */
public class ShowRideTicket 
{
    // This method uses an already generated QR code to obtain the ticket number.
   public static void readTicket() throws FileNotFoundException, IOException, NotFoundException{
       // This is currently configured to my desktop but it can be changed to the project folder. 
       String path = "assets/qr_code/code.png"; 
       BufferedImage bf = ImageIO.read(new FileInputStream(path)); 
       BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(
            new BufferedImageLuminanceSource(bf))); 
       
       Result result = new MultiFormatReader().decode(bitmap); 
       System.out.println(result.getText()); 
   } 
} 
