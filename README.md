## What this is?
This is an example to show how to get graphql works with springboot

## Dependencies
- [graphql-spring-boot-starter](https://github.com/graphql-java-kickstart/graphql-spring-boot)
- [graphql-java-tools](https://github.com/graphql-java-kickstart/graphql-java-tools)

## Reference
- [GraphQL Java and SpringBoot](https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/)
- [GraphQL Java tools reference](https://www.graphql-java-kickstart.com/tools/)

## Already have
- Query list
- Query with arguments
- Mutation
- Union type
- Field resolver
- Mutation with input type
- Fragment

## To be added
- Defer

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
    ##### Create a pet with input type
    ```
    mutation {
      addPet(pet: {
        id: 99
        ownerId: 1
        name: "Mooo"
        type: DOG
        age: 10
        license: "555555"
      }) {
        ...on Dog {
          name
          type
        }
      }
    }
    ```
    ##### Play with `fragment`
    ```
    query{
      pets {
        ...AllKindsOfPet
      }
    }
    
    fragment AllKindsOfPet on Pet {
      ...on Dog {
          type
        	name
        	owner {
            name
          }
      }
      ...on Bird {
        	type
          name
        	owner {
            name
          }
      }
    }
    ```
    
    ## Troubleshooting
    >
    Q: `Docs` doesn't work in `GraphiQL`

    A: Click `Edit HTTP Headers` on right-top and add header `Authorization`
    