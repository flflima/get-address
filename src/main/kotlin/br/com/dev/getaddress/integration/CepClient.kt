package br.com.dev.getaddress.integration

import br.com.dev.getaddress.dto.Address
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import jakarta.inject.Singleton
import reactor.core.publisher.Mono

@Singleton
class CepClient(@param:Client("https://viacep.com.br/ws/") private val httpClient: HttpClient) {

    fun fetchReleases(cep: String): Mono<Address> {
        val req: HttpRequest<*> = HttpRequest.GET<Any>("$cep/json")
            .header("accept", "application/json")
        return Mono.from(httpClient.retrieve(req, Address::class.java))
    }
}