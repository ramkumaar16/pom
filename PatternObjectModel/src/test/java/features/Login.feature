Feature: Deal with leafTaps Login 
 
	 
@smoke	
Scenario Outline: Login Positive 
    #Given Launch the browser
	Given   enter username as <userName> 
	Given  enter password as <passWord> 
	When  click the Login button    


	
	Examples: 
		|userName|passWord|
		|DemoSalesManager|crmsfa|
		|DemoCSR|crmsfa|
			
@sanity		
Scenario Outline: Login Negative 
    #Given Launch the browser
	Given   enter username as <userName> 
	Given  enter password as <passWord> 
	When  click the Login button 
	
		Examples: 
		|userName|passWord|
		|RAM|crmsfa|
		
