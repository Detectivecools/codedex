public class main {
  public static void main(String[] args) {
    System.out.println("hiya mate");
    System.out.println("hiya bruv");
    System.out.println("hello mate");    
    System.out.println(388);
    System.out.println(3/3);
    System.out.println(3*3); // comments can be at the end of the line
    
    // gotta use them slashes for comments
    String name = "John";
    System.out.println(name);
    
    int myNum = 17;
    System.out.println(myNum);
    
    var myfirstName = "vihaan";
    var mylastName = "shetty";
    var myFullname = (myfirstName + " " + mylastName); 
    
    System.out.println(myFullname);
    System.out.println("The length of the txt string is: " + myFullname.length());
    
    System.out.println(myfirstName.toUpperCase());   
    System.out.println(mylastName.toLowerCase());   
    
    System.out.println(myFullname.indexOf("shetty")); 
    
    System.out.println(myfirstName + " " + mylastName); // concatenation
    System.out.println(myfirstName.concat(mylastName)); // this works as well
    
    System.out.println("We are the so-called \"Vikings\" from the north.");
    System.out.println("We are the so-called \'Vikings\' from the north.");
    System.out.println("We are the so-called \\Vikings\\ from the north.");
    
    System.out.println(Math.max(5, 10));  // finds max
    System.out.println(Math.min(5, 10));  // finds min
    System.out.println(Math.sqrt(64));    // finds square root
    System.out.println(Math.abs(-4.7));   // turns number to positive
    System.out.println(Math.random());    // gets random number between 0.0 and 1.0
  }
}