package com.mixram.telegram.microservices.contentanalysismodule

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ContentAnalysisModuleApplication

fun main(args: Array<String>) {
	runApplication<ContentAnalysisModuleApplication>(*args)
}
