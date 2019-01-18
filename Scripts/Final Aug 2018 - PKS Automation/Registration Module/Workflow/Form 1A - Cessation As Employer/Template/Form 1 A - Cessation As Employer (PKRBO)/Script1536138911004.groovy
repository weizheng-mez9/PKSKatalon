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

WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Email Address'), 'johorpkrbo1@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Next Button'))

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Final Object Repo/Login Page/Internal User/Password'), 'sYLXs9ykYixgExGrleETtQ==')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Login Button'))

WebUI.delay(1)

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

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/update/form-1a-cessation-as-employer-discontinue-business-')

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employer Information/Employer Code'), 'E1102069770Z')

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Search Button'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Edit Button'))

String abc = WebUI.getAttribute(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Employer Status'), 
    'value')

System.out.println(abc)

if (abc == 'Active') {
    WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Change Employer Status to'))

    WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Change Employer Status to - Dormant'), 
        FailureHandling.STOP_ON_FAILURE)
} else if (abc == 'Cancel') {
    WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Change Employer Status to'))

    WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Change Employer Status to - Dormant'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    System.out.println('Can not change the Status from Winding up or Cancel')

    WebUI.delay(3)

    WebUI.closeBrowser()
} else if (abc == 'Dormant') {
    WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Change Employer Status to'))

    WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Change Employer Status to - Dormant'), 
        FailureHandling.STOP_ON_FAILURE)
} else if (abc == 'Winding Up') {
    WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Change Employer Status to'))

    WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Change Employer Status to - Cancel'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    System.out.println('Can not change the Status from Winding up or Cancel')

    WebUI.delay(3)

    WebUI.closeBrowser()
}

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Calender'))

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Calender - Date'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Save  Continue in Form 1A Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Employment Resign Date'))

WebUI.delay(1)

GlobalVariable.CaseReferenceNo = WebUI.getText(findTestObject('Final Object Repo/Page_Update Employer Information/Reference Number in Update Employee Information Page'))

System.out.println(GlobalVariable.CaseReferenceNo)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Reference Number Setter'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Employment Resign Date - Year'), 
    '2030', false)

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Employment Resign Date - Year - Date'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Save  Continue in Update Add Employee Resigned Date Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Set Latest - Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Add Document'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Document Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Document Type - Supporting Document For Cessation'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Uploading File'), GlobalVariable.UploadDoc)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Add Document in Uploading Page'))

WebUI.delay(15)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Save  Continue in Uploading Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Submit2'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Confirm'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Message Your Request will be routed to UO'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Letter of acknowledgement'))

