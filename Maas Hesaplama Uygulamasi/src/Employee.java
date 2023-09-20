public class Employee {
    //Employee class'ı içine değişkenler tanımlandı.

    String name;
    double salary, tax = 0;
    double bonus = 0;
    double raise = 0;
    int hireYear, workHours;


    //constructor metot oluşturuldu, değişkenler eşlendi.
    Employee(String name, double salary, int hireYear, int workHours) {

        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = workHours;


    }

    // vergi hesaplama metotu oluştuldu.
    void tax() {
        if (this.salary < 1000) {
            this.tax = 0;
        } else {
            this.tax = (this.salary * 0.03);
        }
    }

    //bonus hesaplama metodu oluşturuldu.
    void bonus() {
        if (this.workHours > 40) {
            double extra = this.workHours - 40;
            this.bonus = (extra * 30);
        }
    }

    //maaş artışı hesaplama metodu oluşturuldu.
    void raiseSalary() {
        if (2021 - this.hireYear < 10) {
            this.raise += salary * 0.05;

        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            this.raise += salary * 0.1;

        } else if (2021 - this.hireYear > 19) {
            this.raise += salary * 0.15;

        } else {
            System.out.print("Zam Hakedişi Buunmamaktadır.");
        }

    }

    //hesaplanan sonuçların ekrana yazdırılması metodu oluşuruldu
    void printInfo() {
        double taxBonusSalary = (this.salary + this.bonus - this.tax);
        double totalFee = (this.salary + this.raise);
        System.out.println("Çalışanın Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Maaş Artışı : " + this.raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + taxBonusSalary);
        System.out.println("Toplam Maaşı : " + totalFee);


    }
}



