class SimpleInterest {
    int p, n, r;

    public SimpleInterest() {
        p = 10;
        n = 12;
        r = 10;
    }

    public SimpleInterest(int p, int n, int r) {
        this.p = p;
        this.n = n;
        this.r = r;
    }

    public void Interest() {
        double a = (p * n * r) / 100;
        System.out.println("Simple Interest is : " + a);
    }

}

public class simple_interest {
    public static void main(String[] args) {
        SimpleInterest m;
        m = new SimpleInterest();
        m.Interest();

        SimpleInterest n;
        n = new SimpleInterest(10000,5,4);
        
        n.Interest();
    }

}
