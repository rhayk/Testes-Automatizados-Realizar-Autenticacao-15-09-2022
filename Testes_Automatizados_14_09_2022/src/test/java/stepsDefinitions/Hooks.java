package stepsDefinitions;

import static utils.Utils.acessarSistema;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

	@Before
	public void entrar() {
		acessarSistema();
	}

	@After
	public void sair() {
	//	 driver.quit();
	}
}