package br.com.dev.getaddress

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.dev.getaddress")
		.start()
}

