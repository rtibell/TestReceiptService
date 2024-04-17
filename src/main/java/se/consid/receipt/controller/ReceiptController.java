package se.consid.receipt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import se.consid.receipt.service.ReceiptService;

@RestController
public class ReceiptController {
    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private ReceiptService receiptService;

    @GetMapping("/receipt")
    public Mono<String> createReceipt() {
        return Mono.just(receiptService.produceReceipt());
    }

}
