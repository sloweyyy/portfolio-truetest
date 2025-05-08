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

"Step 2: Click on button navigation (work)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_navigation', ['button_navigation_internalText': button_navigation_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on button navigation work.png')

"Step 3: Click on button navigation (about)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_navigation', ['button_navigation_internalText': button_navigation_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on button navigation about.png')

"Step 4: Click on button navigation (blog3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_navigation', ['button_navigation_internalText': button_navigation_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on button navigation blog3.png')

"Step 5: Click on button resume -> Navigate to page 'blog#blog'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_resume'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on button resume - Navigate to page blogblog.png')

"Step 6: Click on button resume -> Navigate to page 'resume#resume'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'blog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog/button_resume'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on button resume - Navigate to page resumeresume.png')

"Step 7: Click on button contactResume (contact2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resume/button_contactResume"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resume/button_contactResume', ['button_contactResume_internalText': button_contactResume_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on button contactResume contact2.png')

"Step 8: Click on div contactForm2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_contactForm2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on div contactForm2.png')

"Step 9: Click on div stickyHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_stickyHeader'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on div stickyHeader.png')

"Step 10: Click on button contactResume (resume) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resume/button_contactResume"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resume/button_contactResume', ['button_contactResume_internalText': button_contactResume_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on button contactResume resume - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Navigate Resume and Contact Form on Portfolio Web_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}