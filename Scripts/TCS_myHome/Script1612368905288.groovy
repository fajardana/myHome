import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\Fajar\\MyHome\\id.co.myhomecredit_10112_apps.evozi.com.apk', true)

WebUI.delay(3)

Mobile.swipe(700, 600, 50, 600)

WebUI.delay(2)

Mobile.swipe(700, 600, 50, 600)

WebUI.delay(2)

Mobile.swipe(700, 600, 50, 600)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - DAFTAR'), 0)

WebUI.delay(4)

Mobile.scrollToText('Hubungi Kami')

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 2

int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

WebUI.delay(4)

Mobile.tap(findTestObject('android.widget.TextView - Setuju  Lanjutkan'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.Spinner - 4'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.CheckedTextView - 10'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.Spinner - Februari'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - Agustus'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.Spinner - 2021'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.CheckedTextView - 2012'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.TextView - No. Handphone'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('android.widget.EditText - (62)'), '(+62) 87824409394', 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.TextView - Kode PIN (6 digit)'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('android.widget.EditTextPin'), '162534', 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.TextView - Konfirmasi Kode PIN'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('android.widget.EditTextPinConfirm'), '162534', 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.Button - Lanjutkan'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.Button - LanjutkanData'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.EditTextOTP1'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('android.widget.EditTextOTP1'), '7', 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.EditTextOTP2'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('android.widget.EditTextOTP2'), '8', 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.EditTextOTP3'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('android.widget.EditTextOTP3'), '2', 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.EditTextOTP4'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('android.widget.EditTextOTP4'), '8', 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.EditTextOTP5'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('android.widget.EditTextOTP5'), '8', 0)

WebUI.delay(2)

Mobile.tap(findTestObject('android.widget.EditTextOTP6'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('android.widget.EditTextOTP6'), '2', 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Daftar'), 0)

WebUI.delay(5)

Mobile.closeApplication()

