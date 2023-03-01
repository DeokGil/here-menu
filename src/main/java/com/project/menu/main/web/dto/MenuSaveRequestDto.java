package com.project.menu.main.web.dto;

import com.project.menu.main.domain.menus.Menus;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MenuSaveRequestDto {
    private int seq;
    private String category;
    private String imgfile;
    private String useyn;
    private String name;

    @Builder
    public MenuSaveRequestDto(int seq, String category, String imgfile,String useYn,String name){
        this.seq = seq;
        this.category = category;
        this.imgfile = imgfile;
        this.useyn = useyn;
        this.name = name;
    }

    public Menus toEntity(){
       return Menus.builder().seq(seq).category(category).imgfile(imgfile).useyn(useyn).name(name).build();
    }

}
