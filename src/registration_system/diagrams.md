```mermaid
classDiagram
  User <|-- Student
  User <|-- Faculty
  
  Class -- User
  
class User {
  name : String
  getName() : String
}
```