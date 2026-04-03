package com.configly.contracts.fake.event;

import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

public class FakeMetadataBuilder {
    private String actorId;
    private String username;
    private LocalDateTime occurredAt;
    private String correlationId;

    private FakeMetadataBuilder() {
        this.actorId = UUID.randomUUID().toString();
        this.username = UUID.randomUUID().toString();
        this.occurredAt = LocalDateTime.now();
        this.correlationId = UUID.randomUUID().toString();
    }

    public static FakeMetadataBuilder fakeMetadataBuilder() {
        return new FakeMetadataBuilder();
    }

    public FakeMetadataBuilder withActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }

    public FakeMetadataBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public FakeMetadataBuilder withOccurredAt(LocalDateTime occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }

    public FakeMetadataBuilder withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    public Metadata build() {
        return new Metadata(actorId, username, occurredAt, correlationId);
    }
}
