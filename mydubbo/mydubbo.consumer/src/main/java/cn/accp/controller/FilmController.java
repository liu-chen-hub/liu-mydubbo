package cn.accp.controller;

import cn.accp.entity.Film;
import cn.accp.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <功能描述>
 *
 * @author liuchen@550820335.com
 * @createTime 2020/11/26
 */
@RestController
@RequestMapping("/show")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @RequestMapping("/index")
    public List<Film> index(){
        return filmService.showAll2();
    }
}
