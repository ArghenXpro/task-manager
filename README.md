# Task Manager

Это мой проект Task Manager, который я сам написал на Spring Boot. Тут можно регистрироваться, входить через токены, создавать задачи, назначать их юзерам, отмечать как готовые. Есть роли: обычный юзер и админ, причём админ может удалять юзеров. Всё сделал с нуля, чтобы было нормальное приложение, а не просто пара запросов.

## Что тут есть
- Регистрация и вход с токенами (JWT).
- Создание, просмотр, изменение и удаление задач.
- Назначение задач другим юзерам.
- Админ может удалять юзеров.
- REST API для всего этого.

## Как я это делал
- Взял **Spring Boot 3.4.3** — основа проекта.
- **Spring Security** с JWT — для защиты.
- **Maven** — чтобы всё собрать.
- **Java 17** — писал на нём, но тестил на 23, работает.
- **Lombok** — меньше кода руками.

## Этапы разработки (коммиты)

1. **"Initial project setup with Spring Boot"**
   - Создал основу проекта. Добавил `pom.xml`, где указал все зависимости (Spring Boot, Security, Lombok), и `TaskManagerApplication.java` — это стартовая точка, откуда всё запускается. Без этого ничего бы не пошло.

2. **"Configure PostgreSQL and JWT settings"**
   - Настроил `application.properties`. Тут я прописал, как подключаться к токенам (JWT) — секрет и время жизни. Это чтобы авторизация заработала.

3. **"Add User and Task entities"**
   - Написал классы `User` и `Task`. Это как шаблоны для юзеров (имя, пароль, роль) и задач (заголовок, описание, кому назначена). Основа для данных.

4. **"Add UserRepository and TaskRepository for database access"**
   - Добавил `UserRepository` и `TaskRepository`. Это штуки, которые позволяют искать юзеров по имени и задачи по создателю или исполнителю. Связь с данными.

5. **"Implement Spring Security with JWT authentication"**
   - Сделал защиту через JWT. Тут `SecurityConfig`, `JwtUtil`, `JwtRequestFilter`, `JwtUserDetailsService` — полный набор, чтобы токены работали, и никто лишний не лез.

6. **"Add AuthService and TaskService with business logic"**
   - Написал `AuthService` и `TaskService`. Это логика: регистрация, вход, создание задач, их изменение. Всё, что делает проект живым.

7. **"Add AuthController, TaskController, AdminController with REST API endpoints"**
   - Создал `AuthController`, `TaskController`, `AdminController`. Это API, чтобы через запросы управлять юзерами и задачами — регистрация, задачи, удаление юзеров.

8. **"Add .gitignore and README with detailed description"**
   - Добавил `.gitignore`, чтобы не грузить мусор вроде временных файлов, и этот `README.md`, где я объясняю, что и как делал.
