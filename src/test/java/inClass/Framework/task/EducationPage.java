package inClass.Framework.task;

import inClass.Framework.resource.EducationPage_Locators;

public class EducationPage extends SetUpPage {

	public void addEducation() {
		lib.fillTextBox(EducationPage_Locators.schoolName, BoraTech_TestData.education_schoolname);

		lib.fillTextBox(EducationPage_Locators.degree, BoraTech_TestData.education_degreeOrCertificate);

		lib.fillTextBox(EducationPage_Locators.fieldOfStudy, BoraTech_TestData.education_fieldOfStudy);

		lib.fillTextBox(EducationPage_Locators.fromDate, BoraTech_TestData.education_fromDate);

		lib.fillTextBox(EducationPage_Locators.toDate, BoraTech_TestData.education_toDate);

		lib.fillTextBox(EducationPage_Locators.description, BoraTech_TestData.education_programDescription);

		lib.clickElement(EducationPage_Locators.submitButton);
	}

}
