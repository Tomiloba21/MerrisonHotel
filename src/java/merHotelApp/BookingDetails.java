/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package merHotelApp;





/**
 *
 * @author admin
 */
public class BookingDetails {
   

    public Customer customer;
    
    public Rooms rooms;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Rooms getRooms() {
        return rooms;
    }

    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }
    
    

    @Override
    public String toString() {
        return "BookingDetails{" + "Mr. " + getCustomer().getFirstName() +" "+getCustomer().getLastName() + ", rooms=" + getRooms().getRoomType() + '}';
    }
    
    public void book(){
        System.out.println("Reservation bookd for  Mr." + getCustomer().getFirstName()+ " " +  getCustomer().getLastName()+""
                + "======="+ getRooms().getNoOfRooms()+ " rooms in " + getRooms().getRoomType()+" Enjoy your stay :)");
    }
    
    public void reset(){
        System.out.println("Reseting rooms =========== reseted");
    }
    
    
    
    
    
    
}
