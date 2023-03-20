package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\cucumber.feature",
glue="org.step",
monochrome=true,
plugin= {"html:target\\HtmlReport",
"json:C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\CucExample\\\\target\\\\JVMReporting.json",
"junit:target\\\\jnitReport.xml"})
public class RunnerClass {
	
	@AfterClass
	public static void tc01() {
		ReportingClass.jvmReporting("C:\\Users\\DELL\\eclipse-workspace\\CucExample\\target\\JVMReporting.json");
	}

}
