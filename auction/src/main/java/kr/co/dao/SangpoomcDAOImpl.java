package kr.co.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.IpchalVO;
import kr.co.vo.SangpoomVO;
import kr.co.vo.SangpoomcVO;

@Repository
public class SangpoomcDAOImpl implements SangpoomcDAO{

	@Inject 
	private SqlSession sqlSession;
	
	
	//게시물 목록조회
	@Override
	public List<SangpoomcVO> list() throws Exception{
		return sqlSession.selectList("sangpoomcMapper.list");
	}//list end
	
	
	@Override
	public SangpoomcVO read(int sno) throws Exception {
		
		return sqlSession.selectOne("sangpoomcMapper.read",sno);
	}//read end


	@Override
	public void ipchal(IpchalVO ipchalvo)throws Exception {
		
	 sqlSession.insert("sangpoomcMapper.ipchalinsert",ipchalvo);
	}//ipchal end


	@Override
	public List<IpchalVO> ipchallist() throws Exception {
		
		return sqlSession.selectList("sangpoomcMapper.mypage");
	}
	
	
	
	
}
