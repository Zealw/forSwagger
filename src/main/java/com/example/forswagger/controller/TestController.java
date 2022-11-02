package com.example.forswagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/test")
@Api(value = "依法归治-专家库 API", tags = "依法归治-专家库")
public class TestController {
    /**
     * 添加
     */
    @GetMapping("/test")
    @ApiOperation(value = "添加", notes = "添加", response = String.class)
    public String addYfgzExpert() throws Exception {
        return  "true";
    }


}
