package com.weiguofu.esjpademo.repo;

import com.weiguofu.esjpademo.entity.Game;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


/**
 * @Description: TODO
 * @Author: guofuwei
 * @Date: 2020/8/16 22:07
 * @Version 1.0
 */
public interface GameRepo extends ElasticsearchRepository<Game, String> {

    List<Game> findByName(String name);

    //默认继承save方法
    //Object save(Game game);

    List<Game> findByNameOrIntroduce(String word1,String word2);


    void deleteById(String id);
}
