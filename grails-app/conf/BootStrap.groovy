import xyz.joemccall.MyTokenStore

class BootStrap {

    def grailsApplication

    def init = { servletContext ->
        assert grailsApplication.mainContext.getBean(MyTokenStore) != null, 'MyTokenStore was not injected!'
    }
    def destroy = {
    }
}
