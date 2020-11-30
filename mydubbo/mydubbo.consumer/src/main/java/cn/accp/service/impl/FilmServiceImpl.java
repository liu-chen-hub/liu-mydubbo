package cn.accp.service.impl;

import cn.accp.entity.Film;
import cn.accp.service.FilmService;
import cn.accp.service.ShowFilmService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <功能描述>
 *
 * @author liuchen@550820335.com
 * @createTime 2020/11/26
 */
@Service
public class FilmServiceImpl implements FilmService {

    @Reference
    private ShowFilmService showFilmService;
    @Override
    public List<Film> showAll2() {
        return showFilmService.showAll();
    }
}
