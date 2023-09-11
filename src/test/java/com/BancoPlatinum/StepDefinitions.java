package com.BancoPlatinum;

import static org.junit.Assert.*;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    private WebDriver driver = new ChromeDriver();

    @Given("El usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        driver.get("URL_DEL_SITIO_DE_LOGIN");
    }

    @When("Ingresa el nombre de usuario y contraseña correctos")
    public void ingresa_el_nombre_de_usuario_y_contraseña_correctos() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("usuario_correcto");
        passwordField.sendKeys("contraseña_correcta");
        loginButton.click();
    }

    @When("Ingresa un nombre de usuario y contraseña incorrectos")
    public void ingresa_un_nombre_de_usuario_y_contraseña_incorrectos() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("usuario_incorrecto");
        passwordField.sendKeys("contraseña_incorrecta");
        loginButton.click();
    }

    @When("Deja en blanco el campo de nombre de usuario y contraseña")
    public void deja_en_blanco_el_campo_de_nombre_de_usuario_y_contraseña() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.clear();
        passwordField.clear();
        loginButton.click();
    }

    @Then("Debería ver la información básica de la persona")
    public void debería_ver_la_información_básica_de_la_persona() {
        // Validar que se muestra la información correctamente
    }

    @Then("Debería ver un mensaje de error")
    public void debería_ver_un_mensaje_de_error() {
        // Validar que se muestra el mensaje de error correctamente
    }
}
