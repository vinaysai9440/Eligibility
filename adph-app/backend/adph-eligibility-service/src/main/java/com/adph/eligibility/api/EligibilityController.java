package com.adph.eligibility.api;

import com.adph.domain.model.EligibilityRequest;
import com.adph.eligibility.service.EligibilityDecisionService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/eligibility")
public class EligibilityController {

  private final EligibilityDecisionService decisionService;

  public EligibilityController(EligibilityDecisionService decisionService) {
    this.decisionService = decisionService;
  }

  @PostMapping("/evaluate")
  public EligibilityDecisionResponse evaluate(@Valid @RequestBody EligibilityRequest request) {
    return decisionService.evaluate(request);
  }
}
