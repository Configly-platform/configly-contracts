package com.configly.contracts.fake.event;

import com.configly.contracts.event.project.ProjectCreated;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.configly.contracts.fake.event.FakeMetadataBuilder.fakeMetadataBuilder;

public class FakeProjectCreatedBuilder {

    private EventId eventId;
    private UUID projectId;
    private String projectName;
    private String projectDescription;
    private Metadata metadata;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private long revision;

    private FakeProjectCreatedBuilder() {
        this.eventId = new EventId(UUID.randomUUID());
        this.projectId = UUID.randomUUID();
        this.projectName = UUID.randomUUID().toString();
        this.projectDescription = UUID.randomUUID().toString();
        this.metadata = fakeMetadataBuilder().build();
        this.status = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.revision = 0;
    }

    public static FakeProjectCreatedBuilder fakeProjectCreatedBuilder() {
        return new FakeProjectCreatedBuilder();
    }

    public FakeProjectCreatedBuilder withEventId(EventId eventId) {
        this.eventId = eventId;
        return this;
    }

    public FakeProjectCreatedBuilder withProjectId(UUID projectId) {
        this.projectId = projectId;
        return this;
    }

    public FakeProjectCreatedBuilder withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public FakeProjectCreatedBuilder withProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
        return this;
    }

    public FakeProjectCreatedBuilder withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public FakeProjectCreatedBuilder withStatus(String status) {
        this.status = status;
        return this;
    }

    public FakeProjectCreatedBuilder withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public FakeProjectCreatedBuilder withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public FakeProjectCreatedBuilder withRevision(long revision) {
        this.revision = revision;
        return this;
    }

    public ProjectCreated build() {
        return new ProjectCreated(
                eventId, projectId, projectName, projectDescription,
                metadata, status, createdAt, updatedAt, revision
        );
    }
}