package com.adph.domain.model;

import jakarta.validation.constraints.NotBlank;

public record EligibilityRequest(
    @NotBlank(message = "customerId is required") String customerId,
    @NotBlank(message = "productCode is required") String productCode,
    @NotBlank(message = "market is required") String market) {
}
