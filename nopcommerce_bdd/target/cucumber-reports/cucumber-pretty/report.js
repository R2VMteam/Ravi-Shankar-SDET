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
  "name": "user opens browser",
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
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "WishlistSteps.userOpensBrowser()"
});
formatter.result({
  "duration": 18121288100,
  "status": "passed"
});
formatter.match({
  "location": "WishlistSteps.titleOfHomePageIsNopCommerceDemoStore()"
});
formatter.result({
  "duration": 76045100,
  "status": "passed"
});
formatter.match({
  "location": "WishlistSteps.userClicksOnWishlistLink()"
});
formatter.result({
  "duration": 2165752900,
  "status": "passed"
});
formatter.match({
  "location": "WishlistSteps.closeTheBrowser()"
});
formatter.result({
  "duration": 1532240000,
  "status": "passed"
});
});