public class reverse_No {
    public static void main(String[] args) {
        int n = 123456, temp = n, r, sum = 0;
        while (n != 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        System.out.println("Reverse No...:" + sum);
    }
}