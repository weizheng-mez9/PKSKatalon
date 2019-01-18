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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/login')

WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Email Address'), 'johorotc1@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Next Button'))

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Final Object Repo/Login Page/Internal User/Password'), 'sYLXs9ykYixgExGrleETtQ==')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Login Button'))

TestObject tester = findTestObject('Final Object Repo/Landing Page/Select to English')

try {
    Boolean Checker = WebUI.verifyElementNotPresent(tester, 3)

    if (Checker == false) {
        WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select to English'), FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    WebUI.delay(2)
}
catch (Exception e) {
    e.printStackTrace()
} 

WebUI.delay(5)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/update/update-employee-information-employee-')

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/Type of Identification'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/Type of Identification - New Identification'))

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/New Identification'), '600412607694')

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/Search Button'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/Edit Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/Employee Information Edit Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/New Identification Number'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/New Identification Number'), 
    '')

Random rnd = new Random()

int snum = rnd.nextInt(899999 + 1) + 100000

int tnum = rnd.nextInt(899999 + 1) + 100000

String IC = Integer.toString(snum) + Integer.toString(tnum)

System.out.println(IC)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/New Identification Number'), 
    IC)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/Save'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/Save  Continue in Update Employee Information'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/Save  Continue in Uploading Page'))

WebUI.delay(2)

GlobalVariable.CaseReferenceNo = WebUI.getText(findTestObject('Final Object Repo/Page_Update Employer Information/Reference Number in Update Employee Information Page'))

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Reference Number Setter'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/Confirm Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employee/Successful Message Routed to UO'))

