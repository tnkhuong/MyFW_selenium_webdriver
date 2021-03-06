package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Enter {
	/**
	 * Description: this action is used to enter value into textbox
	 * @param control is object
	 * @param Svalue is text will enter textbox
	 * @return None
	 * @author Khuong Truong
	 */
	public Enter(WebDriver driver,By control,String value)
	{
		driver.findElement(control).clear();
		driver.findElement(control).sendKeys(value);
	}
	
	public Enter(WebDriver driver,By control,Keys keyboard)
	{
		driver.findElement(control).sendKeys(keyboard);
	}	
}
