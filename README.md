# Spring Security

dependencies pom.xml
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

## Authentication

Default username : user

Default password : perhatikan di console saat pertama kali menjalankan program
```shell
Using generated security password: a2773316-b497-458b-b8c5-b8a6bda702af
```

![](docs/images/password.png)

## Cara Akses

```shell
GET http://username:password@localhost:8080

or 

GET http://localhost:8080/hello
Authorization: Basic dXNlcjpwYXNzd29yZA==
```

menggunakan header Authorization dengan value
hasil encode base64 username:password
