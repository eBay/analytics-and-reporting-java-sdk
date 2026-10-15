# ChangeLog

## 0.2.2 (10/15/2026)

### Dependencies

- DCCOMICS-21031: Bumped transitive `com.google.guava:guava` from 33.4.0-jre to 33.7.2-jre for Error Prone and NullAway to fix CVE-2026-102554 (SNYK-JAVA-COMGOOGLEGUAVA-20825054), an allocation of resources without limits vulnerability during deserialization.

## 0.2.1 (09/25/2026)

### Dependencies

- Bumped `com.fasterxml.jackson.core:jackson-databind` from 2.22.2 to 2.22.3.


## 0.2.0 (09/14/2026)

### Breaking changes

#### Changed signatures

`AnalyticsClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getSellerStandardsProfileAsync` | `(String program, String cycle, String accessToken, RequestOptions requestOptions)` | `(String cycle, String program, String accessToken, RequestOptions requestOptions)` |