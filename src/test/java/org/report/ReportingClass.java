package org.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {

	public static void jvmReporting(String json) {

		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\CucExample\\target");

		Configuration con = new Configuration(file, "Facebook");
		con.addClassifications("Name", "Subash");
		con.addClassifications("Role", "QA");
		con.addClassifications("OS", "Windows 10 PRO");

		List<String> li = new ArrayList<String>();
		li.add(json);

		ReportBuilder builder = new ReportBuilder(li, con);
		builder.generateReports();

	}

}
