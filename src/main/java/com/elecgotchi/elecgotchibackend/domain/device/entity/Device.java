package com.elecgotchi.elecgotchibackend.domain.device.entity;

import com.elecgotchi.elecgotchibackend.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter(AccessLevel.PROTECTED)
public class Device {
    /**식별자
     * 타입 : Integer
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "device_id")
    private Integer id;

    /**사용자 아이디
     * 타입 : User
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User userId;

    /**기기등록링크
     * 타입 : Varchar(4096)
     */
    @Column(name = "source_url", length = 4096)
    private String sourceUrl;

    /**품명
     * 타입 : Varchar(100)
     */
    @Column(length = 100)
    private String name;

    /**이미지
     * 타입 : Varchar(4096)
     */
    @Column(name = "image_url", length = 4096)
    private String imageUrl;

    /**제조국(원산지)
     * 타입 : Varchar(50)
     */
    @Column(name = "origin_country", length = 50)
    private String originCountry;

    /**제조사(수입자)
     * 타입 : Varchar(50)
     */
    @Column(length = 50)
    private String maker;

    /**인증/허가사항
     * 타입 : Varchar(500)
     */
    @Column(length = 500)
    private String authentication;

    /**관리방법
     * 타입 : Varchar(5000)
     */
    @Column(name = "care_tip", length = 5000)
    private String careTip;

    /**업사이클링방법
     * 타입 : Varchar(5000)
     */
    @Column(name = "upcycling_tip", length = 5000)
    private String upcyclingTip;

    /**폐기방법
     * 타입 : Varchar(5000)
     */
    @Column(name = "disposal_tip", length = 5000)
    private String disposalTip;

    /**비고
     * 타입 : Varchar(500)
     */
    @Column(length = 500)
    private String remark;

    /**상태
     * 타입 : Enum(ACTIVATED, UPCYCLED, DISPOSALED)
     */
    private Status status;

    /**등록일시
     * 타입 : Datetime
     */
    private LocalDateTime created_at;
}
