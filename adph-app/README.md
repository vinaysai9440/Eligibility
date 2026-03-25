# ADPH Application Blueprint

This repository now contains a **phase-1 project layout** for an enterprise ADPH application based on your stack:

- Java / J2EE, Spring Boot, Spring Batch, Spring Scheduler
- Hibernate / JPA, SQL (Sybase/DB2 compatible)
- REST + SOAP/XML integrations
- React UI
- JUnit, TestNG, Cucumber, Playwright, JRunner
- CI/CD, Tomcat deployment

## Proposed Monorepo Structure

```text
adph-app/
  backend/
    adph-parent/              # Maven parent + dependency management
    adph-common/              # Shared utilities, constants, error model
    adph-domain/              # Entities, repositories, domain services
    adph-eligibility-service/ # Core business APIs and orchestration
    adph-batch-jobs/          # Spring Batch jobs for ETL/reconciliation
    adph-scheduler/           # Spring Scheduler based timed workflows
    adph-integration/         # SOAP/REST clients, XML/XSLT/XPath transforms
    adph-api-gateway/         # External API façade and cross-cutting concerns
    adph-test-automation/     # Integration/E2E test harnesses
  frontend/
    adph-web/                 # React application
  devops/
    docker/                   # Container definitions
    k8s/                      # Kubernetes manifests/helm values
    ci-cd/                    # Pipeline definitions
    observability/            # Logging/metrics/tracing configs
  docs/
    architecture/             # HLD/LLD, sequence and component diagrams
    api/                      # OpenAPI contracts and examples
    adr/                      # Architecture Decision Records
  scripts/                    # Utility scripts for local/dev automation
  qa/
    performance/              # Load/performance test artifacts
    security/                 # Security test scenarios/checklists
    test-data/                # Seed datasets and synthetic fixtures
```

## Suggested Build Strategy (Next Phase)

1. Initialize backend as a Maven multi-module project.
2. Initialize frontend with React + TypeScript.
3. Define first vertical slice: `eligibility check` API + UI + persistence.
4. Add test pyramid baseline (unit, integration, API contract, UI E2E).
5. Add CI pipeline and quality gates (lint, test, coverage, SAST).

## Non-Functional Baseline

- **Design:** SOLID + layered/hexagonal boundaries
- **Quality:** TDD-first for core domain services
- **Performance:** profiling hooks (JProfiler/JProbe)
- **Security:** secure config, secrets externalization, dependency scanning
- **Observability:** structured logs, metrics, distributed tracing

---

This is intentionally a structure-only baseline so we can decide module details and implementation priorities in the next step.
