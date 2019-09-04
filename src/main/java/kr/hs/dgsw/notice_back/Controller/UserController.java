package kr.hs.dgsw.notice_back.Controller;

import kr.hs.dgsw.notice_back.Domain.User;
import kr.hs.dgsw.notice_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/login")
    public User login(@RequestBody User user) { return this.userService.login(user); }

    @PostMapping(value = "/register")
    public Long register(@RequestBody User user) { return this.userService.register(user); }

    @PutMapping(value = "/update")
    public int update(@RequestBody User user) { return this.userService.update(user); }

    @GetMapping(value = "/findByAccount/{account}")
    public User findByAccount(@PathVariable String account) { return this.userService.findByAccount(account); }

    @PutMapping(value = "/insertImage")
    public int insertImage(@RequestBody User user) { return this.userService.insertImage(user); }

    @GetMapping(value = "/findByID/{id}")
    public User findById(@PathVariable Long id) { return this.userService.findById(id); }

}
