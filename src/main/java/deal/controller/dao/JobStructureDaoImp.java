package deal.controller.dao;

import deal.controller.model.JobStructure;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/1/4.
 */
@SuppressWarnings({"ALL", "SpringJavaAutowiringInspection"})
@Repository
public class JobStructureDaoImp extends BaseDAO implements JobStructureDao{
  @SuppressWarnings("SpringJavaAutowiringInspection")
  @Resource
  private SqlSessionTemplate sqlSession;
  @Override
  public List<JobStructure> list() {
    return (List<JobStructure>) super.queryList("deal.controller.model.JobStructure.list", null);
  }

  @Override
  public SqlSessionTemplate getSqlSession() {
    return sqlSession;
  }
}
