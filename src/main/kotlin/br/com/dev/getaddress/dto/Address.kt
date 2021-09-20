package br.com.dev.getaddress.dto

import io.micronaut.core.annotation.Introspected

@Introspected
data class Address(
    val cep: String,
    val logradouro: String,
    val complemento: String,
    val bairro: String,
    val localidade: String,
    val uf: String
)
