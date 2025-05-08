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

"Step 2: Click on header pageTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_pageTitle'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on header pageTitle.png')

"Step 3: Click on div skillDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_skillDescription'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on div skillDescription.png')

"Step 4: Click on div skillDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_skillDescription'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on div skillDescription.png')

"Step 5: Click on div skillDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_skillDescription'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on div skillDescription.png')

"Step 6: Click on button resume2 -> Navigate to page 'resume#resume'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_resume2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on button resume2 - Navigate to page resumeresume.png')

"Step 7: Click on button contact"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/button_contact'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on button contact.png')

"Step 8: Click on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/input_name'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on input name.png')

"Step 9: Click on div contactForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_contactForm'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on div contactForm.png')

"Step 10: Click on button viewPdf -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/button_viewPdf'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on button viewPdf - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-View Skills and Contact Information on Portfolio Web_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}