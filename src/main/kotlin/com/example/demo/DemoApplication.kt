package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    println("1234")
    println("46")
    println("zzzz")
    println("aaaa")
    runApplication<DemoApplication>(*args)
}
