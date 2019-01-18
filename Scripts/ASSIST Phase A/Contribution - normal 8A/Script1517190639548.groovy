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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://assist-uat.perkeso.gov.my/')

WebUI.delay(2)

WebUI.setText(findTestObject('PKS/Contribution/Page_login - ASSIST/EmailInput'), 'klotc3@gmail.com')

WebUI.click(findTestObject('PKS/Contribution/Page_login - ASSIST/btnNext'))

WebUI.delay(2)

WebUI.setText(findTestObject('PKS/Contribution/Page_login - ASSIST/PWInput'), 'Test1@3456789')

WebUI.click(findTestObject('PKS/Contribution/Page_login - ASSIST/btnLogin'))

WebUI.delay(2)

WebUI.click(findTestObject('PKS/Contribution/Page_MyASSIST - ASSIST/MySiteDropDown'))

WebUI.click(findTestObject('PKS/Contribution/Page_MyASSIST - ASSIST/Contribution Option'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('PKS/Contribution/Page_MyASSIST - ASSIST/Employer Contribution(DropDown)'))

WebUI.click(findTestObject('PKS/Contribution/Page_MyASSIST - ASSIST/Add Contribution(OTC)'))

WebUI.delay(2)

WebUI.setText(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST/EmployerCode For Search'), 'B3202001033K')

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST/btnSearchEmployerCode'))

WebUI.delay(2)

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST/8A Selection'))

WebUI.delay(2)

WebUI.setText(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (1)/input__contributionotcaddContr'), '3')

not_run: WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (1)/label_Contribution Month'))

WebUI.sendKeys(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (1)/input__contributionotcaddContr'), Keys.chord(
        Keys.TAB, Keys.ENTER, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (1)/input__contributionotcaddContr'))

WebUI.sendKeys(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (1)/input__contributionotcaddContr'), Keys.chord(
        Keys.TAB, Keys.TAB, Keys.ENTER, Keys.ARROW_UP, Keys.ENTER))

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (3)/a_Select'))

WebUI.delay(2)

contAmount = WebUI.getText(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (4)/TxtField Cont Amount'))

WebUI.setText(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (4)/input cont amount'), contAmount)

contPpl = WebUI.getText(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (4)/TxtField Cont Ppl count'))

WebUI.setText(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (4)/input cont ppl count'), contPpl)

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (5)/btnComplete'))

WebUI.delay(2)

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (5)/btnBack'))

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (6)/Complete-Upload Selection'))

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (7)/upload form - Add Document'))

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (7)/documents drop down list'))

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (7)/8A choice'))

WebUI.uploadFile(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (7)/upload doc btn'), 'C:\\Users\\LENOVO\\Desktop\\PKS Phase A\\8A Form.txt')

WebUI.delay(3)

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (7)/save and continue'))

WebUI.delay(2)

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (8)/upload save  continue finalize'))

WebUI.delay(2)

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (8)/submit contribution'))

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (8)/span_Confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('PKS/Contribution/Page_Add Contribution(OTC) - ASSIST (8)/print acr'))

