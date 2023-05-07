package day09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBasic;

import java.util.List;
/*
public class G001 extends TestBasic {
    /*
    ...Exercise3...
   // http://the-internet.herokuapp.com/add_remove_elements/
   // click on the "Add Element" button 100 times
   // write a function that takes a number, and clicks the "Delete" button
   // given number of times, and then validates that given number of
   // buttons was deleted
   1.method : createButtons(100)
   2.deleteButtonsAndValidate()


    @Test
    public void test(){
        //      ...Exercise6...
        //  1. Amazon.com'a gidelim.
        WebDriver driver =NULL;
        driver.get("https://www.amazon.com");
        //  2. DropDown üzerinde Books secelim.(All yazan yerde)
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Books");
        //     kategorilerin hepsini konsola yazdiralim
        List<WebElement> liste=select.getOptions();
        liste.stream().forEach(t-> System.out.println (t.getText()));
        //  3. Arama kutusuna Les Miserables yazalım ve arama yapalim.
        WebElement aramaKutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("Les Miserables"+ Keys.ENTER);
        //  4. Sonuc sayisini ekrana yazdiralim.
        WebElement sonuc= driver.findElement(By.xpath("(//span[@dir='auto'])[1]"));
        System.out.println("sonuc.getText() = " + sonuc.getText());
        //  5. Sonucların Les Miserables i icerdigini assert edelim
        Assert.assertFalse(sonuc.getText().contains("Les Miserables")," sefiller icermiyor");
    }
}
*/