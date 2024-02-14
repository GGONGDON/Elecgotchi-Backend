package com.elecgotchi.elecgotchibackend.domain.news.repository;

import com.elecgotchi.elecgotchibackend.domain.news.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Integer> {
}
