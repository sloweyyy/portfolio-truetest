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

"Step 2: Click on image featuredItems (enigma)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_featuredItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_featuredItems', ['image_featuredItems_internalAttrAlt': image_featuredItems_internalAttrAlt]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on image featuredItems enigma.png')

"Step 3: Click on image featuredItems (fiveDcoffee)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_featuredItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_featuredItems', ['image_featuredItems_internalAttrAlt': image_featuredItems_internalAttrAlt_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on image featuredItems fiveDcoffee.png')

"Step 4: Click on div sloWey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_sloWey'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on div sloWey.png')

"Step 5: Click on image featuredItems (musicify)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_featuredItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_featuredItems', ['image_featuredItems_internalAttrAlt': image_featuredItems_internalAttrAlt_2]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on image featuredItems musicify.png')

"Step 6: Click on span dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild, 'span_dynamicObject_spanNthChild_1': span_dynamicObject_spanNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on span dynamicObject object.png')

"Step 7: Click on span dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_1, 'span_dynamicObject_spanNthChild_1': span_dynamicObject_spanNthChild_1_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on span dynamicObject object2.png')

"Step 8: Click on span y"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_y'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on span y.png')

"Step 9: Click on span dynamicObject (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_2, 'span_dynamicObject_spanNthChild_1': span_dynamicObject_spanNthChild_1_2]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on span dynamicObject object3.png')

"Step 10: Click on span managed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_managed'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on span managed.png')

"Step 11: Click on span object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on span object4.png')

"Step 12: Click on span object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on span object4.png')

"Step 13: Click on span dynamicObject (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_3, 'span_dynamicObject_spanNthChild_1': span_dynamicObject_spanNthChild_1_3]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on span dynamicObject object5.png')

"Step 14: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on button object.png')

"Step 15: Click on button blog -> Navigate to page 'blog#blog'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_blog_1'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on button blog - Navigate to page blogblog.png')

"Step 16: Click on p discoverJourney -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'blog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog/p_discoverJourney'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Click on p discoverJourney - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Explore Featured Items on Portfolio Web_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}