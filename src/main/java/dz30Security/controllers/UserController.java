package dz30Security.controllers;
/*
Проработать слой контроллеров для проекта книжного магазина. Делаем индивидуальный проект Book Store - книжный магазин.
Проработать личный кабинет пользователя (можно менять ФИО и почту, почта требует подтверждения*)
Пример эндпоинтов:
/api/v1/user
/api/v1/book
/api/v1/author
/api/v1/order


Добавить авторизацию по логину и паролю к проекту с урока 29. Авторизацию делаем инструментами Spring Security.
 */

import dz30Security.service.UserService;
import dz30Security.model.Userr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<Userr> getAll() {

        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Userr getUserById(@PathVariable int id) {

        return userService.findById(id);
    }

    @PostMapping("/{users}")
    public Userr saveOrUpdate(@RequestBody Userr user) {

        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {

        userService.deleteById(id);
    }

    @PutMapping("/{users}")
    public Userr update(@RequestBody Userr user) {

        return userService.update(user);
    }
}
