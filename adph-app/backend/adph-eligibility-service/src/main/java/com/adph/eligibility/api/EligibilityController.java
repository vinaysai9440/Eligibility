package com.adph.eligibility.api;

import com.adph.domain.model.EligibilityRequest;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/eligibility")
public class EligibilityController {

  @PostMapping("/evaluate")
  public Map<String, Object> evaluate(@RequestBody EligibilityRequest request) {
    return Map.of(
        "customerId", request.customerId(),
        "productCode", request.productCode(),
        "market", request.market(),
        "eligible", Boolean.TRUE,
        "decisionReason", "RULES_NOT_IMPLEMENTED_YET");
  }
}
