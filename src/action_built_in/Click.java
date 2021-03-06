package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click {

	/**
	 * Description: this action is used to click a webElement
	 * @param control is object
	 * @return None
	 * @author Khuong Truong
	 */
	public Click(WebDriver driver,By control)
	{
		WebElement element=driver.findElement(control);
		element.click();
	}
}
