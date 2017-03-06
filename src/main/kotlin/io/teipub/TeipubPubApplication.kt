package io.teipub

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class TeipubPubApplication {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(TeipubPubApplication::class.java, *args)
        }
    }
}