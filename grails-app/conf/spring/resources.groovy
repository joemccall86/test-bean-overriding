import xyz.joemccall.MyTokenStore

// Place your Spring DSL code here
beans = {
    // this *should* be injected, but the afterPropertiesSet method never gets called
    // If renamed, this bean gets injected
    tokenStore(MyTokenStore) {
        tokenStoreDelegate = ref('gormTokenStoreService')
    }
}
