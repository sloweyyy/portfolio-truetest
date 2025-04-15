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

"Step 2: Click on div scheduleCall"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_scheduleCall'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on div scheduleCall.png')

"Step 3: Click on button scheduleCall"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_scheduleCall'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on button scheduleCall.png')

"Step 4: Click on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_name'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on input name.png')

"Step 5: Enter input value in input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_name'), input_name)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Enter input value in input name.png')

"Step 6: Press key Tab on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_home/input_name'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Press key Tab on input name.png')

"Step 7: Press key Tab on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_home/input_name'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Press key Tab on input name.png')

"Step 8: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Enter input value in input email.png')

"Step 9: Click on textarea message"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/textarea_message'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on textarea message.png')

"Step 10: Enter input value in textarea message"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/textarea_message'), textarea_message)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Enter input value in textarea message.png')

"Step 11: Click on div sendMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_sendMessage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on div sendMessage.png')

"Step 12: Click on button sendMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_sendMessage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button sendMessage.png')

"Step 13: Click on button blog -> Navigate to page 'blog#blog'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_blog'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button blog - Navigate to page blogblog.png')

"Step 14: Click on header blogPost (academicJourney) -> Navigate to page 'blog post#blog/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'blog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_blog/header_blogPost"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_blog/header_blogPost', ['header_blogPost_internalText': header_blogPost_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on header blogPost academicJourney - Navigate to page blog postblog.png')

"Step 15: Click on button blog -> Navigate to page 'blog#blog'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'blog/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog_post/button_blog'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on button blog - Navigate to page blogblog.png')

"Step 16: Click on header blogPost (truongLeVinhPhuc) -> Navigate to page 'blog post#blog/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'blog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_blog/header_blogPost"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_blog/header_blogPost', ['header_blogPost_internalText': header_blogPost_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on header blogPost truongLeVinhPhuc - Navigate to page blog postblog.png')

"Step 17: Click on button resume -> Navigate to page 'resume#resume'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'blog/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog_post/button_resume'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on button resume - Navigate to page resumeresume.png')

"Step 18: Click on button themeToggle (switchToLightMode)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resume/button_themeToggle"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resume/button_themeToggle', ['button_themeToggle_internalLabel': button_themeToggle_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on button themeToggle switchToLightMode.png')

"Step 19: Click on button themeToggle (switchToDarkMode)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resume/button_themeToggle"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resume/button_themeToggle', ['button_themeToggle_internalLabel': button_themeToggle_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on button themeToggle switchToDarkMode.png')

"Step 20: Click on div sloWey -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_sloWey'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on div sloWey - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Schedule a Call and Navigate Through Portfolio Web Features_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}