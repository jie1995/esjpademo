package com.weiguofu.esjpademo.controller;

import com.weiguofu.esjpademo.entity.Game;
import com.weiguofu.esjpademo.repo.GameRepo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: TODO
 * @Author: guofuwei
 * @Date: 2020/8/16 22:21
 * @Version 1.0
 */

@RestController
@RequestMapping("/game")
public class GameController {

    @Resource
    private GameRepo gameRepo;

    /**
     * 根据name去es中查找
     * @param name
     * @return
     */
    @GetMapping
    public Object findByName(String name) {
        return gameRepo.findByName(name);
    }

    /**
     * 根据name或introduce去es中查找
     * @param word
     * @return
     */
    @GetMapping("findByNameOrIntroduce")
    public List<Game> findByNameOrIntroduce(String word) {
        return gameRepo.findByNameOrIntroduce(word,word);
    }


    /**
     * 查询全部
     * @return
     */
    @GetMapping("/findAll")
    public Object findAll() {
        return gameRepo.findAll();
    }


    /**
     * 新增
     * @param game
     * @return
     */
    @PostMapping
    public Object addGame(@RequestBody Game game) {
        return gameRepo.save(game);
    }



    @PostMapping("/delete")
    public Object delete() {
        // gameRepo.deleteById(null);
         return "success";
    }
}
