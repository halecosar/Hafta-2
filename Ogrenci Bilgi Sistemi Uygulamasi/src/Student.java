public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name, stuNo, classes;
    double avarage;
    Boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int cNote1, int cNote2, int cNote3) {
        if (cNote1 >= 0 && cNote1 <= 100) {
            this.c1.not = cNote1;
        }
        if (cNote2 >= 0 && cNote2 <= 100) {
            this.c2.not = cNote2;
        }
        if (cNote3 >= 0 && cNote3 <= 100) {
            this.c3.not = cNote3;
        }

    }

    void isPass() {
        if (this.c1.not== 0 || this.c2.not == 0 || this.c3.not == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.c1.not + this.c2.not + this.c3.not) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    void printNote() {
        System.out.println(c1.isim + " Notu : " + c1.not);
        System.out.println(c2.isim + " Notu : " + c2.not);
        System.out.println(c3.isim + " Notu : " + c3.not);
    }
}
