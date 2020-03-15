## Spring data JDBC - example implementation
Github:

https://github.com/spring-projects/spring-data-jdbc

Documentation:

https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/#reference

---
### Problems with Hibernate
- feature rich, which means heavy
- complex with automagic, ergo unpredictable
- designed for huge monolithic applications

---
### Why use Spring data JDBC?
- lightweight
- simple, which means predictable
- designed for microservices and DDD (supports immutable objects, using specified constructors)
- uses Spring Data repositories
- supports immutable fields and value objects

---
## Spring Data JDBC - ORM
### How specific problems are solved
1. Aggregate roots
2. insertion/deletion policy 
3. how entity state is tracked
4. Object creation
5. Immutability (Persistence constructor, Wither, `@Embedded`)

---
### ORM - supported types
- primitives, enums, String, 
- Date, LocalDate, LocalDateTime, LocalTime
- Relationships: Set, Map, List
- Custom converters
- "Anything your database driver accepts." (like arrays in Postgresq)

---
### Query methods
- deriving query from method name currently not supported
- custom row mapping
- modifying queries

---
#### important features not covered
custom converters - @ReadingConverter, @WritingConverter

mybatis integration

auditing

lifecycle events