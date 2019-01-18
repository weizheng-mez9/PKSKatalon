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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Add Employee Button'))

def CurrentMonth = GlobalVariable.CurrentMonth

TestObject selectMonth = new TestObject()

TestObject selectYear = new TestObject()

WebUI.delay(4)

while (WebUI.verifyElementNotVisible(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/No Duplicate Employee Cross'), 
    FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/IC Generator'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(1)

    WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/NRIC Input'), GlobalVariable.ICtoAdd)

    WebUI.delay(2)

    WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/button for search for IC'))

    WebUI.delay(1)
}

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Employee Name Input'), 'Automate002 not eligible 1')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DatePicker Pop Up'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Month'), FailureHandling.CONTINUE_ON_FAILURE)

selectMonth = WebUI.modifyObjectProperty(selectMonth, 'xpath', 'equals', ('//body/div/div/div/select/option[@value="' + 
    CurrentMonth) + '"]', true)

WebUI.click(selectMonth)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Year'))

selectYear = WebUI.modifyObjectProperty(selectYear, 'xpath', 'equals', ('//div/div/div/select/option[@value="' + GlobalVariable.EighteenYrsBefore) + 
    '"]', true)

WebUI.click(selectYear)

UpdatedSelectDate = WebUI.modifyObjectProperty(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Date'), 
    'xpath', 'equals', ('//body/div/table/tbody/tr/td/a[text()="' + GlobalVariable.OneDayBefore) + '"]', true)

WebUI.click(UpdatedSelectDate)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/EmploymentStartDate Pop Up'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment StartDate Month'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Socso Employement Startdate Month'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment StartDate Year'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Socso Employment Startdate Year'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment Start Date Day'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Save Button for Add Employee'))

WebUI.delay(10)

//add 57 yo
WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Add Employee Button'))

WebUI.delay(4)

while (WebUI.verifyElementNotVisible(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/No Duplicate Employee Cross'), 
    FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/IC Generator'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(1)

    WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/NRIC Input'), GlobalVariable.ICtoAdd)

    WebUI.delay(2)

    WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/button for search for IC'))

    WebUI.delay(1)
}

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Employee Name Input'), 'Automate002 not eligible 2')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DatePicker Pop Up'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Month'), FailureHandling.CONTINUE_ON_FAILURE)

selectMonth = WebUI.modifyObjectProperty(selectMonth, 'xpath', 'equals', ('//body/div/div/div/select/option[@value="' + 
    CurrentMonth) + '"]', true)

WebUI.click(selectMonth)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Year'))

selectYear = WebUI.modifyObjectProperty(selectYear, 'xpath', 'equals', ('//div/div/div/select/option[@value="' + GlobalVariable.FiftysevenYrsBefore) + 
    '"]', true)

WebUI.click(selectYear)

UpdatedSelectDate = WebUI.modifyObjectProperty(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Date'), 
    'xpath', 'equals', ('//body/div/table/tbody/tr/td/a[text()="' + GlobalVariable.CurrentDate) + '"]', true)

WebUI.click(UpdatedSelectDate)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/EmploymentStartDate Pop Up'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment StartDate Month'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Socso Employement Startdate Month'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment StartDate Year'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Socso Employment Startdate Year'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment Start Date Day'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Save Button for Add Employee'))

