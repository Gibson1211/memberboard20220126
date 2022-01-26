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
public class BoardDetailDTO {

    private Long boardId;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private String boardFilename;
    private LocalDateTime boardDate;
    private int boardHits;

    public static BoardDetailDTO toBoardDetailDTO(BoardEntity boardEntity) {
        BoardDetailDTO boardDetailDTO = new BoardDetailDTO();
        boardDetailDTO.setBoardId(boardEntity.getId());
        boardDetailDTO.setBoardTitle(boardEntity.getBoardTitle());
        boardDetailDTO.setBoardWriter(boardEntity.getBoardWriter());
        boardDetailDTO.setBoardContents(boardEntity.getBoardContents());
        boardDetailDTO.setBoardFilename(boardEntity.getBoardFilename());
        if(boardEntity.getUpdateTime()==null){
            boardDetailDTO.setBoardDate(boardEntity.getCreateTime());
        } else {
            boardDetailDTO.setBoardDate(boardEntity.getUpdateTime());
        }
//        boardDetailDTO.setBoardDate(boardEntity.getCreateTime());
        boardDetailDTO.setBoardHits(boardEntity.getBoardHits());
        return boardDetailDTO;
    }


}
