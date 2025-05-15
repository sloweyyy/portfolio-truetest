import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.NavigateBlogAndToggleTheme
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

"Step 2: Click on div scheduleCall"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_scheduleCall'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Click on div scheduleCall.png')

"Step 3: Click on button scheduleCall2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_scheduleCall2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on button scheduleCall2.png')

"Step 4: Click on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_name'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on input name.png')

"Step 5: Enter input value in input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_name'), input_name)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Enter input value in input name.png')

"Step 6: Press key Tab on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_home/input_name'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Press key Tab on input name.png')

"Step 7: Press key Tab on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_home/input_name'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Press key Tab on input name.png')

"Step 8: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Enter input value in input email.png')

"Step 9: Click on textarea message"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/textarea_message'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on textarea message.png')

"Step 10: Enter input value in textarea message"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/textarea_message'), textarea_message)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Enter input value in textarea message.png')

"Step 11: Click on div sendMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_sendMessage'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 11-Click on div sendMessage.png')

"Step 12: Click on button sendMessage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_sendMessage2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 12-Click on button sendMessage2.png')

"Step 13: Click on button blog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_blog'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 13-Click on button blog.png')

"Step 14: Access blog posts and switch between light and dark modes."

NavigateBlogAndToggleTheme.execute()

"Step 15: Click on div sloWey -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_sloWey'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 15-Click on div sloWey - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Schedule Call and Send Message with Blog Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}