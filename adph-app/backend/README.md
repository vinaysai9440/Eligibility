# ADPH Backend (Runnable)

## Prerequisites
- Java 17+
- Maven 3.9+

## Start eligibility service

```bash
cd adph-app/backend
mvn -pl adph-eligibility-service -am spring-boot:run
```

## Run tests

```bash
cd adph-app/backend
mvn -pl adph-eligibility-service -am test
```

## Eligibility API contract

- **Endpoint**: `POST /api/v1/eligibility/evaluate`
- **Request**:

```json
{
  "customerId": "WM-1001",
  "productCode": "BANK_SILVER",
  "market": "US"
}
```

- **Rules implemented now**:
  - unsupported market -> not eligible
  - premium wealth products require customer IDs prefixed with `WM`
  - otherwise eligible
