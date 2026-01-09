package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility { // to select the data from dropdown. use this method in all classes

	public void selectByVisibleText(WebElement element, String visibleText) { // eg: dropdown webelement name and value
																				// in dropdown
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
		;

	}

	public void SelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void SelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// public void dragAndDrop(WebElement element, String dragdrop) {
	// Action action = new Action(element);

}
