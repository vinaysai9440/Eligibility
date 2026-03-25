# Initial Module Plan

## Backend Module Responsibilities

- **adph-common**
  - shared DTO primitives, exception hierarchy, utility libs
- **adph-domain**
  - JPA entities, repository interfaces, domain services
- **adph-eligibility-service**
  - REST controllers, eligibility rule orchestration, validation layer
- **adph-batch-jobs**
  - bulk ingestion, reconciliation, archival/reporting jobs
- **adph-scheduler**
  - timed triggers, cron definitions, retry scheduling
- **adph-integration**
  - SOAP clients, REST adapters, XML/XSLT transformation services
- **adph-api-gateway**
  - edge-level authn/authz hooks, throttling, request normalization
- **adph-test-automation**
  - Cucumber suites, contract tests, end-to-end test bootstrap

## Frontend

- **adph-web**
  - React app shell
  - feature modules: eligibility intake, result dashboard, audit trail
  - Playwright E2E tests in later phase

## Data & Integration Considerations

- ORM/Hibernate mappings should remain inside domain boundaries.
- XML/XPath/XSLT handlers isolated in integration module.
- REST-first internal APIs, SOAP where external systems require it.

## AI-Assisted Development Workflow (Optional)

- Copilot-assisted scaffolding for repetitive code.
- Enforce review checklist for AI-generated code quality and security.
