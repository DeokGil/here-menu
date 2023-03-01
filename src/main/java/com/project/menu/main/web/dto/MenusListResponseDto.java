package com.project.menu.main.web.dto;

import com.project.menu.main.domain.menus.Menus;
import lombok.Getter;

@Getter
public class MenusListResponseDto {
    private  Long id;
    private int seq;
    private String category;
    private String imgfile;
    public MenusListResponseDto(Menus entity){
        this.id = entity.getId();
        this.seq = entity.getSeq();
        this.category = entity.getCategory();
        this.imgfile = entity.getImgfile();
    }
}
