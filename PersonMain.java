public class PersonMain {
  public static void main(String s[]){
    PersonEncap person = new PersonEncap("Saran",22);
    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());
    person.setName("John");
    person.setAge(25);
    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());
    person.setAge(-5); // This will not change the age
  }  
}
