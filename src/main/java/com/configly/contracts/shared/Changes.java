package com.configly.contracts.shared;

import java.util.List;

public record Changes(
        List<Change> changes
) {

    public static Change buildChange(String field, String before, String after) {
        return new Change(field, before, after);
    }

    public static Changes empty() {
        return new Changes(List.of());
    }

    public static Changes of(Change... changes) {
        return new Changes(List.of(changes));
    }

    public static Changes of(String field, String before, String after) {
        return new Changes(List.of(buildChange(field, before, after)));
    }

    public record Change(
            String field,
            String before,
            String after
    ) {

    }

}
