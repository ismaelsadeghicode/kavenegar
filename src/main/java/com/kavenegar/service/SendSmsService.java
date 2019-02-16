package com.kavenegar.service;

import com.kavenegar.dto.SendSmsRequest;
import com.kavenegar.dto.SendSmsResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.IOException;

@Component
public class SendSmsService {

    public Mono<SendSmsResponse> sendSms(SendSmsRequest request) {
        WebClient client = WebClient.create("https://api.kavenegar.com/v1/694C4E7A31764D706F754C38634B72547A6750574C3569496D636E3752564735/sms/send.json");
        return client.post()
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(BodyInserters.fromObject(request))
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .onStatus(status -> status.value() != HttpStatus.OK.value(),
                        rs -> rs.bodyToMono(String.class).map(body -> new IOException(String.format(
                                "Response HTTP code is different from 200: %s, body: '%s'", rs.statusCode(), body))))
                .bodyToMono(SendSmsResponse.class);
    }
}
