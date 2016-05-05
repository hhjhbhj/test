package deal.controller.service;


import deal.controller.dao.JobStructureDao;
import deal.controller.model.JobRedisStructure;
import deal.controller.model.JobStructure;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/1/4.
 */
@org.springframework.stereotype.Service
public class ServiceImp implements Service{
  @Resource
  private JobStructureDao jobStructureDao;
  @Override
  public List<JobStructure> list() {
    List<JobStructure> jobStructures=jobStructureDao.list();
    return  jobStructures;
  }

  @Override
  public List<JobRedisStructure> redisList() {
    return null;
  }
}
