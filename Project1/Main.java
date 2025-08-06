import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarRentalSystem rentalSystem= new CarRentalSystem();

        Car car1= new Car("C9144", "Mahindra", "Thar", 2300, true);
        Car car2= new Car("C5467", "Tata", "CURV", 2400, true);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);

        rentalSystem.menu();

    }
}
class Car {
    private String CarId;
    private String brand;
    private String Model;
    private double basePricePerDay;
    private boolean isAvailable;

    public Car(String carId, String brand, String model, double basePricePerDay, boolean isAvailable) {
        this.CarId = carId;
        this.brand = brand;
        this.Model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = isAvailable;
    }

    public String getCarId() {
        return CarId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return Model;
    }

    public double getBasePricePerDay() {
        return basePricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double CalculatePrice(int rentalDays){
        return basePricePerDay*rentalDays;
    }

    public void rent(){
        isAvailable= false;
    }

    public void returnCar(){
        isAvailable=true;
    }
}


class Customer {
    private String Name;
    private String MobileNumber;
    private String CustomerId;

    public Customer(String customerId, String name, String mobileNumber) {
        this.Name = name;
        this.MobileNumber = mobileNumber;
        this.CustomerId = customerId;
    }

    public String getName() {
        return Name;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public String getCustomerId() {
        return CustomerId;
    }
}

class Rental {
    private Car car;
    private Customer customer;
    private int days;

    public Rental(Car car, Customer customer, int days){
        this.car= car;
        this.customer= customer;
        this.days= days;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }
    
}

class CarRentalSystem {
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;
    private int CustomerCount=1;
    
    public CarRentalSystem(){
        cars= new ArrayList<>();
        customers = new ArrayList<>();
        rentals= new ArrayList<>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void rentCar(Car car, Customer customer,int days){
        if(car.isAvailable()){
            rentals.add(new Rental(car, customer, days));
            car.rent();
        }
        else{
            System.out.println("Currently Car is not available.");
        }
    }

    public void returnCar(Car car){
        Rental removeRental= null;
        for(Rental rent: rentals ){
            if(rent.getCar()==car){
                removeRental= rent;
                break;
            }
        }

        if(removeRental!=null){
            rentals.remove(removeRental);
            car.returnCar();
            System.out.println("Car returned Successfully..");
        }
        else{
            System.out.println("Car was not returned..");
        }
    }

    public void menu(){
        Scanner sc= new Scanner(System.in);
        boolean running= true;
        while (running) {
            System.out.println("===== Car Rental System =====");
            System.out.println("1. Rent a car");
            System.out.println("2. Return a car");
            System.out.println("3. Exit");
            System.out.println("Enter your choice..");

            int choice= sc.nextInt();
            sc.nextLine(); //to consume next Line

            switch (choice) {
                case 1:{
                    System.out.println("# Rent a car...");

                    System.out.println("Enter your name: ");
                    String customerName= sc.nextLine();

                    System.out.println("Enter your Mobile nunber: ");
                    String MobileNo= sc.nextLine();

                    System.out.println("Hello "+ customerName+ "! Welcome to My car rental application");
                    System.out.println("Available cars..");
                    for(Car car: cars){
                        if(car.isAvailable()){
                            System.out.println("Id: "+car.getCarId()+" - Model: "+ car.getModel()+" - Brand: "+ car.getBrand()+" - Price per day: "+car.getBasePricePerDay());
                        }
                    }
                    System.out.println("Enter the car ID you wanna rent: ");                    
                    String carId= sc.nextLine();
                    
                    System.out.println("Enter the number of days you want this car: ");
                    int rentDays= sc.nextInt();
                    sc.nextLine();

                    String CustomerId="CUS"+CustomerCount++;

                    Customer newCustomer= new Customer(CustomerId, customerName, MobileNo);
                    addCustomer(newCustomer);

                    Car selectedCar= null;
                    for(Car car: cars){
                        if(car.getCarId().equals(carId) && car.isAvailable()){
                            selectedCar=car;
                            break;
                        }
                    }
                    if(selectedCar==null){
                        System.out.println("Car is not available");
                    }
                    else{
                        double totalPrice= selectedCar.CalculatePrice(rentDays);
                        System.out.println("=== Rental Information ===");
                        System.out.println("Customer Id: "+ newCustomer.getCustomerId());
                        System.out.println("Customer Name: "+ newCustomer.getName());
                        System.out.println("Car: "+ selectedCar.getBrand()+" - "+ selectedCar.getModel());
                        System.out.println("Rental days: "+ rentDays);
                        System.out.println("Total price(in Rupees): "+ totalPrice);

                        System.out.println("\nConfirm your booking (YES/NO): ");
                        String confirm= sc.nextLine();

                        if(confirm.equals("YES")){
                            rentCar(selectedCar, newCustomer, rentDays);
                            System.out.println("\n Your booking confirmed..");
                        }
                        else{
                            System.out.println("Booking Failed.");
                        }                      
                    }
                    break;
                }
                case 2:{
                    System.out.println("=== Return a Car.. ===");
                    System.out.println("Enter the car Id you wanna return..");
                    String carId= sc.nextLine();
                    Car carToReturn=null;
                    for(Car car: cars){
                        if(car.getCarId().equals(carId) && !car.isAvailable()){
                            carToReturn= car;
                            break;
                        }
                    }
                    if(carToReturn!= null){
                        Customer customer= null;
                        for(Rental rental: rentals){
                            if(rental.getCar()== carToReturn){
                                customer= rental.getCustomer();
                                break;
                            }
                        }
                        if(customer!= null){
                            returnCar(carToReturn);
                            System.out.println("Car returned Successfully by "+ customer.getName());
                        }
                        else{
                            System.out.println("Information not matched\nTry again");
                        }
                    }
                    break;
                }     
                
                case 3:{
                    running= false;
                    System.out.println("Thank you for using the Car rental system");
                    break;
                }
            
                default:{
                    System.out.println("Invalid input please choose among the above options.");
                }
            }
        }
    }

}
