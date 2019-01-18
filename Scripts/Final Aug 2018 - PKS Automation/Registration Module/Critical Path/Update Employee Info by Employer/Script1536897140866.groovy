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

WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Email Address'), 'johorotc1@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Next Button'))

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Final Object Repo/Login Page/Internal User/Password'), 'sYLXs9ykYixgExGrleETtQ==')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Login Button'))

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

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/update/update-employee-information-employer-')

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Employer Code'), 'E1102001065V')

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Search Employer Code'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Edit Button'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Employee Name or New Identification'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Selection - Employee Name'))

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Employee Name'), 'FFFC')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Search Employee'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Employee Edit Button'))

WebUI.delay(3)

WebUI.clearText(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Normal Flow)/Old ID'))

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Normal Flow)/Old ID'), 
    '12345678')

WebUI.clearText(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Normal Flow)/Employee Name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Normal Flow)/Employee Name'), 
    'fffc')

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Normal Flow)/Male'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Save  Continue in  Employee Information Page'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Save  Continue in Uploading Page 1'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Confirm'))

