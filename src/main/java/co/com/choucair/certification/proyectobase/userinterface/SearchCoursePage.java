package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BOTTON_UNIVERSIDAD = Target.the("Seleccione la universidad Choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target SIN_PERMISOS = Target.the("No tiene permisos para ingresar universidad Choucair").located(By.xpath("//div[@class='box py-3 errorbox alert alert-danger']//p[@class='errorcode']/a"));
    public static final Target INPUT_CURSE = Target.the("boton busqueda").located(By.xpath("//input[@id='id_q_60b71164eb48c']"));
    public static final Target NAME_CURSE_ERROR = Target.the("extrae el nombre del error").located(By.xpath("//div[@class='mw-content-ltr']//i"));







}
