package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BOTTON_CURSO_Y_SERTIFICACION = Target.the("Seleccionamos cursos y sertificaciones").located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target NAME_CURSE = Target.the("Seleccionamos el curso Workshop de Automatización").located(By.xpath("//div[@class='course-title']//h4[contains(text(),'Workshop de Automatización')]"));
    public static final Target NOMBRE_CURSO_ESCOGIDO = Target.the("extrae el nombre del curso escogido").located(By.xpath("//div[@class='info']//h3[@class='coursename']//a[contains(text(),'Workshop de Automatización')]"));







}
