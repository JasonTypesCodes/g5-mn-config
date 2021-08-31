package g5.mn.config

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("my")
class MnHelloConfig {
    String message
}
