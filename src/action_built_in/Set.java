package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * Description: this action is used to set value into checkbox
 * @param control is object
 * @param Svalue is text will enter textbox
 * @return None
 * @author Hai Vu
 */
public class Set {
	public Set (WebDriver driver,By control,String value){
		WebElement element=driver.findElement(control);
		String checkbox_status=element.getAttribute("checked");
		  if (value!=checkbox_status)
		  {
		       element.click();
		  }	
	}
}
