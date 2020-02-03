package com.mixram.telegram.microservices.groupbot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GroupBotApplication

fun main(args: Array<String>) {
	runApplication<GroupBotApplication>(*args)
}
