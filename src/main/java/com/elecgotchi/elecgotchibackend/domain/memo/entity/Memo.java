package com.elecgotchi.elecgotchibackend.domain.memo.entity;

import com.elecgotchi.elecgotchibackend.domain.device.entity.Device;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Memo {
    /**식별자
     * 타입 : Integer
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memo_id")
    private Integer id;

    /**기기아이디
     * 타입 : Integer
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private Device device;

    /**내용
     * 타입 : Varchar(1000)
     */
    @Column(length = 1000)
    private String content;

    /**등록일시
     * 타입 : Datetime
     */
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
