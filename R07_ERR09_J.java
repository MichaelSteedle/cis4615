/* ERR09-J. Do not allow untrusted code to terminate the JVM */

public class InterceptExit {
  public static void main(String[] args) {
    // ...
    System.exit(1);  // Abrupt exit
    System.out.println("This never executes");
  }
}   