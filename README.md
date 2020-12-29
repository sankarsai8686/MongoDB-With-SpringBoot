# MongoDB-With-SpringBoot
MongoDB With SpringBoot




MongoDB
MongoDB is a document-oriented NoSQL database that stores JSON-like documents with dynamic schemas. It is commonly used for high volume data storage.
•	Database: It is a container for collections and can be thought as similar to an RDBMS database, which is a container for Tables.
•	Collection: It is equivalent to Tables in RDBMS, but unlike a collection it has a dynamic schema. A collection exists within a database.
•	Document: It is a single record in a MongoDB collection. It can be thought of as a row in RDBMS.
•	Field: A document has zero or more fields. It's like an RDBMS column having a key-value pair.
•	Data is stored in MongoDB as JSON




Defining a Collection

 

•	@Document: This marks the class as a domain object that will be persisted into the database. The default collection name that is used is the class name (first character lowercased). We can map to a different collection in the database by using the collection attribute of the annotation.
•	@Id: This marks the field used for identity purposes.
•	@Indexed(unique = true): This is applied to the field that will be indexed with a constraint of unique.
Defining Repository
We create a repository by making an interface:
public interface CandidateRepository extends MongoRepository<Candidate, String> {}
CandidateRepository extends the MongoRepository interface and plugs in the datatype of the document that we are working with, i.e Candidate and String respectively.

Connection Setup
To set up a proper connection, we need to define the connection properties in application.properties:
spring.data.mongodb.uri=mongodb://localhost:27017/Sankar

// localhost for the host
spring.data.mongodb.host=localhost
// mongodb port
spring.data.mongodb.port=27017
// the name of our database
spring.data.mongodb.database=Sankar



Ref : https://stackabuse.com/spring-data-mongodb-tutorial/
