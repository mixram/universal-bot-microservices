package com.mixram.telegram.microservices.antibot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AntiBotApplication

fun main(args: Array<String>) {
	runApplication<AntiBotApplication>(*args)
}
