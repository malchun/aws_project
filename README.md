# aws_project
Basic rest service for AWS exploration project.

## Usage
``` 
$ curl -i -X PUT -H "Content-Type: application/json" -d '{"id": "152321", "description": "cat"}' localhost:8080/product/2/add
$ curl -i -X GET localhost:8080/product/2
```

## Docker
```
$ docker build -t my-java-app .
$ docker run -it --rm --name aws-product -p 8080:8080 my-java-app
```