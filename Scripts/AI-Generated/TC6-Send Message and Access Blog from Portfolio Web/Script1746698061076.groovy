import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.navigateBlogAndSwitchThemes
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button scheduleCall"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_scheduleCall'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on button scheduleCall.png')

"Step 3: Click on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_name'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on input name.png')

"Step 4: Press key Tab on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_home/input_name'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Press key Tab on input name.png')

"Step 5: Press key Tab on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_home/input_name'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Press key Tab on input name.png')

"Step 6: Click on textarea message"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/textarea_message'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on textarea message.png')

"Step 7: Click on button sendMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_sendMessage'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on button sendMessage.png')

"Step 8: Click on button sendMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_sendMessage'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on button sendMessage.png')

"Step 9: Access blog posts and toggle between light and dark modes"

navigateBlogAndSwitchThemes.execute()

"Step 10: Click on div userDescription -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_userDescription'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on div userDescription - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Send Message and Access Blog from Portfolio Web_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}