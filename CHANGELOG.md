# ChangeLog

## 0.3.0 (11/26/2026)

### Added

- Local mock servers: a base URL may use plain `http` when its host is a loopback host (`127.0.0.1`, `::1` or `localhost`) that you also pass in `allowedHosts`, for example `List.of("127.0.0.1")`. Every other host still requires `https`. `AnalyticsAndReportingConfiguration.LOOPBACK_HOSTS` lists the loopback hosts.

### Changed

- `AnalyticsAndReportingConfiguration.isTrustedUrl` and the auth provider apply the same rule.
- Hosts are compared lowercased and without IPv6 brackets, so `[::1]` and `::1` match.
- A rejected base URL now says whether the scheme or the host is not trusted.

## 0.2.3 (10/28/2026)

### Dependencies

- Bumped `com.fasterxml.jackson.core:jackson-databind` from 2.22.3 to 2.22.4 to fix CVE-2026-110879 (GHSA-m8xf-2cr7-77ph), a critical `PolymorphicTypeValidator` bypass via generic type arguments that allows arbitrary class instantiation.

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