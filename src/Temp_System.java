// Class to represent a vehicle
class Vehicle {
    private String plateNumber;
    private String type;

    public Vehicle(String plateNumber, String type) {
        this.plateNumber = plateNumber;
        this.type = type;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getType() {
        return type;
    }
}

// Parking System class to manage parking slots
public class Temp_System {
    private Vehicle[] parkingSlots; 
    private int capacity;
    private int currentSize;

    public Temp_System(int capacity) {
        this.capacity = capacity;
        parkingSlots = new Vehicle[capacity];
        currentSize = 0;
    }

    // Method to park a vehicle
    public void parkVehicle(Vehicle vehicle) {
        if (currentSize < capacity) {
            parkingSlots[currentSize] = vehicle;
            currentSize++;
            System.out.println("Vehicle with plate number " + vehicle.getPlateNumber() + " parked.");
        } else {
            System.out.println("Parking is full. Cannot park vehicle with plate number " + vehicle.getPlateNumber());
        }
    }

    // Method to remove a vehicle from parking
    public void removeVehicle(String plateNumber) {
        boolean found = false;
        for (int i = 0; i < currentSize; i++) {
            if (parkingSlots[i].getPlateNumber().equals(plateNumber)) {
                found = true;
                System.out.println("Vehicle with plate number " + plateNumber + " removed from parking.");
                // Move vehicles behind the removed vehicle forward
                for (int j = i; j < currentSize - 1; j++) {
                    parkingSlots[j] = parkingSlots[j + 1];
                }
                parkingSlots[currentSize - 1] = null;
                currentSize--;
                break;
            }
        }
        if (!found) {
            System.out.println("No vehicle with plate number " + plateNumber + " found in parking.");
        }
    }

    // Method to get details of a parked vehicle
    public void getVehicleDetails(String plateNumber) {
        boolean found = false;
        for (int i = 0; i < currentSize; i++) {
            if (parkingSlots[i].getPlateNumber().equals(plateNumber)) {
                found = true;
                Vehicle vehicle = parkingSlots[i];
                System.out.println("Plate Number: " + vehicle.getPlateNumber());
                System.out.println("Vehicle Type: " + vehicle.getType());
                break;
            }
        }
        if (!found) {
            System.out.println("No vehicle with plate number " + plateNumber + " found in parking.");
        }
    }

    public static void main(String[] args) {
    	Temp_System parkingSystem = new Temp_System(5); 

        // Example usage
        Vehicle car1 = new Vehicle("ABC123", "CAR");
        Vehicle motorcycle1 = new Vehicle("XYZ456", "MOTORCYCLE");

        parkingSystem.parkVehicle(car1);
        parkingSystem.parkVehicle(motorcycle1);
        System.out.println();

        parkingSystem.getVehicleDetails("ABC123");
        parkingSystem.getVehicleDetails("XYZ456");
        System.out.println();

        //Trying to remove non-existing vehicle
        parkingSystem.removeVehicle("ABC123");
        parkingSystem.removeVehicle("DEF789"); 
    }
}
