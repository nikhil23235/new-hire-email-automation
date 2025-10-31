import java.util.Scanner;

class Email {
   private String firstname;
   private String lastname;
   private String password;
   private String department;
   private String email;
   private int mailboxcapacity = 500;
   private int defaultpasswordlength = 10;
   private String alternateEmail;
   private String companySuffix = "company.com";

   // Constructor to recieve a firstname and lastname
   public Email(String firstname, String lastname) {
      this.firstname = firstname;
      this.lastname = lastname;
      System.out.println("EMAIL CREATED:" + this.firstname + " " + this.lastname);

      this.department = setdepartment();
      System.out.println("department of" + " " + this.department);

      this.password = randompassword(defaultpasswordlength);
      System.out.println("your password is:" + this.password);

      // combine and create email
      email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySuffix;
      System.out.println("your email is: " + email);
   }

   // Ask for the department
   private String setdepartment() {

      System.out.println(
            "DEPARTMENT CODES\n1.for sales\n2.for development\n3.for Accounting\n4.for none\nEnter department codes");
      Scanner sc = new Scanner(System.in);
      int dep = sc.nextInt();
      if (dep == 1) {
         return "sales";
      } else if (dep == 2) {
         return "development";
      } else if (dep == 3) {
         return "Accounting";
      } else {
         return "";
      }

   }

   // Create a random password
   private String randompassword(int length) {
      String setrandampassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#$%";
      char[] password = new char[length];
      for (int i = 0; i < length; i++) {
         int rand = (int) (Math.random() * setrandampassword.length());
         password[i] = setrandampassword.charAt(rand);

      }
      return new String(password);
   }

   public void setMailboxcapacity(int capacity) {
      this.mailboxcapacity = capacity;
   }

   public void changepassword(String password) {
      this.password = password;
   }

   public void setalternateEmail(String alteml) {
      this.alternateEmail = alteml;
   }

   public int getmailboxcapacity() {
      return mailboxcapacity;
   }

   public String getpassword() {
      return password;
   }

   public String getalternateEmail() {
      return alternateEmail;
   }

   public String showinfo() {
      return "DESPLY NAME:" + firstname + " " + lastname +
            "\n COMPANY Email:" + email +
            "\n MAILBOX CAPACITY:" + mailboxcapacity + "mb";
   }

}

public class Project1 {

   public static void main(String[] args) {
      Email em = new Email("nikhil", "mishra");
      System.out.println(em.showinfo());
   }
}
