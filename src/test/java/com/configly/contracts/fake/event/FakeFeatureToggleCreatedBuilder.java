package com.configly.contracts.fake.event;

import com.configly.contracts.event.featuretoggle.FeatureToggleCreated;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.configly.contracts.fake.event.FakeMetadataBuilder.fakeMetadataBuilder;

public class FakeFeatureToggleCreatedBuilder {

    private EventId eventId;
    private UUID id;
    private UUID environmentId;
    private String name;
    private String description;
    private String type;
    private String value;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Metadata metadata;
    private long revision;

    private FakeFeatureToggleCreatedBuilder() {
        this.eventId = new EventId(UUID.randomUUID());
        this.id = UUID.randomUUID();
        this.environmentId = UUID.randomUUID();
        this.name = UUID.randomUUID().toString();
        this.description = UUID.randomUUID().toString();
        this.type = UUID.randomUUID().toString();
        this.value = UUID.randomUUID().toString();
        this.status = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.metadata = fakeMetadataBuilder().build();
        this.revision = 0;
    }

    public static FakeFeatureToggleCreatedBuilder fakeFeatureToggleCreatedBuilder() {
        return new FakeFeatureToggleCreatedBuilder();
    }

    public FakeFeatureToggleCreatedBuilder withEventId(EventId eventId) {
        this.eventId = eventId;
        return this;
    }

    public FakeFeatureToggleCreatedBuilder withId(UUID id) {
        this.id = id;
        return this;
    }

    public FakeFeatureToggleCreatedBuilder withEnvironmentId(UUID environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    public FakeFeatureToggleCreatedBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public FakeFeatureToggleCreatedBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public FakeFeatureToggleCreatedBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public FakeFeatureToggleCreatedBuilder withValue(String value) {
        this.value = value;
        return this;
    }

    public FakeFeatureToggleCreatedBuilder withStatus(String status) {
        this.status = status;
        return this;
    }

    public FakeFeatureToggleCreatedBuilder withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public FakeFeatureToggleCreatedBuilder withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public FakeFeatureToggleCreatedBuilder withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public FakeFeatureToggleCreatedBuilder withRevision(long revision) {
        this.revision = revision;
        return this;
    }

    public FeatureToggleCreated build() {
        return new FeatureToggleCreated(
                eventId, id, environmentId, name, description,
                type, value, status, createdAt, updatedAt, metadata, revision
        );
    }
}