package xyz.joemccall

import groovy.util.logging.Log4j
import org.springframework.beans.factory.InitializingBean
import org.springframework.security.oauth2.provider.token.TokenStore

/**
 * Simple delegate for illustration purposes
 */
@Log4j
class MyTokenStore implements TokenStore, InitializingBean {

    @Delegate TokenStore tokenStoreDelegate

    @Override
    void afterPropertiesSet() throws Exception {
        log.trace "MyTokenStore injected!"
    }
}
