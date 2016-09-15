package niks

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoController)
@Mock([DemoService])
class DemoControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test test action"() {
        when:
        controller.test()
        
        then:
        response.json.result == "This is result."
    }
}
