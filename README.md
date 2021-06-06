# aws_project
Basic rest service for AWS exploration project.

## Usage
``` 
$ curl -i -X PUT -H "Content-Type: application/json" -d '{"id": "152321", "description": "cat"}' localhost:8080/product/2/add
$ curl -i -X GET localhost:8080/product/2
```