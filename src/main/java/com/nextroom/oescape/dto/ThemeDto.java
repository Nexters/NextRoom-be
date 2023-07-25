package com.nextroom.oescape.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

public class ThemeDto {

    @Getter
    @Builder
    @RequiredArgsConstructor
    @NoArgsConstructor(force = true)
    public static class AddThemeRequest {
        private final String title;
        private final Integer timeLimit;
    }

    @Getter
    @Builder
    public static class ThemeListResponse {
        private final Long id;
        private final String title;
        private final Integer timeLimit;
    }

    @Getter
    @RequiredArgsConstructor
    @NoArgsConstructor(force = true)
    public static class EditThemeRequest {
        private final Long id;
        private final String title;
        private final Integer timeLimit;
    }

    @Getter
    @NoArgsConstructor
    public static class RemoveThemeRequest {
        private Long id;
    }
}
