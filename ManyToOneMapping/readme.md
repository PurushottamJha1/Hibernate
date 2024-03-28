# Many-to-One Mapping with Hibernate

This Java application demonstrates a many-to-one mapping relationship using Hibernate. It includes two main entities:

## Person Entity

- Represents a person.
- Attributes: `id`, `fname`, `lname`, and `email`.
- Utilizes a one-to-many mapping relationship with the CodingPlatform entity.
- Cascade type: ALL.

## CodingPlatform Entity

- Represents a coding platform office.
- Attributes: `id`, `WebsiteName`, `locality`, `city`, `state`, `pinCode`, and `person` (Person entity).
- Utilizes a many-to-one mapping relationship with the Person entity.
- Cascade type: ALL.

## Usage

1. Configure Hibernate environment and database connection.
2. Compile and run the application.

## Dependencies

- Hibernate ORM
- Jakarta Persistence API (JPA)
