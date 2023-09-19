public class Teacher {

    String isim, telNo, bolum;

   Teacher(String isim, String telNo, String bolum) {
       this.isim=isim;
       this.telNo=telNo;
       this.bolum=bolum;

    }
    void print(){
        System.out.println("Öğretmenin Adı : " +this.isim );
        System.out.println("Öğretmenin Telefon Numarası : " + this.telNo);
        System.out.println("Öğretmenin Bölümü : " + this.bolum);
    }


}
