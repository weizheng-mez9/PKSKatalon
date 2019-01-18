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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/login')

WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Email Address'), 'johorotc1@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Next Button'))

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Final Object Repo/Login Page/Internal User/Password'), 'sYLXs9ykYixgExGrleETtQ==')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Login Button'))

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/update/update-employer-information')

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employer Information/Employer Code'), 'E1102001065V ')

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Search Button'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Edit Button'))

WebUI.clearText(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information (Normal Flow)/Employer Name'))

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information (Normal Flow)/Employer Name'), 
    'perkeso')

WebUI.clearText(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information (Normal Flow)/Address'))

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information (Normal Flow)/Address'), 
    'address')

WebUI.clearText(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information (Normal Flow)/input_P.O. Box'))

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information (Normal Flow)/input_P.O. Box'), 
    '100')

WebUI.clearText(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information (Normal Flow)/Locked Bag No'))

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information (Normal Flow)/Locked Bag No'), 
    '100')

WebUI.clearText(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information (Normal Flow)/Email'))

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information (Normal Flow)/Email'), 'perkeso@gmail.com')

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Save  Continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information UO (Query -OTC -UO)/Add Document'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information UO (Query -OTC -UO)/Document Type'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information UO (Query -OTC -UO)/Document Type - Other'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information UO (Query -OTC -UO)/Uploading File'), 
    'C:\\Users\\yuki\\Desktop\\Test.png')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information UO (Query -OTC -UO)/Add Document in Uploading Page'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Save  Continue (1)'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Submit - Copy'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Message Your Request will be route'))

