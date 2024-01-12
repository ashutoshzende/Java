public class palindrome {
    public static void main(String[] args) {
        int n = 44544, temp = n, r, sum = 0;
        while (n != 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("Yes...");

        } else {
            System.out.println("No...");
        }
    }

}
