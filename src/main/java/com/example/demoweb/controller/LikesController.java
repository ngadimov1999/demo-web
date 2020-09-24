package com.example.demoweb.controller;

import com.example.demoweb.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LikesController {
    @Autowired
    LikesService likesService;

    @ResponseBody
    @RequestMapping(path = "/post/{id}/like", method = RequestMethod.POST)
    public String like(@PathVariable("id") Long id) {
        int likes = likesService.like(id);
        return "" + likes;
    }
}
/*Здесь в аннотации @RequestMapping в адресе использована конструкция {id}, определяющая место параметра в адресной строке.
В параметрах метода использована дополнительная аннотация @PathVariable, указывающая на то, что данный параметр получается
из адресной строки. Имя переменной не обязательно должно совпадать с тем, как оно обозначено в @RequestMapping.
Поэтому указывается @PathVariable("id").
Это позволяет очевидным образом использовать
несколько параметров в одной адресной строке, например, @RequestMapping(value = "post/{userId}/pages/{pageId}")*/