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

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/request-ssn')

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Name'), 'perkeso')

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - DOB'))

WebUI.selectOptionByValue(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - DOB - Year'), '1995', false)

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - DOB - Year - Date'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Male'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI- Race'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Race - Melayu'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Religion'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Religion - Islam'))

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Birth Certificate'), '12345')

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Nationality'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Nationality - Afghanistan'))

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Address1'), 'PERKESO ADDRESS1')

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Address2'), 'PERKESO ADDRESS2')

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Address3'), 'PERKESO ADDRESS3')

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - State'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Current Employer State - Johor'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - City'))

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - City - JOH'), 'JOH')

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - City - Johor Bharu'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Post Code'))

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - City - JOH'), '810')

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - PostCode - 81000'))

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/P.O.BOX'), '100')

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Locked Bag No'), '100')

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Telephone No'), '123456789')

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Occupation'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Occupation - NUMERICAL AND MATERIAL R'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Sub Occupation'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Sub Occupation - Stock Clerks'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Sub Occupation List'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Sub Occupation List - Clerk raw material'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Employment Start Date'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - DOB - Year - Date'))

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Current Employer Name'), 'perkeso')

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Current Employer Address1'), 'perkeso1')

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Current Employer Address2'), 'perkeso2')

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Current Employer Address3'), 'perkeso3')

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Current Employer State'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Current Employer State - Johor 1'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Current Employer City'))

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - City - JOH'), 'joh')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - City - Johor Bharu'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - Current Employer Postcode'))

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - City - JOH'), '810')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - PostCode - 81000'))

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Name'), 'mother perkeso')

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Birth Certificate'), '12345')

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Identification Card Color'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Identification Card Color - Blue'))

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Identification No'), '123456789012')

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Race'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Race - Cina'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Religion'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Religion Kristian'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Natinality'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Natinality - Angola'))

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Address1'), 'mother address')

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Address2'), 'mother address')

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Address3'), 'mother address')

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - State'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - State - Negeri Simbilan'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - City'))

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - City - nil'), 'nil')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - City - Nilai'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - City - NILAI 1'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Postcode'))

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Postcode - 560'), '560')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Postcode - 70560 1'))

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Mother - Telephone Number'), '1234556789')

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Name'), 'Father Perkeso')

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Birth Certificate No'), '123456789')

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Identification Card Color'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Identification Card Color - Red'))

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Identification No'), '123456789012')

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Race'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Race - India'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Religion'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Religion - Buddha'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Nationality'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Nationality - Anguilla'))

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Address1'), 'father address1')

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Address2'), 'FATHER ADDRESS2')

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Address3'), 'FATHER ADDRESS3')

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - State'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - State - Kedah'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - City'))

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/AI - City - JOH'), 'ked')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/li_KUALA KEDAH'))

not_run: WebUI.doubleClick(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - City - KUALA KEDAH'))

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Postcode'))

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Postcode - 710'), '710')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Postcode - 05710'))

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Father - Telephone Number'), '123456789')

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Save  Continue'))

WebUI.delay(3)

GlobalVariable.CaseReferenceNo = WebUI.getText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Reference Number in Uploading Page'))

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Reference Number Setter'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Add Document Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Document Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Document Type - Birth Certificate'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Upload File'), GlobalVariable.UploadDoc)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Add Document'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Save  Continue in Uploading Document Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Confirm'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Message This Case will be routed to RIO'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Letter of acknowledgement'))

