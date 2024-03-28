# Many-to-Many Mapping with Hibernate

This Java application demonstrates a many-to-many mapping relationship using Hibernate. It includes two main entities:

## Flight Entity

- Represents a flight.
- Attributes: `id`, `name`, and `Type`.
- Utilizes a many-to-many mapping relationship with the Pilot entity.
- Corrected mappedBy attribute to refer to the Flight property in the Pilot entity.
- Cascade type: PERSIST and MERGE.

## Pilot Entity

- Represents a pilot.
- Attributes: `id`, `fName`, `lName`, and `email`.
- Utilizes a many-to-many mapping relationship with the Flight entity.
- Cascade type: PERSIST and MERGE.

## Usage

1. Configure Hibernate environment and database connection.
2. Compile and run the application.

## Dependencies

- Hibernate ORM
- Jakarta Persistence API (JPA)
