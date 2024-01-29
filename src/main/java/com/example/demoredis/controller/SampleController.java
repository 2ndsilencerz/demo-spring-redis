package com.example.demoredis.controller;

import com.example.demoredis.model.SampleModel;
import com.example.demoredis.service.SampleService;
import org.springframework.web.bind.annotation.*;

@RestController("/test")
public class SampleController {

    final SampleService service;

    public SampleController(SampleService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/input/get")
    public SampleModel testInputByGet() {
        return service.testInput(null);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/input/post")
    public SampleModel testInputByPost(@RequestBody SampleModel model) {
        return service.testInput(model);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get")
    public SampleModel testGetData(@RequestParam String id) {
        return service.testGet(id);
    }
}
