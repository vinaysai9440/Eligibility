# ADPH Application Blueprint (Scaffolded)

This repository now includes a concrete starter scaffold so implementation can begin immediately.

## What is now scaffolded

- Maven multi-module backend parent (`adph-parent`) with dependency and plugin management.
- Backend modules with initial `pom.xml` setup:
  - `adph-common`
  - `adph-domain`
  - `adph-integration`
  - `adph-eligibility-service`
  - `adph-batch-jobs`
  - `adph-scheduler`
  - `adph-api-gateway`
  - `adph-test-automation`
- Initial Spring Boot entry point and starter eligibility REST endpoint.
- Frontend module initialized with `package.json` placeholder scripts.
- Existing docs/devops/qa folder layout retained for next phases.

## Immediate next milestones

1. Replace placeholder decision logic with rule-engine based service layer.
2. Add persistence model (JPA entities, repositories, migrations).
3. Add integration adapters for SOAP/XML and REST dependencies.
4. Bootstrap React UI shell with route/module structure.
5. Wire CI checks for unit tests, code quality, and API contract tests.
