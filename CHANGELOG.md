# ChangeLog

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