
public class Main {
    static int Fibonacci(int n) { //metot belirlendi
        if(n==1 || n==2){ //f(1) ve f(2) 1'e eşit.
        return 1;}
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.print(Fibonacci(6));
        }

    }
