package g5.mn.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value

class HelloController {

    @Value('${my.message}')
    String message

    @Autowired
    MnHelloConfig mnHelloConfig

    def index() {
        [
                "fromGrails": message,
                "fromMn": mnHelloConfig.message
        ]
    }
}
