package com.example.demo.repository;

import com.example.demo.domain.Board;
import com.example.demo.repository.search.BoardSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {
//    Page<Board> findTitleContainingOrderByBnoDesc(String keyword, Pageable pageable);

//    @Query("select b from Board b where b.title like concat('%', :keyword, '%')")
//    Page<Board> findKeyword(String keyword, Pageable pageable);
    @Query(value="select now()", nativeQuery = true)
    String getTime();


}
