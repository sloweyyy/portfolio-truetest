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

"Step 2: Click on button navigation (about)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_navigation', ['button_navigation_internalText': button_navigation_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on button navigation about.png')

"Step 3: Click on button navigation (blog3) -> Navigate to page 'blog#blog'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_navigation', ['button_navigation_internalText': button_navigation_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on button navigation blog3 - Navigate to page blogblog.png')

"Step 4: Click on button resume"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'blog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog/button_resume'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on button resume.png')

"Step 5: Click on header academicJourney -> Navigate to page 'blog post#blog/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'blog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog/header_academicJourney'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on header academicJourney - Navigate to page blog postblog.png')

"Step 6: Click on image academicJourney -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'blog/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog_post/image_academicJourney'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on image academicJourney - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Navigate Blog and Academic Journey on Portfolio Web_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}