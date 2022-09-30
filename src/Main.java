public class Main {

    public static void main(String[] args) {

        Course mat = new Course("Matematik","MAT01","MAT");
        Course fizik = new Course("Fizik","FZK02","FZK");
        Course kimya = new Course("Kimya","KMY03","KMY");

        Teacher t1 = new Teacher("Ahmet Hoca","555111","MAT");
        Teacher t2 = new Teacher("Mehmet Hoca","2211145","FZK");
        Teacher t3 = new Teacher("Ali Hoca","1113332","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","322",4,mat,fizik,kimya);
        s1.addBulkExamNote(100,50,80);
        s1.addBulkVerbalNote(100,80,90);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","1066",4,mat,fizik,kimya);
        s2.addBulkExamNote(50,20,30);
        s2.addBulkVerbalNote(20,20,20);
        s2.isPass();

        Student s3 = new Student("Damat Ferit","140320",4,mat,fizik,kimya);
        s3.addBulkExamNote(30,20,40);
        s3.addBulkVerbalNote(30,30,30);
        s3.isPass();
    }
}
