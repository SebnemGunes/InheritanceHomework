public class Instructor extends User{
   private int instructorId;
   private String firstName;
   private String lastName;

   @Override
   public void add() {
   System.out.println("Eğitmen başarıyla eklendi: "+firstName+" "+lastName);
   }

   @Override
   public void delete() {
      System.out.println("Egitmen id:"+getInstructorId()+"olan "+"egitmen sistemden silindi!");
   }

   public Instructor(){}

   public Instructor(int instructorId, String firstName, String lastName) {
      this.instructorId = instructorId;
      this.firstName = firstName;
      this.lastName = lastName;
   }

   public int getInstructorId() {
      return instructorId;
   }

   public void setInstructorId(int instructorId) {
      this.instructorId = instructorId;
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
