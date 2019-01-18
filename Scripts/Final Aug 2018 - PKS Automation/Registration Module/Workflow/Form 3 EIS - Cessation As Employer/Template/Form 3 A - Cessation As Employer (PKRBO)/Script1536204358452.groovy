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

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/eis-update/form-3-eis-cessation-as-employer')

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Employer Code'), 'E1102069769W')

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Search'))

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Edit'))

WebUI.delay(1)

String abc = WebUI.getAttribute(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Employer Status'), 
    'value')

System.out.println(abc)

if (abc == 'Active') {
    WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Change Employer Status to'))

    WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Dormant EIS'), FailureHandling.STOP_ON_FAILURE)
} else if (abc == 'Dormant SIP') {
    WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Change Employer Status to'))

    WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Change Employer Status to - Active'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Save  Continue in Form 3 EIS Page'))

    WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Error Message Not allow to change Dormant'))
}

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Calender'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Calender - Date'))

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Save  Continue in Form 3 EIS Page'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Employment Resign Date'))

WebUI.selectOptionByValue(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Employment Resign Date - Year'), 
    '2030', false)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Employment Resign Date - Year - Date'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Save  Continue in Employment Resign Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Set Latest - Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Add Document'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Document Type'))

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Document Type - Form 3'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/ploading File'), GlobalVariable.UploadDoc)

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Add Document in Uploading Page'))

WebUI.delay(2)

GlobalVariable.CaseReferenceNo = WebUI.getText(findTestObject('Final Object Repo/Page_Update Employer Information/Reference Number in Update Employee Information Page'))

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Reference Number Setter'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Save  Continue in Uploading Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Message Your Request will be routed to UO'))

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Letter of acknowledgement'))

