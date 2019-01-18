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

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/login')

WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Email Address'), 'johorotc1@gmail.com')

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

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/registration')

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/AEC - No'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Business Entity'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Business Entity - Other'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Sub Business Entity'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Sub Business Entity - Other/Sub Business Entity  - Local Authority'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Sub Business Entity List'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Sub Business Entity List - Other/Sub Business Entity List - Others - Local Authority - Sabah'))

WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Registration Number'), 
    '123')

not_run: WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Registred with SSM - Before Feb'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Registered As a Branch - Yes'))

WebUI.delay(1)

not_run: WebUI.verifyElementNotClickable(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Acknowledgement'))

WebUI.verifyElementPresent(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Acknowledgement Disabled'), 
    0)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry Name Selection'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry Name List - Other/Others - Local Authority - Sabah - MAJLIS'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Postal Address1'), 'perkeso1')

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Postal Address2'), 'perkeso2')

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Postal Address3'), 'perkeso3')

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/State'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/State - Johor'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/City'))

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Postcode - 810'), 'joh')

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/City - Johor Bharu'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Postcode'))

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Postcode - 810'), '810')

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Postcode - 81000'))

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/P.O.BOX'), '100')

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Locked Bag No'), '100')

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/SOCSO Office Location'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/SOCSO Office Location - Pejabat PERKESO Negeri Johor'))

WebUI.delay(1)

WebUI.check(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Indusrty Address Same As Postal Address'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Indusry Address Same As Postal Address False'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry Address1'), 
    'perkeso1')

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry Address2'), 
    'perkeso2')

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry Address3'), 
    'perkeso3')

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry State'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry State - Johor'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry Ciry'))

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry Ciry - joh'), 
    'joh')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industy State - Johor Bharu'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Indusry PostCode'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Insutry Post Code - 810'), 
    '810')

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Insutry Post Code - 81000'))

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry P.O.BOX'), 
    '100')

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry Locked Bag No'), 
    '100')

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Telephone No'), '123456789')

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Mobile No'), '123456789')

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Fax No'), '123456789')

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry Code'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Indudustry Code - Crops and Animal'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Sub Industry Code List'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Sub Industry Code List - Growing of Maize'))

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Email'), 'perkeso123@gmail.com')

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Method of Contribution Payment'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Method of Contribution Payment - Portal'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Servide Type'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Servide Type - Professional Bodies'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry Venue'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Industry Venue -  PPN JOHOR'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/Save  Continue'))

