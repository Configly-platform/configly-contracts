package com.configly.contracts.shared;

import java.util.UUID;

public record EventId(
        UUID id
) {

    public static EventId of(UUID id) {
        return new EventId(id);
    }

    public static EventId create() {
        return new EventId(UUID.randomUUID());
    }

    @Override
    public String toString() {
        return id.toString();
    }
}
