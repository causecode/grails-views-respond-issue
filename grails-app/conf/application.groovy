grails.plugin.springsecurity.filterChain.chainMap = [
        //Stateless chain
//        [
//                pattern: '/**',
//                filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter'
//        ],
//
//        //Traditional, stateful chain
//        [
//                pattern: '/stateful/**',
//                filters: 'JOINED_FILTERS,-restTokenValidationFilter,-restExceptionTranslationFilter'
//        ]
]
grails.plugin.springsecurity.rest.login.active = false