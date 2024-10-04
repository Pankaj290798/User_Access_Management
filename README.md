# User Access Management - Postman Collection
This README provides an overview of the API requests for the User Access Management system using Postman.


## Admin Endpoints

### 1. Save User (Admin)
- **Endpoint**: `POST /auth/save`
- **URL**: `http://localhost:8080/auth/save`
- **Authorization**: Bearer Token
    - **Token**: `eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbkBnbWFpbC5jb20iLCJpYXQiOjE3MjgwMjE0NTIsImV4cCI6MTcyODAyMjg5Mn0.W_zd8FZ4wM2x1oZfWj87OmZ3wtkPBmBRL8kIGoO18HU`
- **Body**:
  ```json
  {
    "firstName": "Pankaj",
    "lastName": "Chaudhari",
    "email": "pankaj@gmail.com",
    "password": "Pankaj@123"
  }


### 2. Delete User (Admin)
- **Endpoint**: `DELETE /auth/delete`
- **URL**: `http://localhost:8080/auth/delete/{id}`
- **Authorization**: Bearer Token
    - **Token**: `eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbkBnbWFpbC5jb20iLCJpYXQiOjE3MjgwMjE0NTIsImV4cCI6MTcyODAyMjg5Mn0.W_zd8FZ4wM2x1oZfWj87OmZ3wtkPBmBRL8kIGoO18HU`

## User Endpoint
### 1. Get AllUser (User)
**Endpoint**: `GET /auth/getAllUser`
- **URL**: `http://localhost:8080/auth/getAllUser`
- **Authorization**: Bearer Token
    - **Token**: `eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbkBnbWFpbC5jb20iLCJpYXQiOjE3MjgwMjE0NTIsImV4cCI6MTcyODAyMjg5Mn0.W_zd8FZ4wM2x1oZfWj87OmZ3wtkPBmBRL8kIGoO18HU`


## Login Endpoint

**Endpoint**: `POST /signIn`
- **URL**: `http://localhost:8080/signIn`
- **Body**:
  ```json
  {
    "email": "pankaj@gmail.com",
    "password": "Pankaj@123"
  }