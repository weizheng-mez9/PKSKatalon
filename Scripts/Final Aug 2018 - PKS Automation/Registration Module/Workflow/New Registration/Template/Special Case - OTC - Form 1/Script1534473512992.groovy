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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/login')

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Email Address'), 'klotc2@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Next Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Password'), 'Test1@3456789')

WebUI.delay(2)

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

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/Landing Page/My Sites Drop Down'))

WebUI.click(findTestObject('Final Object Repo/Landing Page/Select to Registration Module'))

WebUI.click(findTestObject('Final Object Repo/Landing Page/Registration Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/AEC NO'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/Business Entity - Please Select'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/Selected - Corporation'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/Sub Business Entity - Please Select'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/Selected - Sendirian Berhad'))

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/Input BRN Number'), 
    'AUTOMATE001')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/BRN Search'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/Registered with SSM - After Feb 2017'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/Registering As A Branch - No'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/Acknowledgement Ticked'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/Submit Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/Confirm No Flagging as Branch'))

