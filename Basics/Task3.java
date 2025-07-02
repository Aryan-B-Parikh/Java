package Basics;
import java.lang.Math;

class Bank{
    double r;
    Bank(double r)
        this.r = r;
    }
}
class Branch extends Bank
{
    int n;
    int t;
    Branch(int r,int n ,int t){
        super(0.0); // Default interest rate
    }
}
class Client extends Branck{
    double p;
    double a;

    Client(double principal, int time, double rateOfInterest) {
        this.p = principal;
        this.t = time;
        this.r = rateOfInterest;
        this.n = 1;
    }

    void calculateCompoundInterest() {
        a = p * Math.pow((1 + r / n), (n * t));
        System.out.println("Compound Interest: " + (a - p));
    }
}
    
class Task3 {
    public static void main(String[] args) {
        Client client = new Client(10000, 2, 1.25);
        client.calculateCompoundInterest();
    }
}