public class SmartLockerTester {
    public static void main(String[] args) {

        System.out.println("Remaining Locker Capacity: " + SmartLocker.totalCapacity);

        System.out.println("=======1=======");
        SmartLocker l1 = new SmartLocker("Laptop", 15.0);
        l1.details();

        System.out.println("=======2=======");
        l1.lock();

        System.out.println("=======3=======");
        SmartLocker l2 = new SmartLocker("Projector", 20.5);
        l2.lock();

        System.out.println("=======4=======");
        SmartLocker l3 = new SmartLocker("Monitor", 17.5);
        l3.lock();

        System.out.println("=======5=======");
        SmartLocker l4 = new SmartLocker("Tablet", 8.0);
        l4.lock();

        System.out.println("=======6=======");
        l1.details();
        l3.details();
        System.out.println("Locker ID of l3: " + l3.getLockerId());
        System.out.println("Is l3 locked? " + l3.isLocked());

        System.out.println("=======7=======");
        if (l2.isLocked()) {
            System.out.println("Unlocking locker ID " + l2.getLockerId());
            l2.unlock();
        }

        System.out.println("Remaining Locker Capacity: " + SmartLocker.totalCapacity);

        System.out.println("=======8=======");
        if (!l3.isLocked()) {
            System.out.println("Trying to lock locker ID " + l3.getLockerId());
            l3.lock();
        }

        System.out.println("=======9=======");
        l2.details();
        l4.details();
        System.out.println("Locker ID of l4: " + l4.getLockerId());
        System.out.println("Is l4 locked? " + l4.isLocked());

        System.out.println("Remaining Locker Capacity: " + SmartLocker.totalCapacity);
    }
}