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

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on image enigma.png')

"Step 3: Click on image fiveDcoffee"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/image_fiveDcoffee'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on image fiveDcoffee.png')

"Step 4: Click on div enigmaMobileDevelopment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_enigmaMobileDevelopment'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on div enigmaMobileDevelopment.png')

"Step 5: Click on image musicify"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/image_musicify'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on image musicify.png')

"Step 6: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on span object.png')

"Step 7: Click on span object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on span object2.png')

"Step 8: Click on span y"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_y'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on span y.png')

"Step 9: Click on span object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object3'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on span object3.png')

"Step 10: Click on span object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object4'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on span object4.png')

"Step 11: Click on span object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object5'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on span object5.png')

"Step 12: Click on span object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object5'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on span object5.png')

"Step 13: Click on span object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object6'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Click on span object6.png')

"Step 14: Click on button blog -> Navigate to page 'blog#blog'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_blog'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on button blog - Navigate to page blogblog.png')

"Step 15: Click on p discoverJourney -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'blog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog/p_discoverJourney'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on p discoverJourney - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Explore Portfolio Projects and Access Blog_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}