package com.orangehrm.steps;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.orangehrm.pages.JobTitlePage;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.Constants;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobTitleSteps extends CommonMethods {

	JobTitlePage jtitle;
	List<Map<String, String>> dbresults;
	List<Map<String, String>> uiResults;
	Map<String, String> uiMap;

	public JobTitleSteps() {
		jtitle = new JobTitlePage();
	}

	@When("I click on job")
	public void i_click_on_job() {
		click(jtitle.job);
	}

	@When("I click on jobtitle")
	public void i_click_on_jobtitle() {
		click(jtitle.jobTitle);
	}

	@When("I click on addJobTitle")
	public void i_click_on_addJobTitle() {
		click(jtitle.addJobTitle);
	}

	@When("I enter job {string}, {string} and job {string}")
	public void i_enter_job_and_job(String jobTitle, String jobDescription, String specification) {
		sendText(jtitle.jobTitleField, jobTitle);
		sendText(jtitle.jobDescription, jobDescription);
		sendText(jtitle.jobSpecification, Constants.FILEPATH + specification);
	}
}