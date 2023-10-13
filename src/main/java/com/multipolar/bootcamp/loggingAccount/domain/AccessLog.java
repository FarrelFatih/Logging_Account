package com.multipolar.bootcamp.loggingAccount.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "access_logs_accounts")
@ToString
@EqualsAndHashCode
public class AccessLog implements Serializable {
    @Id
    private String id;
    private String httpMethod;
    private String requestUri;
    private Integer responseStatusCode;
    private String content;
    private String clientIP;
    private String userAgent;
    private LocalDateTime timeStamp = LocalDateTime.now();
}
