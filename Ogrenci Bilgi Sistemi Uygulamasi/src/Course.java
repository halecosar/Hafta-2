public class Course {
    //Course Sınıfı Özellikleri :
    //
    //Nitelikler : name,code,prefix,note,Teacher
    //Metotlar : Course() , addTeacher() , printTeacher()
    Teacher ogretmen;
    String isim, kod, prefix;
    int not;


    Course(String isim, String kod, String prefix) {
        this.isim = isim;
        this.kod = kod;
        this.prefix = prefix;
        this.not = not;

    }

    void addTeacher(Teacher ogretmen) {
        if(ogretmen.bolum.equals(this.prefix)){
            this.ogretmen = ogretmen;

        }
        else{
            System.out.println("Öğretmen ve Bölüm Uyuşmamktadır. ");
        }


    }

    void printTeacherInfo() {
        this.ogretmen.print();
    }

}
