public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya) {

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if ((mat >= 0) && (mat <= 100)) {
            this.mat.note = mat;
        }
        if ((fizik >= 0) && (fizik <= 100)) {
            this.fizik.note = fizik;
        }
        if ((kimya >= 0) && (kimya <= 100)) {
            this.kimya.note = kimya;
        }
    }

    public void addBulkVerbalNote(int verbMat, int verbFizik, int verbKimya) {
        if ((verbMat >= 0) && (verbMat <= 100)) {
            this.mat.verbalNote = verbMat;
        }
        if ((verbFizik >= 0) && (verbFizik <= 100)) {
            this.fizik.verbalNote = verbFizik;
        }
        if ((verbKimya >= 0) && (verbKimya <= 100)) {
            this.kimya.verbalNote = verbKimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
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

        double matAvarage = (this.mat.note * 0.80 + this.mat.verbalNote * 0.20);
        double fizikAvarage = (this.fizik.note * 0.80 + this.fizik.verbalNote * 0.20);
        double kimyaAvarage = (this.kimya.note * 0.80 + this.kimya.verbalNote * 0.20);

        this.avarage = (matAvarage + fizikAvarage + kimyaAvarage) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("--------------");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik , Sınav notu : " + this.mat.note + " , Sözel notu : " + this.mat.verbalNote);
        System.out.println("Fizik     , sınav notu : " + this.fizik.note + " , Sözel notu : " + this.fizik.verbalNote);
        System.out.println("Kimya     , sınav notu : " + this.kimya.note + " , Sözel notu : " + this.kimya.verbalNote);
    }
}
