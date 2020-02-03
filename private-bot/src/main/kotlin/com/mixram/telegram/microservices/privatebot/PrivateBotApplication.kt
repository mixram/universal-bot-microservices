package com.mixram.telegram.microservices.privatebot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrivateBotApplication

fun main(args: Array<String>) {
	runApplication<PrivateBotApplication>(*args)
}
