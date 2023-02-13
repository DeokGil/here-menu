package com.project.menu.main.domain.menus;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "menu")
@NoArgsConstructor
public class Menus {
    @Id// 해당 테이블의 PK 필드를 나타냅니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK의 생성규칙을 나타냅니다.
    private Long id;

    @Column(name = "seq") // 테이블의 컬럼을 나타내며 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 컬럼이 됩니다.
    private int seq;

    @Column(name ="category")
    private String category;

    @Column(name = "imgFile")
    private String imgFile;

    @Column(name = "useYn")
    private String useYn;

    @Column(name = "name")
    private String name;

    @Builder // 해당클래스의 빌더 패턴 클래스를 생성
    public Menus(Long id ,int seq, String category,String imgFile, String useYn,String name){
        this.id = id;
        this.seq = seq;
        this.category = category;
        this.imgFile = imgFile;
        this.useYn = useYn;
        this.name = name;
    }

}
