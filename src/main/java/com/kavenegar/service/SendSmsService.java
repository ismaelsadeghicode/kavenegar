package com.kavenegar.service;

import com.kavenegar.dto.SendSmsRequest;
import com.kavenegar.dto.SendSmsResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SendSmsService {

    public SendSmsResponse sendSms(SendSmsRequest request) {
        WebClient client = WebClient.create("https://api.kavenegar.com/v1/613472435563797A3767733D/sms/send.json");
        client.post()
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(BodyInserters.fromObject(request))
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(SendSmsResponse.class);
        return (SendSmsResponse) client.get();
    }
}
