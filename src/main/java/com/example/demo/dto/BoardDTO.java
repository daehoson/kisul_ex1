package com.example.demo.dto;
import lombok.*;

import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class BoardDTO {
    private Long bno;

    @NotEmpty
    @Size(min=3,max=100)
    private String title;
    private LocalDateTime regDate;
    @NotEmpty
    private String content;
    private String writer;
    private LocalDateTime modDate;
}
