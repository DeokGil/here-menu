package com.project.menu.main.service;

import com.project.menu.main.domain.menus.Menus;
import com.project.menu.main.domain.menus.MenusRepository;
import com.project.menu.main.web.dto.MainResponseDto;
import com.project.menu.main.web.dto.MenuResponseDto;
import com.project.menu.main.web.dto.MenuSaveRequestDto;
import com.project.menu.main.web.dto.MenusListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MenuService {

    public final MenusRepository menusRepository;

    @Transactional
    public Long save(MenuSaveRequestDto requestDto){
        return menusRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public List<Menus> findCategory(String category){
        System.out.println("::::::::; service : " + category);
        return menusRepository.findByAllCategory(category);
    }

//    public MenuResponseDto findById (Long id){
//        Menus entity =menusRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));
//
//        return new MenuResponseDto(entity);
//    }

//    @Transactional(readOnly = true)
//    public List<MenusListResponseDto> findAllDesc(){
//        return menusRepository.findAllDesc().stream().map(MenusListResponseDto::new).collect(Collectors.toList());
//
//    }
}
