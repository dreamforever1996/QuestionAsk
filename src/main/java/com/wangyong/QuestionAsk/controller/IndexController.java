package com.wangyong.QuestionAsk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/****
 * created by wangyong 2018/02/26
 */

@Controller
public class IndexController {

    @RequestMapping(path = {"/", "/index"}, method = RequestMethod.GET)
    @ResponseBody
    public String index()
    {
        return "hello, QuestionAsk!\n";
    }

    @RequestMapping(path = {"/profile"})
    @ResponseBody
    public String profile(@RequestParam("type") int type,
                          @RequestParam("key") String key)
    {
        return String.format("Profile Page of type: %d, key: %s", type, key);
    }

    @RequestMapping(path = {"/vm"}, method = RequestMethod.GET)
    @ResponseBody
    public String template()
    {
        return "welcome";
    }
}
