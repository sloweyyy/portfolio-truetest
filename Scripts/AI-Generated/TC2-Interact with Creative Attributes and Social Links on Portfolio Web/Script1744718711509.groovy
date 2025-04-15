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

"Step 2: Click on div creativeAttributes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_creativeAttributes'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on div creativeAttributes.png')

"Step 3: Click on button socialLinks (email)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_socialLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_socialLinks', ['button_socialLinks_internalText': button_socialLinks_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on button socialLinks email.png')

"Step 4: Click on button socialLinks (linkedIn)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_socialLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_socialLinks', ['button_socialLinks_internalText': button_socialLinks_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button socialLinks linkedIn.png')

"Step 5: Click on div socialLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_socialLinks'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on div socialLinks.png')

"Step 6: Click on button socialLinks (github) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_socialLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_socialLinks', ['button_socialLinks_internalText': button_socialLinks_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button socialLinks github - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Interact with Creative Attributes and Social Links on Portfolio Web_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}