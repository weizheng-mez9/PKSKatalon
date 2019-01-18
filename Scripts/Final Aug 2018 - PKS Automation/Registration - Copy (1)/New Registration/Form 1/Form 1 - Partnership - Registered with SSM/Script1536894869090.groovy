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

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_login - ASSIST/Email Address'), 'johorotc1@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Registration/Page_login - ASSIST/Next Button'))

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Final Object Repo/Registration/Page_login - ASSIST/Password'), 'sYLXs9ykYixgExGrleETtQ==')

WebUI.click(findTestObject('Final Object Repo/Registration/Page_login - ASSIST/Login Button'))

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/registration')

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/AEC - No'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Business Entity'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Business Entity - Partnership'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Sub Business Entity'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Sub Business Entity - Registered with SSM'))

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Registration Number'), '123')

not_run: WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Registred with SSM - Before Feb'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Registered As a Branch - Yes'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Acknowledgement'))

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry name'), 'perkeso')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postal Address1'), 'perkeso1')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postal Address2'), 'perkeso2')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postal Address3'), 'perkeso3')

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/State'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/State - Johor'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/City'))

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postcode - 810'), 'joh')

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/City - Johor Bharu'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postcode'))

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postcode - 810'), '810')

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postcode - 81000'))

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/P.O.BOX'), '100')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Locked Bag No'), '100')

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/SOCSO Office Location'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/SOCSO Office Location - Pejabat PERKESO Negeri Johor'))

WebUI.delay(1)

WebUI.check(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Indusrty Address Same As Postal Address'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Indusry Address Same As Postal Address False'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry Address1'), 'perkeso1')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry Address2'), 'perkeso2')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry Address3'), 'perkeso3')

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry State'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry State - Johor'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry Ciry'))

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry Ciry - joh'), 'joh')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industy State - Johor Bharu'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Indusry PostCode'))

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Insutry Post Code - 810'), '810')

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Insutry Post Code - 81000'))

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry P.O.BOX'), '100')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry Locked Bag No'), '100')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Telephone No'), '123456789')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Mobile No'), '123456789')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Fax No'), '123456789')

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry Code'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Indudustry Code - Crops and Animal'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Sub Industry Code List'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Sub Industry Code List - Growing of Maize'))

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Email'), 'perkeso123@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Method of Contribution Payment'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Method of Contribution Payment - Portal'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Servide Type'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Servide Type - Professional Bodies'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry Venue'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry Venue -  PPN JOHOR'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Save  Continue'))

