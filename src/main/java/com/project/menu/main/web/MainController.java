package com.project.menu.main.web;

import com.project.menu.main.domain.menus.Menus;
import com.project.menu.main.service.MenuService;
import com.project.menu.main.web.dto.MainResponseDto;
import com.project.menu.main.web.dto.MenuResponseDto;
import com.project.menu.main.web.dto.MenuSaveRequestDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/main")
@Api(tags = {"ToyProject API Test"})
public class MainController {

    private final MenuService menuService;
    @GetMapping("/")
    @ApiOperation(value = "", notes = "")
    public String main(){
        return "hello";
    }

    @GetMapping("/menu/{category}")
    @ApiOperation(value = "메인 페이지", notes = "메인페이지를 불러온다.")
    public ResponseEntity<List<Menus>> main(@PathVariable String category) {
        System.out.println("::::::: ////// : ");
        System.out.println("::::::: //////111 : " + category);

        return ResponseEntity.ok(menuService.findCategory(category));
    }

    @PostMapping("/insert")
    public ResponseEntity<Long> insert(@RequestBody MenuSaveRequestDto requestDto){

        return ResponseEntity.ok(menuService.save(requestDto));
    }
//    @PutMapping("/main/menu/update/{id}")
//    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
//        return postsService.update(id,requestDto);
//    }

//    @GetMapping("/main/menu/{id}")
//    @ApiOperation(value = "Number of BBS messages of the bbsId.",
//            notes = "This function returns the number of BBS messages of the bbsId.")
//    public MenuResponseDto findById (@PathVariable Long id){
//        return menuService.findById(id);
//    }
//    @DeleteMapping("/api/v1/posts/{id}")
//    public Long delete(@PathVariable Long id){
//        postsService.delete(id);
//        return id;
//    }
}
