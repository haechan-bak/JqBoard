package com.blue.board.vo;
 
public class JqBoardVO extends CommonVO {
	
	int brdSeq;
	String brdSubject;
	String brdContent;
	String brdWriter;
	String brdWriterNm;
	int brdHitCnt;
    String brdDelYn;
    String brdInsId;
    String brdInsDt;
    String brdUpdId;
    String brdUpdDt;
	String searchType;
	String searchText;
	String result;	
	
	public int getBrdSeq() {
		return brdSeq;
	}
	public void setBrdSeq(int brdSeq) {
		this.brdSeq = brdSeq;
	}
	public String getBrdSubject() {
		return brdSubject;
	}
	public void setBrdSubject(String brdSubject) {
		this.brdSubject = brdSubject;
	}
	public String getBrdContent() {
		return brdContent;
	}
	public void setBrdContent(String brdContent) {
		this.brdContent = brdContent;
	}
	public String getBrdWriter() {
		return brdWriter;
	}
	public void setBrdWriter(String brdWriter) {
		this.brdWriter = brdWriter;
	}
	public String getBrdWriterNm() {
		return brdWriterNm;
	}
	public void setBrdWriterNm(String brdWriterNm) {
		this.brdWriterNm = brdWriterNm;
	}
	public int getBrdHitCnt() {
		return brdHitCnt;
	}
	public void setBrdHitCnt(int brdHitCnt) {
		this.brdHitCnt = brdHitCnt;
	}
	public String getBrdDelYn() {
		return brdDelYn;
	}
	public void setBrdDelYn(String brdDelYn) {
		this.brdDelYn = brdDelYn;
	}
	public String getBrdInsId() {
		return brdInsId;
	}
	public void setBrdInsId(String brdInsId) {
		this.brdInsId = brdInsId;
	}
	public String getBrdInsDt() {
		return brdInsDt;
	}
	public void setBrdInsDt(String brdInsDt) {
		this.brdInsDt = brdInsDt;
	}
	public String getBrdUpdId() {
		return brdUpdId;
	}
	public void setBrdUpdId(String brdUpdId) {
		this.brdUpdId = brdUpdId;
	}
	public String getBrdUpdDt() {
		return brdUpdDt;
	}
	public void setBrdUpdDt(String brdUpdDt) {
		this.brdUpdDt = brdUpdDt;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSearchText() {
		return searchText;
	}
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
