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

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/update/update-add-supporting-document')

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add Supporting Document/Employer Code'), 'E1102001065V')

WebUI.click(findTestObject('Final Object Repo/Page_Update Add Supporting Document/Search'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Add Supporting Document/Edit'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Add Supporting Document/Add Document'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add Supporting Document/Document Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add Supporting Document/Document Type - Other'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Final Object Repo/Page_Update Add Supporting Document/Uploading File'), 'C:\\Users\\yuki\\Desktop\\Test.png')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add Supporting Document/Add Document in uploading page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add Supporting Document/Save and Continue in Uploading Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add Supporting Document/Submit'))

