import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Employee class'ı oluşturulup metotlar çağırıldı.
        Employee e1 = new Employee("kemal",2000,1985,45);
        e1.tax();
        e1.bonus();
        e1.raiseSalary();
        e1.printInfo();

    }
}