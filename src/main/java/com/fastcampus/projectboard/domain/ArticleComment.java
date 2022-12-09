package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id; 
    private Article article; // 게시글 (ID)
    private String content; // 본문

    private LocalDateTime createdAt; // 생성일시
    private String createdBy; // 생성자
    private LocalDateTime modifyAt; // 수정 일시
    private String modifyBy; // 수정자
}
