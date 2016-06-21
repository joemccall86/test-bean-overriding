# Bean Overriding Weird Behavior
By default the project will fail to run, due to the assertion in BootStrap.groovy. In order to make the project run, change the word `tokenStore` in `resources.groovy` to `myTokenStore` and observe that the bean is injected.

Tested on grails 2.5.4.
