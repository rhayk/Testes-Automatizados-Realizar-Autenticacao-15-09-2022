package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.HU_001_Realizar_LoginPage;

public class HU_001_Realizar_LoginSteps {

	HU_001_Realizar_LoginPage login = new HU_001_Realizar_LoginPage();

	@Dado("que o usuario faca o login no Sistema com os dados validos")
	public void queOUsuarioFacaOLoginNoSistemaComOsDadosValidos() {
		login.campoUsername.sendKeys("Admin");
		login.campoPassword.sendKeys("admin123");
		login.buttonLogin.click();
	}

	@Entao("o Sistema devera apresentar a pagina principal")
	public void oSistemaDeveraApresentarAPaginaPrincipal() {
		login.validarAutenticacao.isEnabled();

	}

	@Dado("que o usuario faca o login no Sistema com os dados invalidos")
	public void queOUsuarioFacaOLoginNoSistemaComOsDadosInvalidos() {
		login.campoUsername.sendKeys("Admin");
		login.campoPassword.sendKeys("admin12345");
		login.buttonLogin.click();
	}

	@Entao("o Sistema deverar apresentar a mensagem MS001")
	public void oSistemaDeverarApresentarAMensagemMS001() {
		login.mensagemInvalidCredentials.isEnabled();
	}

	@Dado("que o usuario faca o login no Sistema sem preencher o campo Password")
	public void queOUsuarioFacaOLoginNoSistemaSemPreencherOCampoPassword() {
		login.campoUsername.sendKeys("Admin");
		login.buttonLogin.click();
	}

	@Entao("o Sistema devera apresentar a mensagem MS002")
	public void oSistemaDeveraApresentarAMensagemMS002() {
		login.mensagemRequiredPsassword.isEnabled();
	}

	@Dado("que o usuario faca o login no Sistema sem preencher o campo Username")
	public void queOUsuarioFacaOLoginNoSistemaSemPreencherOCampoUsername() {
		login.campoPassword.sendKeys("admin123");
		login.buttonLogin.click();
	}

	@Entao("o Sistema devera apresenta a mensagem MS002")
	public void oSistemaDeveraApresentaAMensagemMS002() {
		login.mensagemRequiredUsername.isEnabled();

	}

}
