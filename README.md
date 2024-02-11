# Demo Functional Endpoints vs. REST Endpoints in Spring Reactive Programming



## Functional Endpoints

- **Get All Users**
  - **Request:** GET /api/functional/users
  - **Response:** 200 OK
    ```json
    [
        {
            "id": 1,
            "name": "John Doe",
            "phone": "123-456-7890"
        },
        {
            "id": 2,
            "name": "Jane Doe",
            "phone": "123-456-7890"
        }
    ]
    
    ```
- **Get User By Id**
- **Request:** GET /api/functional/users?userId={userId}
  - **Response:** 200 OK
    ```json
    {
        "id": 1,
        "name": "John Doe",
        "phone": "123-456-7890"
    }
    ```



## REST Endpoints

- **Get All Users**
  - **Request:** GET /api/rest/users
  - **Response:** 200 OK
    ```json
    [
        {
            "id": 1,
            "name": "John Doe",
            "phone": "123-456-7890"
        },
        {
            "id": 2,
            "name": "Jane Doe",
            "phone": "123-456-7890"
        }
    ]
    ```
    
- **Get User By Id**
- **Request:** GET /api/rest/user?userId={userId}
  - **Response:** 200 OK
    ```json
    {
        "id": 1,
        "name": "John Doe",
        "phone": "123-456-7890"
    }
    ```
    

