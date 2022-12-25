package com.example.demo.service;

import com.example.demo.dto.BoardDTO;
import com.example.demo.dto.PageRequestDTO;
import com.example.demo.dto.PageResponseDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class BoardServiceTests {
    @Autowired
    private BoardService boardService;

//    @Test
//    public void testRegister(){
//        log.info(boardService.getClass().getName());
//        BoardDTO boardDTO = BoardDTO.builder()
//                .title("Sample Title")
//                .content("Sample Content")
//                .writer("user00")
//                .build();
//        Long bno = boardService.register(boardDTO);
//        log.info("bno: "+ bno);
//    }

//    @Test
//    public void testModify(){
//        BoardDTO boardDTO = BoardDTO.builder()
//                .bno(101L)
//                .title("updated....101")
//                .content("updated....101")
//                .writer("updated....user101")
//                .build();
//        boardService.register(boardDTO);
//    }
    @Test
    public void testList(){
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .type("tcw")
                .keyword("1")
                .page(1)
                .size(10)
                .build();
        PageResponseDTO<BoardDTO> responseDTO = boardService.list(pageRequestDTO);
        log.info(responseDTO.getDtoList());
    }
}
