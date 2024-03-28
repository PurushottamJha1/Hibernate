# One-to-Many Mapping with Hibernate

This Java application demonstrates a one-to-many mapping relationship using Hibernate. It includes two main entities:

## Country Entity

- Represents a country.
- Attributes: `id` and `Name`.
- Utilizes a one-to-many mapping relationship with the State entity.
- Cascade type: ALL.

## State Entity

- Represents a state.
- Attributes: `id`, `StatePIN`, `StateName`, and `country` (Country entity).
- Utilizes a many-to-one mapping relationship with the Country entity.
- Cascade type: ALL.

## Usage

1. Configure Hibernate environment and database connection.
2. Compile and run the application.

## Dependencies

- Hibernate ORM
- Jakarta Persistence API (JPA)
