import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserDetails {

   private String firstName;

   private String lastName;

   // NotBlank
   // Email
   private String email;

   private boolean allowsMarketing;

   private String password;

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

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public boolean isAllowsMarketing() {
      return allowsMarketing;
   }

   public void setAllowsMarketing(boolean allowsMarketing) {
      this.allowsMarketing = allowsMarketing;
   }

}