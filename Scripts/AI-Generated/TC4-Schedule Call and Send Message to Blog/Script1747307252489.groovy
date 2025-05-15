import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on button scheduleCall.png')

"Step 3: Click on input name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_name2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on input name2.png')

"Step 4: Press key Tab on input name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_home/input_name2'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Press key Tab on input name2.png')

"Step 5: Press key Tab on input name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_home/input_name2'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Press key Tab on input name2.png')

"Step 6: Click on textarea message2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/textarea_message2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on textarea message2.png')

"Step 7: Click on button sendMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_sendMessage'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on button sendMessage.png')

"Step 8: Click on button sendMessage -> Navigate to page 'blog#blog'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_sendMessage'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on button sendMessage - Navigate to page blogblog.png')

"Step 9: Click on header blogTitle -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'blog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog/header_blogTitle'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on header blogTitle - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Schedule Call and Send Message to Blog_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}