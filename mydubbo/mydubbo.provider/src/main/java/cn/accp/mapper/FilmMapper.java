package cn.accp.mapper;

import cn.accp.entity.Film;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <功能描述>
 *
 * @author liuchen@550820335.com
 * @createTime 2020/11/26
 */
@Mapper
public interface FilmMapper {

    List<Film>  select();
}
