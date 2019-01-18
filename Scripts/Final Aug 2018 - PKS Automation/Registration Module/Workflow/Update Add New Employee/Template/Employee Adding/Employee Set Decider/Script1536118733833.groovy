import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.Clipboard as Clipboard
import java.awt.datatransfer.DataFlavor as DataFlavor

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Add Employee Button'))

WebUI.delay(3)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/NRIC Input'), '010903091920')

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/button for search for IC'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Employee Name Input'), Keys.chord(
        Keys.LEFT_CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Employee Name Input'), Keys.chord(
        Keys.LEFT_CONTROL, 'c'))

Toolkit toolkit = Toolkit.getDefaultToolkit()

Clipboard clipboard = toolkit.getSystemClipboard()

String CurrentName = ((clipboard.getData(DataFlavor.stringFlavor)) as String)

System.out.println('String from Clipboard:' + CurrentName)

if (CurrentName == 'AUTOMATE002 ELIGIBLE 1') {
    WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Update Add New Employee/Template/Employee Adding/Employee Adding Action Repeat IC - set 1'), 
        [:])
} else if (CurrentName == 'AUTOMATE003 ELIGIBLE 1') {
    WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Update Add New Employee/Template/Employee Adding/Employee Adding Action Repeat IC - set 2'), 
        [:])
}

