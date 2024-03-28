# One-to-One Mapping with Hibernate

This Java application demonstrates a one-to-one mapping relationship using Hibernate. It includes two main entities:

## Country Entity

- Represents a country.
- Attributes: `id`, `name`, `PrimeMinisteremail`, and `pm` (PrimeMinister entity).
- Utilizes a one-to-one mapping relationship with the PrimeMinister entity.
- Cascade type: ALL.

## PrimeMinister Entity

- Represents a prime minister.
- Attributes: `id` and `PrimeMinister`.
- Utilizes a one-to-one mapping relationship with the Country entity, mappedBy "pm".
- Cascade type: ALL.

## Usage

1. Configure Hibernate environment and database connection.
2. Compile and run the application.

## Dependencies

- Hibernate ORM
- Jakarta Persistence API (JPA)
