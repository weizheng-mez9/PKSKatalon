import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.helper.screenshot.WebUIScreenCaptor as WebUIScreenCaptor
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.junit.After as After
import org.openqa.selenium.By.ByCssSelector as ByCssSelector
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/login')

WebUI.delay(5)

WebUI.setText(findTestObject('Final Object Repo/PKS_SIP_Updated_RegModule/Attempt/Page_login - ASSIST/Email TextBox'), 'test@liferay.com')

WebUI.click(findTestObject('Final Object Repo/PKS_SIP_Updated_RegModule/Attempt/Page_login - ASSIST/Next Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/PKS_SIP_Updated_RegModule/Attempt/Page_login - ASSIST/Password TextBox'), 'test')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/PKS_SIP_Updated_RegModule/Attempt/Page_login - ASSIST/Login Button'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Final Object Repo/PKS_SIP_Updated_RegModule/Attempt/Page_MyASSIST - ASSIST/WorkFlow Menu'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/PKS_SIP_Updated_RegModule/Attempt/Page_MyASSIST - ASSIST/Select to Workflow Listing'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/PKS_SIP_Updated_RegModule/Attempt/Page_Workflow Listing - ASSIST/Search Information - To Put Ref No'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/PKS_SIP_Updated_RegModule/Attempt/Page_Workflow Listing - ASSIST/Ref No Set Text'), GlobalVariable.CaseReferenceNo)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/PKS_SIP_Updated_RegModule/Attempt/Page_Workflow Listing - ASSIST/Search Ref No Search Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/PKS_SIP_Updated_RegModule/Attempt/Page_Workflow Listing - ASSIST/Click Continue Tooltip'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Final Object Repo/PKS_SIP_Updated_RegModule/Attempt/Page_Workflow Listing - ASSIST/Workflow Found - Listing 1'), 
    FailureHandling.STOP_ON_FAILURE)

println(GlobalVariable.OwnerID)

OwnerID = WebUI.getText(findTestObject('Final Object Repo/PKS_SIP_Updated_RegModule/Attempt/Page_Workflow Listing - ASSIST/Workflow Found - Listing 1'), 
    FailureHandling.STOP_ON_FAILURE)

GlobalVariable.OwnerID = (OwnerID.toLowerCase() + '@gmail.com')

println(GlobalVariable.OwnerID)

WebUI.delay(2)

