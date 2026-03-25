# ADPH Runnable Starter Application

You now have a runnable backend starter for the ADPH eligibility flow.

## Run the API

```bash
cd adph-app/backend
mvn -pl adph-eligibility-service -am spring-boot:run
```

Service starts at: `http://localhost:8080`

## Test endpoint

```bash
curl -X POST http://localhost:8080/api/v1/eligibility/evaluate \
  -H 'Content-Type: application/json' \
  -d '{"customerId":"WM-1001","productCode":"BANK_SILVER","market":"US"}'
```

Sample response:

```json
{
  "customerId": "WM-1001",
  "productCode": "BANK_SILVER",
  "market": "US",
  "eligible": true,
  "decisionReason": "ELIGIBLE"
}
```

## Included backend modules

- `adph-common` shared primitives
- `adph-domain` request/domain model
- `adph-integration` SOAP/REST adapter placeholder
- `adph-eligibility-service` runnable Spring Boot API
- `adph-batch-jobs` Spring Batch placeholder
- `adph-scheduler` scheduler placeholder
- `adph-api-gateway` edge/gateway placeholder
- `adph-test-automation` Cucumber/TestNG placeholder
