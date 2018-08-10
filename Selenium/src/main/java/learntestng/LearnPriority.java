package learntestng;
import org.testng.annotations.Test;

public class LearnPriority {
  //@Test(priority=1)
  @Test(expectedExceptions=NullPointerException.class,dependsOnMethods = "learntestng.LearnPriority.editLead",priority=1,alwaysRun= true)
  public void createLead() {
	  
	  System.out.println("i am createLead");
	  
  }
  @Test()
 // @Test()
public void editLead () {
	  
	  System.out.println("i am editLead");
	 	  
  }
  //@Test()
  @Test(dependsOnMethods = "learntestng.LearnPriority.createLead",priority=1)
public void mergeLead () {
	  
	  System.out.println("i am mergeLead");
	  
}
}
