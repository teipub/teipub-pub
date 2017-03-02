package io.teipub

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TeipubPubApplication

fun main(args: Array<String>) {
    SpringApplication.run(TeipubPubApplication::class.java, *args)
}
