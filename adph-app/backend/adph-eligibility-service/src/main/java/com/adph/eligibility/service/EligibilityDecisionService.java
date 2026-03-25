package com.adph.eligibility.service;

import com.adph.domain.model.EligibilityRequest;
import com.adph.eligibility.api.EligibilityDecisionResponse;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class EligibilityDecisionService {

  private static final Set<String> SUPPORTED_MARKETS = Set.of("US", "UK", "IN");
  private static final Set<String> PREMIUM_PRODUCTS = Set.of("WM_PREMIUM", "BANK_GOLD");

  public EligibilityDecisionResponse evaluate(EligibilityRequest request) {
    if (!SUPPORTED_MARKETS.contains(request.market().toUpperCase())) {
      return new EligibilityDecisionResponse(
          request.customerId(),
          request.productCode(),
          request.market(),
          false,
          "UNSUPPORTED_MARKET");
    }

    if (PREMIUM_PRODUCTS.contains(request.productCode().toUpperCase())
        && !request.customerId().startsWith("WM")) {
      return new EligibilityDecisionResponse(
          request.customerId(),
          request.productCode(),
          request.market(),
          false,
          "PREMIUM_PRODUCT_REQUIRES_WEALTH_CUSTOMER");
    }

    return new EligibilityDecisionResponse(
        request.customerId(),
        request.productCode(),
        request.market(),
        true,
        "ELIGIBLE");
  }
}
