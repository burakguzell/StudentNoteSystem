public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    Teacher courseTeacher;

    public Course(String name, String code, String prefix) {

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;

    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Öğretmen derse atandı.");
        } else {
            System.out.println(t.name + " Öğretmen bu dersi veremez !");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Öğretmeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine öğretmen atanmamıştır !");
        }
    }
}
