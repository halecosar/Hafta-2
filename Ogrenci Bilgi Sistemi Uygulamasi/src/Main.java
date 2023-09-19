public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "555", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "444", "FZK");
        Teacher t3 = new Teacher("Külyutmaz", "458", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "101", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "01", "10", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100,60,50);
        s1.isPass();

    }

}