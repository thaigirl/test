package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    println("12345")
    println("12345")
    println("xiaoming")
    println("xiaoming1")
    runApplication<DemoApplication>(*args)
}
