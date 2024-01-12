// 5
// 5 * 4 * 3 * 2 * 1
class Factorial {
  public static void main(String[] args) {
    int num = 5, ans = 1;
    for(int i=num;i>1;i--) {
      ans = ans * i;
      // ans = 1 * 5 = 5
      // ans = 5 * 4 = 20
      // ans = 20 * 3 = 60
      // and = 60 * 2 = 120 
    }
    System.out.println("Factorial of " + num + " is: " + ans);
  }
}
