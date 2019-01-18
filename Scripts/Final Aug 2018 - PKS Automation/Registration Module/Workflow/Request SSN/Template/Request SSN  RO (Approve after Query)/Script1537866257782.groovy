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

WebUI.delay(5)

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/search/search-pending-case-for-add-supporting-document')

WebUI.click(findTestObject('Final Object Repo/Page_Search Pending Case For Add Suporting Document/Search By'))

WebUI.click(findTestObject('Final Object Repo/Page_Search Pending Case For Add Suporting Document/Search By - Reference ID'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Search Pending Case For Add Suporting Document/Reference ID'), GlobalVariable.CaseReferenceNo)

WebUI.click(findTestObject('Final Object Repo/Page_Search Pending Case For Add Suporting Document/Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Search Pending Case For Add Suporting Document/Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Page_Request SSN - ASSIST - RO/Page_Request SSN - ASSIST (Query -OTC -RO)/Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Add Document Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Document Type'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Document Type - Birth Certificate'))

WebUI.sendKeys(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Upload File'), GlobalVariable.UploadDoc)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Add Document'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Page_Request SSN - ASSIST - RO/Page_Request SSN - ASSIST (Query -OTC -RO)/Exit'))

WebUI.delay(2)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Login and Search Case For Workflow'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Request SSN/Template/Request SSN - RO (Approve)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

