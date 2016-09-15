package niks

import grails.transaction.Transactional

@Transactional
class DemoService {

    def serviceMethod() {
        println "Testing"
        
        return "This is result."
    }
}
