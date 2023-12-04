package com.blue.board.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.blue.board.vo.JqReplyVO;
import com.blue.board.vo.JqBoardVO;

/**
 * 게시판 Dao
 * @author  JPJ
 * @since   2022.09.14
 * @version 1.0
 * @see
 * 
 *    수정일          수정자                           수정내용
 * ----------  ------  ----------------------------------
 * 2022.09.14   JPJ      최초생성
 * 2022.09.15   JPJ      Dao 정리
 * 
 */
@Repository
public class JqBoardDao {
	
	private static final Logger logger = LoggerFactory.getLogger(JqBoardDao.class);
	
	@Resource
    private SqlSession sqlSession;
	
	private static final String NAMESPACE = "jqBoardMapper";
	
	/**
	 * 게시판 목록 건수 조회
	 * @param
	 * @return
	 * @exception
	 * 
	 */
    public int boardListCnt(JqBoardVO jqBoardVO) throws Exception {
    	
    	logger.debug("## JqBoardDao : boardListCnt");
 
        return sqlSession.selectOne(NAMESPACE + ".boardListCnt", jqBoardVO);
    }
    
    /**
	 * 게시판 목록 조회
	 * @param
	 * @return
	 * @exception
	 * 
	 */
    public List<JqBoardVO> boardListSearch(JqBoardVO jqBoardVO) throws Exception {
    	
    	logger.debug("## JqBoardDao : boardListSearch");
    	
        return sqlSession.selectList(NAMESPACE + ".boardListSearch", jqBoardVO);
    }
    
    /**
	 * 게시글 조회수 증가
	 * @param
	 * @return
	 * @exception
	 * 
	 */ 
    public int boardAddHit(JqBoardVO jqBoardVO) throws Exception {
    	
    	logger.debug("## JqBoardDao - boardAddHit");
    	
        return sqlSession.update(NAMESPACE + ".boardAddHit", jqBoardVO);
    }
    
    /**
	 * 게시글 조회
	 * @param
	 * @return
	 * @exception
	 * 
	 */    
    public JqBoardVO boardInfo(JqBoardVO jqBoardVO) throws Exception {
    	
    	logger.debug("## JqBoardDao - boardInfo");
    	
        return sqlSession.selectOne(NAMESPACE + ".boardInfo", jqBoardVO);
    }
    
    /**
	 * 게시글 저장(등록, 수정, 삭제)
	 * @param
	 * @return
	 * @exception
	 * 
	 */   
    public int boardSave(JqBoardVO jqBoardVO) throws Exception {
    	
    	logger.debug("## JqBoardDao - boardSave");

    	return sqlSession.update(NAMESPACE + ".boardSave", jqBoardVO);
    }
    
    /**
	 * 댓글 저장(등록)
	 * @param
	 * @return
	 * @exception
	 * 
	 */   
    public int replySave(JqReplyVO jqReplyVO) throws Exception {
    	
    	logger.debug("## JqBoardDao - replySave");

    	return sqlSession.update(NAMESPACE + ".replySave", jqReplyVO);
    }
    
    /**
	 * 댓글 조회
	 * @param
	 * @return
	 * @exception
	 * 
	 */
    public List<JqReplyVO> replyInfo(JqReplyVO jqReplyVO) throws Exception {
    	
    	logger.debug("## JqBoardDao : replyInfo");
    	
        return sqlSession.selectList(NAMESPACE + ".replyInfo", jqReplyVO);
    }
    
    /**
 	 * 댓글 삭제
 	 * @param
 	 * @return
 	 * @exception
 	 * 
 	 */   
     public int replyDelete(JqReplyVO jqReplyVO) throws Exception {
     	
     	logger.debug("## JqBoardDao - replyDelete");

     	return sqlSession.update(NAMESPACE + ".replyDelete", jqReplyVO);
     }

}