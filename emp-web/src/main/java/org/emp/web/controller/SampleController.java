package org.emp.web.controller;

import org.emp.web.model.Sample;
import org.emp.web.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/4/5.
 */
@RequestMapping(value = "/sample")
@Controller
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping("/StringToSample")
    @ResponseBody
    public Sample StringToSample(@RequestParam("sample") Sample sample) {
        return sample;
    }

    @RequestMapping("/{id}/findSample")
    @ResponseBody
    public Sample findSampleById(@PathVariable Long id) {
        return sampleService.findSampleByfId(id);
    }

    @RequestMapping("/{name}/findSampleByName")
    @ResponseBody
    public List<Sample> findSampleByName(@PathVariable String name) {
        return sampleService.findSamplesByName(name);
    }

}
