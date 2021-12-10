package com.ist412.wallyland_vacation_planner.control;

import com.ist412.wallyland_vacation_planner.order_food.FoodCheckoutView;
import com.ist412.wallyland_vacation_planner.order_food.FoodMenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
* Controller for the food UI that user can order.
*
* @author Shih-Hsun, Jason C. Nucciarone
* @version 1.0
* @since 2021-11-21
*/
public class FoodOrderController implements ActionListener {
    private FoodMenuView foodUI;
    private FoodCheckoutView checkoutUI;
    public FoodOrderController(){
        foodUI = new FoodMenuView(this);
        checkoutUI = new FoodCheckoutView();
        foodUI.setVisible(true);
        foodUI.checkoutBtn.addActionListener(this);
    }
    
    /*
    * Class for checkout button function
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        Object obj = e.getSource();
        
        if (obj == foodUI.checkoutBtn)
        {
            int ham, san, pizza, soda;
            double total;
            foodUI.setVisible(false);
            checkoutUI.setHamQTY(foodUI.getHamQty());
            checkoutUI.setSanQTY(foodUI.getSandwhichQty());
            checkoutUI.setPizzaQTY(foodUI.getPizzaQty());
            checkoutUI.setSodaQTY(foodUI.getSodaQty());
            ham = Integer.parseInt(foodUI.getHamQty());
            san = Integer.parseInt(foodUI.getSandwhichQty());
            pizza = Integer.parseInt(foodUI.getPizzaQty());
            soda = Integer.parseInt(foodUI.getSodaQty());
            
            total = ((ham *16.99)+(san *16.99)+(pizza *29.99)+(soda *9.99));
            
            checkoutUI.setTotalAmount(String.format("%.2f", total));
            
            checkoutUI.setVisible(true);
            
        }

    }
    
}
