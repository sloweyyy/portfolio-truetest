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

"Step 2: Click on image enigma"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/image_enigma'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on image enigma.png')

"Step 3: Click on image fiveDcoffee"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/image_fiveDcoffee'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on image fiveDcoffee.png')

"Step 4: Click on div sloWey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_sloWey'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on div sloWey.png')

"Step 5: Click on image musicify"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/image_musicify'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on image musicify.png')

"Step 6: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on span object.png')

"Step 7: Click on span dynamicObject (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild, 'span_dynamicObject_spanNthChild_1': span_dynamicObject_spanNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on span dynamicObject object7.png')

"Step 8: Click on span y"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_y'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on span y.png')

"Step 9: Click on span dynamicObject (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_1, 'span_dynamicObject_spanNthChild_1': span_dynamicObject_spanNthChild_1_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on span dynamicObject object8.png')

"Step 10: Click on span managed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_managed'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Click on span managed.png')

"Step 11: Click on span object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object5'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Click on span object5.png')

"Step 12: Click on span object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object5'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on span object5.png')

"Step 13: Click on span object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object6'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Click on span object6.png')

"Step 14: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 14-Click on button object.png')

"Step 15: Click on button blog3 -> Navigate to page 'blog#blog'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_blog3'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 15-Click on button blog3 - Navigate to page blogblog.png')

"Step 16: Click on p discoverJourney -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'blog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog/p_discoverJourney'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 16-Click on p discoverJourney - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Explore Portfolio Projects and Return to Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}