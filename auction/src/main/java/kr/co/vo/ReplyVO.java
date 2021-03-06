package kr.co.vo;

import java.util.Date;

public class ReplyVO {

	private int boardno;
	private int rno;
	private String content;
	private String writer;
	private Date regdate;
	
	
	
	public int getBoardno() {
		return boardno;
	}
	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "ReplyVO [boardno=" + boardno + ", rno=" + rno + ", content=" + content + ", writer=" + writer
				+ ", regdate=" + regdate + "]";
	}
	
	
	
}
