package cn.accp.service.impl;

import cn.accp.entity.Film;
import cn.accp.mapper.FilmMapper;
import cn.accp.service.ShowFilmService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <功能描述>
 *
 * @author liuchen@550820335.com
 * @createTime 2020/11/26
 */
@Service
public class FilmServiceImpl implements ShowFilmService {

    @Autowired
    private FilmMapper filmMapper;
    @Override
    public List<Film> showAll() {
        return filmMapper.select();
    }
}
