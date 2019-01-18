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

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Create Employer Acc/Create Employer Account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Create Employer Acc/Login to Employer Account (Second time)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

try {
    Boolean Checker = false

    Checker = WebUI.verifyElementHasAttribute(findTestObject('Final Object Repo/Landing Page/BM Detecting'), 'href', 20, 
        FailureHandling.OPTIONAL)

    System.out.println(Checker)

    if (Checker == false) {
        WebUI.click(findTestObject('Final Object Repo/Landing Page/Select to English'), FailureHandling.CONTINUE_ON_FAILURE)
    } else {
    }
    
    WebUI.delay(2)
}
catch (Exception e) {
    e.printStackTrace()
} 

WebUI.delay(4)

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

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Registered As a Branch - Yes'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/Acknowledgement Ticked'))

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Email'), GlobalVariable.Email)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - OTC - Form 1/Submit Button'))

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Form 2/Add 1 Eligible - Employer Account Use'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Flow of New Registration/Third Screen - Upload Supporting Doc - Preview'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Employer Preview Name'), 
    'Tester')

WebUI.click(findTestObject('Object Repository/Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/IC Type Drop Down'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Select to NRIC'))

WebUI.setText(findTestObject('Object Repository/Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/IC Value'), 
    '133245561223')

WebUI.setText(findTestObject('Object Repository/Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Designation'), 
    'Auto')

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Submit and Screenshot/Submit Registration and Screenshot - Copy'), 
    [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.UpdateAddNewECode = WebUI.getText(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/getEmpCode'))

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Emp Code Setter'), [:], FailureHandling.STOP_ON_FAILURE)

