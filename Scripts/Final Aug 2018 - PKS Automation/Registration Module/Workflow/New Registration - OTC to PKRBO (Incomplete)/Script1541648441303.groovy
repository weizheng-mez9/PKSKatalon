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

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Form 1/Form 1 - Corporation - BHD'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Form 2/Add 1 Eligible - Incomplete'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Flow of New Registration/Third Screen - Upload Supporting Doc - Preview'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Submit and Screenshot/Submit Registration and Screenshot'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Workflow Owner Finder'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Incomplete - PKRBO/Email TextBox'), 
    GlobalVariable.OwnerID)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Incomplete - PKRBO/Next Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Incomplete - PKRBO/Password TextBox'), 
    'Test1@3456789')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Incomplete - PKRBO/Login Button'))

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

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Expand to Search'))

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/TextBox RefNo in Workbasket'), 
    GlobalVariable.CaseReferenceNo)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Click Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Click to Continue Workflow'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Incomplete - PKRBO/Save  Continue Button'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/Save and Continue Form 2'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/New Registration - Registration Module Pages/Incomplete - PKRBO/Save  Continue Third Screen'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/New Registration - Registration Module Pages/Incomplete - PKRBO/Save   Continue Supporting Doc Page'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/New Registration - Registration Module Pages/Incomplete - PKRBO/Submit Button'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/New Registration - Registration Module Pages/Incomplete - PKRBO/Confirm Submit Button'))

WebUI.delay(30)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Screenshoting tool'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

