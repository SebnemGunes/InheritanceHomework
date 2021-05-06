public class Student extends User {
    int studentId;
    String firstName;
    String lastName;

    @Override
    public void add() {
        System.out.println("Öğrenci eklendi: "+getFirstName()+" "+getLastName());
    }

    @Override
    public void delete() {
        System.out.println("Student id: "+getStudentId()+" olan "+"ogrenci sistemden silindi ");
    }

    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(){ }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
