package com.adph.eligibility.api;

public record EligibilityDecisionResponse(
    String customerId,
    String productCode,
    String market,
    boolean eligible,
    String decisionReason) {
}
