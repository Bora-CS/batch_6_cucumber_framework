package inClass.Framework.task;

import inClass.Framework.resource.Dashboard_Locators;

public class Dashboard extends SetUpPage{
	
	
	
	public void clickAddExpirenceButton() {
		lib.clickElement(Dashboard_Locators.addExperienceButton);
	}
	
	public void clickAddEducation() {
		lib.clickElement(Dashboard_Locators.addEducationButton);
	}

}
