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

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/update/update-employer-information')

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employer Information/Employer Code'), 'E1102001065V ')

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Search Button'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Edit Button'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Business Entity'))

def CurrentBusinessEntity = ''

CurrentBusinessEntity = WebUI.getText(findTestObject('Final Object Repo/Page_Update Employer Information/Current Business Entity'))

System.out.println(CurrentBusinessEntity)

if (CurrentBusinessEntity == 'Corporation') {
    def obj = WebUI.modifyObjectProperty(findTestObject('Final Object Repo/Page_Update Employer Information/change to this Business Entity'), 
        'xpath', 'equals', '//ul/li/span[contains(text(),"Partnership")]', true, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(obj)

    WebUI.delay(1)

    WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Sub Business Entity'))

    WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Sub Business Entity - Partnership - Registered With other Agencies'))

    WebUI.delay(3)
} else if (CurrentBusinessEntity == 'Partnership') {
    def obj = WebUI.modifyObjectProperty(findTestObject('Final Object Repo/Page_Update Employer Information/change to this Business Entity'), 
        'xpath', 'equals', '//ul/li/span[contains(text(),"Sole Proprietor / Individual Business")]', true, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(obj)

    WebUI.delay(1)

    WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Sub Business Entity'))

    WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Sub Business Entity - Sole Properietor - Registered with other Agencies'))

    WebUI.delay(3)
} else if (CurrentBusinessEntity == 'Sole Proprietor / Individual Business') {
    def obj = WebUI.modifyObjectProperty(findTestObject('Final Object Repo/Page_Update Employer Information/change to this Business Entity'), 
        'xpath', 'equals', '//ul/li/span[contains(text(),"Others")]', true, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(obj)

    WebUI.delay(1)

    WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Sub Business Entity'))

    WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Sub Business Entity List - Others - Federal Government Agency'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Sub Business Entity List'))

    WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Sub Business Entity - Others - Federal Government Agency - Kementerian'))

    WebUI.delay(3)
} else if (CurrentBusinessEntity == 'Others') {
    def obj = WebUI.modifyObjectProperty(findTestObject('Final Object Repo/Page_Update Employer Information/change to this Business Entity'), 
        'xpath', 'equals', '//ul/li/span[contains(text(),"Partnership")]', true, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(obj)

    WebUI.delay(1)

    WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Sub Business Entity'))

    WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Sub Business Entity - Partnership - Registered With other Agencies'))

    WebUI.delay(3)
}

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Save  Continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Save  Continue (1)'))

WebUI.delay(4)

GlobalVariable.CaseReferenceNo = WebUI.getText(findTestObject('Final Object Repo/Page_Update Employer Information/Reference Number in Update Employee Information Page'))

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Reference Number Setter'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Submit - Copy'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Message Your Request will be route'))

