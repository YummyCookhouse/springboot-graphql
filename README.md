## What this is?
This is a demo project to show how to get graphql works with springboot

## Dependencies
- graphql-spring-boot-starter
- graphql-java-tools

## Already have
- Query list
- Query with arguments
- Mutation
- Union type
- Field resolver

## To be added
- Defer
- Fragment

## How to play
1. Download [graphiql app](https://electronjs.org/apps/graphiql)
2. `./gradlew bootrun`
3. Visit `http://localhost:8081/graphql` in GraphiQL
    ##### Query all pets
    ```
    query {
         pets {
            ...on Bird {
              name
              type
              wings
              owner {
                name
              }
            }
          	...on Dog {
              name
              type
              license
              owner {
                name,
                address
              }
            }
        }
    }
    ```
    ##### Query pet with specific id
    ```
    query {
      pet(id: 1) {
        ...on Bird {
              name
              type
              wings
              owner {
                name
              }
            }
          	...on Dog {
              name
              type
              license
              owner {
                name,
                address
              }
            }
      }
    }
    ```
    ##### Update/create a dog
    ```
     mutation {
     	saveDog(id:-1, name: "XXX", age: 12, ownerId: 2, license: "dssd") {
         name
         type
       }
     }
    ```