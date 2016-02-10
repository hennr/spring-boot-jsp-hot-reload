# spring-boot-jsp-hot-reload
Dummy Project to demonstrate hot / live reload support with spring boot and JSPs


How?
---

This project uses the spring-boot-devtools to detect changes in the classpath.
That includes existing and new controllers and even the application.properties.

The devtools will restart the tomcat if you diff is found, if you do the following:

Configure your IDE to auto compile the project. In IntelliJ that would be:

Settings -> Build, Execution, Deployment -> Compiler -> Make project automatically

Then start the app:

    mvn spring-boot:run

If a change is detected, you will see the app restarting.


LiveReload JSPs
---------------

It's also possible to have your browser auto-refresh itself on some changes.
This works for stuff shown on the JSP (like the application.message from the application.properties)
but not with most changes done to the JSP itself, like adding an output or a tag.
 
If you want to give it a try, 
install the [firefox plugin](https://addons.mozilla.org/de/firefox/addon/livereload/] or search for (other plugins)[http://livereload.com/extensions/)



Credits
-------

This project is inspired by [spring-boot-sample-tomcat-jsp](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-tomcat-jsp)
