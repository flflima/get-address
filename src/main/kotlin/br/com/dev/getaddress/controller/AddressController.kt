package br.com.dev.getaddress.controller

import br.com.dev.getaddress.dto.Address
import br.com.dev.getaddress.integration.CepClient
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import reactor.core.publisher.Mono

@Controller("/ceps")
class AddressController(private val cepClient: CepClient) {

    @Get("/")
    fun releasesWithLowLevelClient(): Mono<Address> {
        return cepClient.fetchReleases("")
    }
}