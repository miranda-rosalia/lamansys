#### Requirements
Driver chrome v.111.0.5563.64 = https://chromedriver.storage.googleapis.com/index.html?path=111.0.5563.64/ 

Java 19.0.1


## <a name="api-exercises">TECHNICAL TEST</a>

#### Exercises
####  1) Selenium test automation task to implement:
1. Create a public repo in Github.
2. Create a Maven Java project.
3. Create a Gmail test account.
4. Implement flow #1:
   - Navigate to gmail.com page
   - Login using valid credentials
   - Verify success login by user profile icon in top right corner (please add some
     negative tests).
5. Implement flow #2:
   - Navigate to ebay.com page
   - Search for "Electric Guitar"
   - Open first result and output item price (to console).
6. Push the tests to github repository and provide a URL. Please use OOP
   approach with BaseTest Objects

#### 2) API test automation task to implement:

Test 2 APIs using Rest Assured, TestNG and Maven.


Inconveniente tecnico 


Consultas online
https://amolchavan.space/post/selenium/block-push-notification-on-chrome-in-selenium-webdriver/ 
options.addArguments("--disable-notifications"); aun aparece el elemento

https://stackoverflow.com/questions/43868009/how-to-resolve-elementnotinteractableexception-element-is-not-visible-in-seleni
n this case, the direct solution would have been to induce ExplicitWait i.e. WebDriverWait in combination with ExpectedCondition as invisibilityOfElementLocated 
El elemento no es parte del dom , por ende no se puede capturar para poder realizar invisibilityOfElementLocated

https://stackoverflow.com/questions/74925762/elementnotinteractableexception-element-not-interactable-in-selenium-java
idem consulta 2

https://stackoverflow.com/questions/69192073/how-to-verify-open-xdg-open-popup-in-chrome-via-selenium-webdriver
Use ChromeOptions 
idem consulta 1


Otras opciones de ChromeOptions que he probado :

      //  Map<String, Object> prefs = new HashMap<String, Object>();
       //prefs.put("profile.default_content_setting_values.notifications", 2);
       // prefs.put("profile.default_content_settings.notifications", 0);
        //prefs.put("profile.default_content_settings.popups", 0);
        //options.setExperimentalOption("prefs", prefs);

       // options.addArguments("disable-infobars");

        //driver.navigate().refresh().("window.confirm = function(msg) { return true; }");
        //prefs = {"protocol_handler.excluded_schemes":{"afp":True,"data":True,"disk":True,"disks":True,"file":True,"hcp":True,"intent":True, "itms-appss":True, "itms-apps":True,"itms":True,"market":True,"javascript":True,"mailto":True,"ms-help":True,"news":True,"nntp":True,"shell":True,"sip":True,"snews":False,"vbscript":True,"view-source":True,"vnd":{"ms":{"radio":True}}}}
     //   options.setExperimentalOption("protocol_handler.excluded_schemes",Boolean.TRUE);

       // options.setExperimentalOption( "protocol_handler.excluded_schemes.hcp", false).;
      //  options.addArguments("protocol_handler.excluded_schemes.hcp","false");
        //options.addArguments("--remote-allow-origins=*");
      // options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
