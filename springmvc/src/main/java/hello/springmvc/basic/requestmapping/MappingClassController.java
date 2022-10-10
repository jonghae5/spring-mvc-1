package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
@Slf4j
public class MappingClassController {

    /**
     *
     *     회원 관리 API
     *     회원 목록 조회: GET
     *     회원 등록: POST
     *     회원 조회: GET
     *     회원수정: PATCH /users/{userId} 회원 삭제: DELETE /users/{userId}
     *
     */

    @GetMapping
    public String user() {
        return "get users";
    }
    @PostMapping
    public String addUser() {
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable("userId") String userId) {
        return "get userId=" + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable("userId") String userId) {
        return "patch userId=" + userId;
    }
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") String userId) {
        return "delete userId=" + userId;
    }
}
