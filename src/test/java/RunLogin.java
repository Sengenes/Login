import org.junit.runner.RunWith;

/*import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;*/

import cucumber.junit.Cucumber;

//Es diferente el import (.api) por las versiones de las dependencias. Cambia el formato de las opciones, y probablemente algunas otras cosas. Seguir cambios.

@RunWith(Cucumber.class)
@Cucumber.Options(features={"C:/Users/angeles.sengenes/Documents/Java/WorkspaceA/Login/src/test/resources/login.feature"}, format= {"pretty","html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"})
public class RunLogin {
	
}

/*import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;*/

/*import cucumber.junit.Cucumber;
@Cucumber.Options(
format = {"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"},
features = {"C:\\Users\\angeles.sengenes\\Documents\\Java\\WorkspaceA\\MavenTemperaturas\\src\\test\\resources\\MavenTemperaturas\\test\\MavenTemperaturas.feature"}
)*/

//[ERROR] No goals have been specified for this build. You must specify a valid lifecycle phase or a goal in the format <plugin-prefix>:<goal> or <plugin-group-id>:<plugin-artifact-id>[:<plugin-version>]:<goal>. Available lifecycle phases are: validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy, pre-clean, clean, post-clean, pre-site, site, post-site, site-deploy. -> [Help 1]