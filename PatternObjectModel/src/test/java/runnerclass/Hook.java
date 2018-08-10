package runnerclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hook extends SeMethods {
	@Before
	public void before(Scenario sc) {
		startResult();
		startTestModule(sc.getName(),sc.getId());
		test = startTestCase("Leads");
		test.assignCategory("smoke");
		test.assignAuthor("Ram");
		startApp("chrome");

	}

	@After
	public void after() {
		closeAllBrowsers();
		endResult();
	}

}
