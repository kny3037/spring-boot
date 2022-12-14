package com.springboot.hello.controller;

import com.springboot.hello.domian.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {
    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample(){
        return "Hello Post Api";
    }
    @PostMapping("/member")
    public String postMember(@RequestBody Map<String, Object> postData){
        StringBuilder sb = new StringBuilder();  //Builder Pattern

        postData.entrySet().forEach(map->sb.append
                (map.getKey()+":"+map.getValue()+"\n"));
        return sb.toString();
    }
    @PostMapping("/member2")
    public String postMember(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }
}
