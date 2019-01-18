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

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/New Registration/Template/Special Case - OTC - Form 1'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Form 2/Add 1 Eligible'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Flow of New Registration/Third Screen - Upload Supporting Doc - Preview'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Submit and Screenshot/Submit Registration and Screenshot'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Workflow Owner Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Email TextBox'), 
    GlobalVariable.OwnerID)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Next Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Password TextBox'), 
    'Test1@3456789')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Login Button'))

WebUI.delay(2)

try {
    Boolean Checker = WebUI.verifyElementNotPresent('Final Object Repo/Landing Page/Select to English', 3)

    if (Checker == false) {
        WebUI.click(findTestObject('Final Object Repo/Landing Page/Select to English'), FailureHandling.CONTINUE_ON_FAILURE)
    }
}
catch (Exception e) {
    e.printStackTrace()
} 

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Expand to Search'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/TextBox RefNo in Workbasket'), 
    GlobalVariable.CaseReferenceNo)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Click Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Click to Continue Workflow'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Continue Button in verifying case'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Registered As a Branch - Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Form 1 Save n Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Form 2 Save n Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Third Screen Save n Continue'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Upload Doc Page Save n Continue'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Under Enforcement Button at Preview Screen of RO'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Under Enforcement - inner form'))

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Screenshoting tool'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Email TextBox'), 
    GlobalVariable.OwnerID)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Next Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Password TextBox'), 
    'Test1@3456789')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Login Button'))

WebUI.delay(2)

try {
    Boolean Checker = WebUI.verifyElementNotPresent('Final Object Repo/Landing Page/Select to English', 3)

    if (Checker == false) {
        WebUI.click(findTestObject('Final Object Repo/Landing Page/Select to English'), FailureHandling.CONTINUE_ON_FAILURE)
    }
}
catch (Exception e) {
    e.printStackTrace()
} 

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Expand to Search'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/TextBox RefNo in Workbasket'), 
    GlobalVariable.CaseReferenceNo)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Click Search'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Click to Continue Workflow'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Continue Button in verifying case'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Registered As a Branch - Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Form 1 Save n Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Form 2 Save n Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Third Screen Save n Continue'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Upload Doc Page Save n Continue'))

WebUI.delay(5)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Submit and Screenshot/Submit Registration and Screenshot'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

