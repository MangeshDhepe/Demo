package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="WebToCaseV2"                                
     , summary=""
     , relativeUrl=""
     , connection="WebToCase"
     )             
public class WebToCaseV2 {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@FindBy(id = "sf_last_name")
	@TextType()
	public WebElement contactName;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@FindBy(id = "sf_email")
	@TextType()
	public WebElement email;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@FindBy(id = "sf_phone")
	@TextType()
	public WebElement phone;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@FindBy(id = "sf_Priority")
	@ChoiceListType(values = { @ChoiceListValue(value = "High"), @ChoiceListValue(value = "Medium"), @ChoiceListValue(value = "Low") })
	public WebElement priority;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@FindBy(id = "sf_Subject")
	@TextType()
	public WebElement subject;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@FindBy(name = "w2lsubmit")
	@ButtonType()
	public WebElement Submitbutton;
	@LinkType()
	@FindBy(linkText = "Accounts")
	public WebElement accounts;
			
}
