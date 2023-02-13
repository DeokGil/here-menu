package com.project.menu.main.web.dto;

import com.project.menu.main.domain.menus.Menus;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MainResponseDto {
    private  Long id;
    private int seq;
    private String category;
    private String imgFile;
    public MainResponseDto(Menus entity){
        this.id = entity.getId();
        this.seq = entity.getSeq();
        this.category = entity.getCategory();
        this.imgFile = entity.getImgFile();
    }

}
