package myapp.controllers;

import myapp.models.User;
import myapp.responses.BaseResponse;
import myapp.responses.Response;
import myapp.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    UserService userService = new UserService();

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
    public Response deleteUser(@RequestBody User request){
        userService.deleteUser(request);
        return new Response("SUCCESS");
    }

    @GetMapping("/{id}")
    public User findUserById (@PathVariable("id") int id){
        final User userResponse;
        userResponse = userService.findUser(id);
        return userResponse;
    }





}

//    public User findUserById (@RequestParam(value = "id") int id){