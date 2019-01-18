import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Update Add New Employee/Template/New Company for Update Add New'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Form 2/Date Updater'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Email TextBox'), 'klotc2@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Next Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Password TextBox'), 'Test1@3456789')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Login Button'))

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

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/My Sites Drop Down'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select to Registration Module'))

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/myassist')

WebUI.mouseOver(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select to Update Akta 4 Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select to Update Add New Employee'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Employer Code input textbox'), GlobalVariable.UpdateAddNewECode)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Search Button for Employer Code'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Click to Edit Case'))

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Update Add New Employee/Template/Employee Adding/Employee Set Decider'), 
    [:], FailureHandling.OPTIONAL)

WebUI.delay(4)

GlobalVariable.CaseReferenceNo = WebUI.getText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/RefNo'))

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Reference Number Setter'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Incomplete Checkbox'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Save  Continue Button'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Save  Continue Third Screen'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Save   Continue Supporting Doc Page'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Submit Button'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Confirm Submit Button'))

WebUI.delay(20)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Screenshoting tool'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Workflow Owner Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Email TextBox'), GlobalVariable.OwnerID)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Next Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Password TextBox'), 'Test1@3456789')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Login Button'))

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

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Expand to Search'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/TextBox RefNo in Workbasket'), 
    GlobalVariable.CaseReferenceNo)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Click Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Click to Continue Workflow'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Save  Continue Button'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Save  Continue Third Screen'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Save   Continue Supporting Doc Page'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Submit Button'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Confirm Submit Button'))

WebUI.delay(30)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Screenshoting tool'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Workflow Owner Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Email TextBox'), GlobalVariable.OwnerID)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Next Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Password TextBox'), 'Test1@3456789')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Login Button'))

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

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Expand to Search'))

WebUI.delay(4)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/TextBox RefNo in Workbasket'), 
    GlobalVariable.CaseReferenceNo)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Click Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Click to Continue Workflow'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Continue Button in verifying case'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Save  Continue Button'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Save  Continue Third Screen'))

WebUI.delay(4)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Query Text Input'), 'Query the Case')

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Save   Continue Supporting Doc Page'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Query Button'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Confirm to Query'))

WebUI.delay(20)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Screenshoting tool'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Email Address'), 'klpkrbo2@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Next Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Password'), 'Test1@3456789')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Login Button'))

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

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Hover Over Search Drop Down'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Search Pending Case'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Searching Method (Employer Code)'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Searching Method to Reference ID'))

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Pending Case Ref NO'), GlobalVariable.CaseReferenceNo)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Search Pending Case Based on Ref No'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Action Button after found case'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Next Button in Pending Case First Page'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Next Button in Third Screen'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Add Document for Pending Case'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Upload Pending Doc - Please Select'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select to Others to Upload'))

WebUI.uploadFile(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Uploading Pending Case Action'), 
    GlobalVariable.UploadDoc)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Inner form Add Document Button Pending Case'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Pending Case Exit'))

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Workflow Owner Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Log Out/log out avoiding katalon tagging'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Email TextBox'), GlobalVariable.OwnerID)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Next Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Password TextBox'), 'Test1@3456789')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Login Button'))

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

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Expand to Search'))

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/TextBox RefNo in Workbasket'), 
    GlobalVariable.CaseReferenceNo)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Click Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Click to Continue Workflow'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/New Reg - OTC to RO/Special Case - All Related Objects/Continue Button in verifying case'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Save  Continue Button'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Save  Continue Third Screen'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Save   Continue Supporting Doc Page'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Submit Button'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Final Object Repo/Page_Update Add New Employee - ASSIST/Confirm Submit Button'))

WebUI.delay(30)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Screenshoting tool'), [:], FailureHandling.STOP_ON_FAILURE)

