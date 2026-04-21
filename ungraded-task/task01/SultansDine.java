public class SultansDine {

   // Static variable
   private static int totalBranch = 0;
   private static double totalSell = 0;

   // Static array (সব branch store করার জন্য)
   private static SultansDine branches[] = new SultansDine[10];

   // Instance variable
   private String name;
   private int quantity;
   private double branchSell;

   // Constructor
   public SultansDine(String name) {
       this.name = name;

       // array তে store
       branches[totalBranch] = this;
       totalBranch++;
   }

   // quantity set করার method
   public void sellQuantity(int q) {
       this.quantity = q;

       // sell calculation
       if (q < 10) {
           branchSell = q * 300;
       } else if (q < 20) {
           branchSell = q * 350;
       } else {
           branchSell = q * 400;
       }

       // total sell update
       totalSell += branchSell;
   }

   // single branch info
   public void branchInformation() {
       System.out.println("Branch Name: " + name);
       System.out.println("Branch Sell: " + (int)branchSell + " Taka");
   }

   // static method: সব branch info
   public static void details() {

       System.out.println("Total Number of branch(s): " + totalBranch);
       System.out.println("Total Sell: " + (int)totalSell + " Taka");

       for (int i = 0; i < totalBranch; i++) {

           double percent = (branches[i].branchSell / totalSell) * 100;

           System.out.println("Branch Name: " + branches[i].name + ", Branch Sell: " + (int)branches[i].branchSell + " Taka");
           System.out.printf("Branch consists of total sell's %.2f \n", percent);
       }
   }
}
