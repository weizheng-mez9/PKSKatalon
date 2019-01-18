import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/login')

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Form 2/Date Updater'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Email TextBox'), 'klotc2@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Next Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Password TextBox'), 'Test1@3456789')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Login Button'))

try {
    Boolean Checker = WebUI.verifyElementNotPresent('Final Object Repo/Landing Page/Select to English', 3)

    if (Checker == false) {
        WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select to English'), FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    WebUI.delay(2)
}
catch (Exception e) {
    e.printStackTrace()
} 

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/My Sites Drop Down'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select to Registration Module'))

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/myassist')

WebUI.mouseOver(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select to Update Akta 4 Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select to Update Add New Employee'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Employer Code input textbox'), 'E1102069801V')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Search Button for Employer Code'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Click to Edit Case'))

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Update Add New Employee/Template/Employee Adding/Employee Adding Action No Repeat IC - No Eligible Only'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

GlobalVariable.CaseReferenceNo = WebUI.getText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/RefNo'))

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Reference Number Setter'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Save  Continue Button'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Save   Continue Supporting Doc Page'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Submit Button'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Confirm Submit Button'))

WebUI.delay(30)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Screenshoting tool'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

