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

"Step 2: Click on header homeTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_homeTitle'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Click on header homeTitle.png')

"Step 3: Click on button resume -> Navigate to page 'resume#resume'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_resume'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Click on button resume - Navigate to page resumeresume.png')

"Step 4: Click on button contact (contact2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resume/button_contact"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resume/button_contact', ['button_contact_internalText': button_contact_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on button contact contact2.png')

"Step 5: Click on input resumeName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/input_resumeName'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Click on input resumeName.png')

"Step 6: Click on input resumeEmail -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/input_resumeEmail'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on input resumeEmail - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Contact Form Submission with Resume Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}