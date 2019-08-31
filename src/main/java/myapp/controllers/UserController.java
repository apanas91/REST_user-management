package myapp.controllers;

import myapp.models.User;
import myapp.responses.BaseResponse;
import myapp.responses.Response;
import myapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.EOFException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> findAllUsers(){
        final List<User> userList;
        userList = userService.findAllUsers();
        return  userList;
    }

    @PostMapping
    public BaseResponse saveUser(@RequestBody User request){
        userService.saveUser(request);
        return new BaseResponse("SUCCESS", request.getId());

    }

    @DeleteMapping
    public ResponseEntity<Response> deleteUser(@RequestBody User request){
        userService.deleteUser(request);

        Response res = new Response("SUCCESS");
        return  ResponseEntity.ok(res);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById (@PathVariable("id") int id){
        final User userResponse;
        userResponse = userService.findUser(id);
        if (userResponse == null) {
            return ResponseEntity.notFound().build();

        }
        return ResponseEntity.ok(userResponse);
    }





}

//    public User findUserById (@RequestParam(value = "id") int id){