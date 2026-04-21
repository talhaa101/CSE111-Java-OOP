public class SmartLocker {

    // Public static variables
    public static double totalCapacity = 50.0;
    public static int nextId = 1;

    // Private instance variables (Encapsulation)
    private int lockerId;
    private String itemName;
    private double itemWeight;
    private boolean isLocked;

    // Constructor
    public SmartLocker(String itemName, double itemWeight) {
        this.itemName = itemName;
        this.itemWeight = itemWeight;
        this.isLocked = false;
        this.lockerId = nextId;
        nextId++;
    }

    // Lock method
    public void lock() {
        if (!isLocked && totalCapacity >= itemWeight) {
            isLocked = true;
            totalCapacity -= itemWeight;
            System.out.println("Locker " + lockerId + " is now locked.");
        }
        else if (!isLocked) {
            System.out.println("Cannot lock item, exceeds locker capacity.");
        }
    }

    // Unlock method
    public void unlock() {
        if (isLocked) {
            isLocked = false;
            totalCapacity += itemWeight;
            System.out.println("Locker " + lockerId + " is now unlocked.");
        }
    }

    // Details method
    public void details() {
        System.out.println("Locker ID: " + lockerId + 
        ", Item: " + itemName + 
        ", Weight: " + itemWeight + 
        ", Locked: " + isLocked);
    }

    // Getter for lockerId
    public int getLockerId() {
        return lockerId;
    }

    // Check locked status
    public boolean isLocked() {
        return isLocked;
    }
}