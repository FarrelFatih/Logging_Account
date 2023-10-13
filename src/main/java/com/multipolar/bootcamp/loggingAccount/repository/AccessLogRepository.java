package com.multipolar.bootcamp.loggingAccount.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.multipolar.bootcamp.loggingAccount.domain.AccessLog;

public interface AccessLogRepository extends MongoRepository<AccessLog, String> {
}
