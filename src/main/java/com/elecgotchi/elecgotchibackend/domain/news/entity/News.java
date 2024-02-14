package com.elecgotchi.elecgotchibackend.domain.news.entity;

import com.elecgotchi.elecgotchibackend.domain.device.entity.Device;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class News {
    /**식별자
     * 타입 : Integer
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_id")
    private Integer id;

    /**기기아이디
     * 타입 : Device
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private Device device;

    /**뉴스링크
     * 타입 : Varchar(4096)
     */
    @Column(length = 4096)
    private String url;

    /**제목
     * 타입 : Varchar(50)
     */
    @Column(length = 50)
    private String title;

    /**키워드
     * 타입 : Varchar(50)
     */
    @Column(length = 50)
    private String keyword;

    /**게시일
     * 타입 : datetime
     */
    private LocalDateTime dateline;
}
