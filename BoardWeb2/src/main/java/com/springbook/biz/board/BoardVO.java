package com.springbook.biz.board;


import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;


@Data
public class BoardVO {
	private int seq, cnt;
	private String title, writer, content, searchCondition, searchKeyword;
	private Date regDate;
	private MultipartFile uploadFile;
}
