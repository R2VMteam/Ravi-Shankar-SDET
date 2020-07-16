$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("wishlist.feature");
formatter.feature({
  "line": 1,
  "name": "nopcommerce",
  "description": "",
  "id": "nopcommerce",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "nopcommerce search scenario",
  "description": "",
  "id": "nopcommerce;nopcommerce-search-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of home page is nopCommerce demo store",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Wishlist link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on Wishlist page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "title of Wishlist page is nopCommerce demo store. Wishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on search input",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters search word Lenovo",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "wishlistStepDefinition.userIsAlreadyOnHomePage()"
});
formatter.result({
  "duration": 625475300,
  "error_message": "cucumber.runtime.CucumberException: class stepDefinitions.wishlistStepDefinition doesn\u0027t have an empty constructor. If you need DI, put cucumber-picocontainer on the classpath\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:45)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.getInstance(DefaultJavaObjectFactory.java:33)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\r\nCaused by: java.lang.NoSuchMethodException: stepDefinitions.wishlistStepDefinition.\u003cinit\u003e()\r\n\tat java.lang.Class.getConstructor0(Class.java:3082)\r\n\tat java.lang.Class.getConstructor(Class.java:1825)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:40)\r\n\t... 33 more\r\n",
  "status": "failed"
});
formatter.match({
  "location": "wishlistStepDefinition.titleOfHomePageIsNopCommerceDemoStore()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "wishlistStepDefinition.userClicksOnWishlistLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "wishlistStepDefinition.closeTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 15,
  "name": "nopcommerce click link scenario",
  "description": "",
  "id": "nopcommerce;nopcommerce-click-link-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "user is already on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "title of home page is nopCommerce demo store",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user clicks on Wishlist link",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user is on Wishlist page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "title of Wishlist page is nopCommerce demo store. Wishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user hovers on Computers link",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user cliks on Desktops",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user clicks on build your own computer",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user clicks on add to wishlist",
  "keyword": "Then "
});
formatter.match({
  "location": "wishlistStepDefinition.userIsAlreadyOnHomePage()"
});
formatter.result({
  "duration": 199601,
  "error_message": "cucumber.runtime.CucumberException: class stepDefinitions.wishlistStepDefinition doesn\u0027t have an empty constructor. If you need DI, put cucumber-picocontainer on the classpath\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:45)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.getInstance(DefaultJavaObjectFactory.java:33)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\r\nCaused by: java.lang.NoSuchMethodException: stepDefinitions.wishlistStepDefinition.\u003cinit\u003e()\r\n\tat java.lang.Class.getConstructor0(Class.java:3082)\r\n\tat java.lang.Class.getConstructor(Class.java:1825)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:40)\r\n\t... 33 more\r\n",
  "status": "failed"
});
formatter.match({
  "location": "wishlistStepDefinition.titleOfHomePageIsNopCommerceDemoStore()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "wishlistStepDefinition.userClicksOnWishlistLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});