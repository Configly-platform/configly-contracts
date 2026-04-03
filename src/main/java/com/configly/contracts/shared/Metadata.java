package com.configly.contracts.shared;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public record Metadata(
        String actorId,
        String username,
        LocalDateTime occurredAt,
        String correlationId
) {

    private static final ChronoUnit PRECISION = ChronoUnit.SECONDS;

    public static Metadata create(String actorId, String username, String correlationId) {
        return new Metadata(actorId, username, LocalDateTime.now().truncatedTo(PRECISION), correlationId);
    }

    public static Metadata empty() {
        return new Metadata(null, null, LocalDateTime.now().truncatedTo(PRECISION), null);
    }
}
