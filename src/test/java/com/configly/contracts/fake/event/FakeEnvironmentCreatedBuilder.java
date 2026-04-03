package com.configly.contracts.fake.event;

import com.configly.contracts.event.environment.EnvironmentCreated;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.configly.contracts.fake.event.FakeMetadataBuilder.fakeMetadataBuilder;

public class FakeEnvironmentCreatedBuilder {

    private EventId eventId;
    private UUID environmentId;
    private UUID projectId;
    private String environmentName;
    private String type;
    private String status;
    private Metadata metadata;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private long revision;

    private FakeEnvironmentCreatedBuilder() {
        this.eventId = new EventId(UUID.randomUUID());
        this.environmentId = UUID.randomUUID();
        this.projectId = UUID.randomUUID();
        this.environmentName = UUID.randomUUID().toString();
        this.type = UUID.randomUUID().toString();
        this.status = UUID.randomUUID().toString();
        this.metadata = fakeMetadataBuilder().build();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.revision = 0;
    }

    public static FakeEnvironmentCreatedBuilder fakeEnvironmentCreatedBuilder() {
        return new FakeEnvironmentCreatedBuilder();
    }

    public FakeEnvironmentCreatedBuilder withEventId(EventId eventId) {
        this.eventId = eventId;
        return this;
    }

    public FakeEnvironmentCreatedBuilder withEnvironmentId(UUID environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    public FakeEnvironmentCreatedBuilder withProjectId(UUID projectId) {
        this.projectId = projectId;
        return this;
    }

    public FakeEnvironmentCreatedBuilder withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    public FakeEnvironmentCreatedBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public FakeEnvironmentCreatedBuilder withStatus(String status) {
        this.status = status;
        return this;
    }

    public FakeEnvironmentCreatedBuilder withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public FakeEnvironmentCreatedBuilder withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public FakeEnvironmentCreatedBuilder withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public FakeEnvironmentCreatedBuilder withRevision(long revision) {
        this.revision = revision;
        return this;
    }

    public EnvironmentCreated build() {
        return new EnvironmentCreated(
                eventId,
                environmentId,
                projectId,
                environmentName,
                type,
                status,
                metadata,
                createdAt,
                updatedAt,
                revision
        );
    }
}
