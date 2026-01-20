package com.e2eTest.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

/**
 * Test runner class for executing Cucumber BDD scenarios.
 *
 * <p>
 * This class is used to configure and launch Cucumber tests using JUnit as the
 * test execution framework.
 * </p>
 *
 * <p>
 * It defines:
 * <ul>
 * <li>The location of feature files</li>
 * <li>The reporting formats (HTML, JSON)</li>
 * <li>The tags used to filter scenarios</li>
 * <li>The formatting and step definition naming strategy</li>
 * </ul>
 * </p>
 *
 * <p>
 * This runner executes only scenarios tagged with {@code @Create_Ticket}.
 * </p>
 */
@RunWith(Cucumber.class)
@CucumberOptions(

		/**
		 * Path to the directory containing Cucumber feature files.
		 */
		features = { "src/spec/features" },

		/**
		 * Plugins used to generate test execution reports. - pretty : readable console
		 * output - html : HTML report generation - json : JSON report generation
		 */
		plugin = { "pretty", "html:target/report/cucumber-report.html", "json:target/report/cucumber.json" },

		/**
		 * Glue code location (step definitions). Uncomment and adjust this path if step
		 * definitions are not auto-detected.
		 */
		// glue = {"src/test/java/com/e2eTest/automation/step_definitions"},

		/**
		 * Executes only scenarios or features with the specified tag.
		 */
		tags = ("@logout"),

		/**
		 * Removes unnecessary characters from the console output, making it more
		 * readable.
		 */
		monochrome = true,

		/**
		 * Generates step definition method names in CamelCase format.
		 */
		snippets = CAMELCASE
		
		)

public class RunWebSuiteTest {

}
