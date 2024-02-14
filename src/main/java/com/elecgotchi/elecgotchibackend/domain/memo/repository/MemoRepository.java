package com.elecgotchi.elecgotchibackend.domain.memo.repository;

import com.elecgotchi.elecgotchibackend.domain.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Integer> {

}
