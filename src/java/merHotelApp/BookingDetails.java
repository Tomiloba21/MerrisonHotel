/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package merHotelApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


/**
 *
 * @author admin
 */
@Configuration
public class BookingDetails {
   
    @Qualifier("customer")
    public Customer customer;
    @Qualifier("rooms")
    public Rooms rooms;

    @Override
    public String toString() {
        return "BookingDetails{" + "Mr. " + customer.getFirstName() +" "+customer.getLastName() + ", rooms=" + rooms.getRoomType() + '}';
    }
    
    public void book(){
        System.out.println("Reservation bookd for  Mr." + customer.getFirstName()+ " " +  customer.getLastName()+""
                + "======="+ rooms.getNoOfRooms()+ " rooms in " + rooms.getRoomType()+" Enjoy your stay :)");
    }
    
    public void reset(){
        System.out.println("Reseting rooms =========== reseted");
    }
    
    
    
    
    
    
}
