/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merHotelApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author admin
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("merHotelApp/springconfig.xml");
        
        BookingDetails bookingDetails = (BookingDetails) context.getBean("bookRoom");
        bookingDetails.toString();
        bookingDetails.book();
   
        
//        Customer customer = (Customer) context.getBean("CustomerBean");
//        
//        System.out.println(customer.getAddress());
//        System.out.println(customer.getFirstName());
    }

}
