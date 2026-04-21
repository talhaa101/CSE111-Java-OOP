public class Cargo {

   // Static variable (সব cargo এর জন্য common)
   private static int count = 0;        // total cargo count
   private static double usedWeight = 0; // already loaded weight

   // Instance variable
   private int id;
   private String contents;
   private double weight;
   private boolean loaded;

   // Constructor
   public Cargo(String contents, double weight) {
       this.contents = contents;
       this.weight = weight;
       this.loaded = false;

       // ID assign
       count++;
       this.id = count;
   }

   // static method: remaining capacity
   public static double capacity() {
       return 10.0 - usedWeight;
   }

   // cargo load করার method
   public void load() {

       // যদি already loaded না হয়
       if (!loaded) {

           // capacity check
           if (usedWeight + weight <= 10.0) {
               usedWeight += weight;
               loaded = true;

               System.out.println("Cargo " + id + " loaded for transport.");
           } else {
               System.out.println("Cannot load cargo, exceeds weight capacity.");
           }
       }
   }

   // cargo unload করার method
   public void unload() {

       if (loaded) {
           usedWeight -= weight;
           loaded = false;

           System.out.println("Cargo " + id + " unloaded.");
       }
   }

   // cargo details print
   public void details() {
       System.out.println("Cargo ID: " + id + ", Contents: " + contents + ", Weight: " + weight + ", Loaded: " + loaded);
   }
}
