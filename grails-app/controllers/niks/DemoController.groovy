package niks

class DemoController {
    static responseFormats = ['json']
    
    DemoService demoService
    
    def test() {
        def result = demoService.serviceMethod()
        
        println result
        
        respond([work: [test: "testing"]])
    }

    def demo() {
        respond([test: [test: "working"]])
    }
}
