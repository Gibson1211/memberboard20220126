package com.icia.memberboard.dto;

import com.icia.memberboard.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BoardSaveDTO {

    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private MultipartFile boardFile;
    private String boardFilename;

//    private LocalDateTime boardDate;

}
