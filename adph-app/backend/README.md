# ADPH Backend Scaffold

## Build entry point

Run all backend modules from parent:

```bash
cd adph-parent
mvn clean test
```

## Implemented starter modules

- `adph-common`: shared record(s) and cross-cutting primitives.
- `adph-domain`: starter domain model for eligibility request.
- `adph-integration`: placeholder for SOAP/REST/XML integration adapters.
- `adph-eligibility-service`: Spring Boot API with `/api/v1/eligibility/evaluate` endpoint.

Remaining modules are scaffolded and ready for incremental implementation.
