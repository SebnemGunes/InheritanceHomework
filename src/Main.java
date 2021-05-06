import java.net.UnknownServiceException;

public class Main {
    public static void main(String[] args) {
     User user1=new Student(212,"Sebnem","Gunes");
     user1.add(); //Öğrenci ekleme
        user1.delete();

     User user2=new Instructor(213,"Engin","Demirog");
     user2.add();//Eğitmen ekleme


     UserManager userManager=new InstructorManager();
     userManager.register(new Instructor());

    UserManager studentManager=new StudentManager();
    studentManager.register(new Student());



}
}
