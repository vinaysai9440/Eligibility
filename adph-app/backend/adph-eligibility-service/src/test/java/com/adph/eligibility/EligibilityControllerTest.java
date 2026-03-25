package com.adph.eligibility;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class EligibilityControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void shouldReturnEligibleForRegularProductInSupportedMarket() throws Exception {
    mockMvc.perform(post("/api/v1/eligibility/evaluate")
            .contentType(MediaType.APPLICATION_JSON)
            .content("""
                {"customerId":"WM-1001","productCode":"BANK_SILVER","market":"US"}
                """))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.eligible").value(true))
        .andExpect(jsonPath("$.decisionReason").value("ELIGIBLE"));
  }

  @Test
  void shouldRejectPremiumForNonWealthCustomer() throws Exception {
    mockMvc.perform(post("/api/v1/eligibility/evaluate")
            .contentType(MediaType.APPLICATION_JSON)
            .content("""
                {"customerId":"CUST-2001","productCode":"WM_PREMIUM","market":"US"}
                """))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.eligible").value(false))
        .andExpect(jsonPath("$.decisionReason").value("PREMIUM_PRODUCT_REQUIRES_WEALTH_CUSTOMER"));
  }
}
