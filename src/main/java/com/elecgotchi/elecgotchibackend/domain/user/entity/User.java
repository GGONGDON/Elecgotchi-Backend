package com.elecgotchi.elecgotchibackend.domain.user.entity;

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
public class User {
    /**식별자
     * 타입 : Integer
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    /**이름
     * 타입 : Varchar(50)
     */
    @Column(length = 50)
    private String name;

    /**비밀번호
     * 타입 : Varchar(255)
     */
    private String password;

    /**이메일
     * 타입 : Varchar(512)
     */
    @Column(length = 512)
    private String email;

    /**권한
     * 타입 : Enum(NORMAL, ADMIN)
     */
    private Role role;

    /**가입일시
     * 타입 : Datetime
     */
    @Column(name = "join_at")
    private LocalDateTime joinAt;
}
