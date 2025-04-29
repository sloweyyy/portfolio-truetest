import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
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

"Step 2: Click on div innovative"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_innovative'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on div innovative.png')

"Step 3: Click on div sloWey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_sloWey'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on div sloWey.png')

"Step 4: Click on button email2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_email2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on button email2.png')

"Step 5: Click on div sloWey2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_sloWey2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on div sloWey2.png')

"Step 6: Click on button about (about)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_about"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_about', ['button_about_internalText': button_about_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on button about about.png')

"Step 7: Click on button blog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_blog'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on button blog.png')

"Step 8: Click on button resume -> Navigate to page 'resume#resume'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_resume'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on button resume - Navigate to page resumeresume.png')

"Step 9: Click on html object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/html_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on html object - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Explore Innovative Sections and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}