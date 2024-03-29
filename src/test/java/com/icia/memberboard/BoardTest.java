package com.icia.memberboard;

import com.icia.memberboard.dto.BoardSaveDTO;
import com.icia.memberboard.repository.BoardRepository;
import com.icia.memberboard.service.BoardService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootTest
public class BoardTest {

    @Autowired
    private BoardService bs;

    @Autowired
    private BoardRepository br;

    @Test
    @DisplayName("글데이터생성")
    public void newBoard() {
        // IntStream을 이용하여 새글 30개 DB에 저장해놓읍시다.
        IntStream.rangeClosed(1, 100).forEach(i -> {
            bs.save(new BoardSaveDTO("writer" + i, "pw" + i, "title" + i, "contents" + i, LocalDateTime.now()));

        });
    }

}
