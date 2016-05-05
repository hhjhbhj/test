package deal.controller.service;


import deal.controller.model.JobRedisStructure;
import deal.controller.model.JobStructure;

import java.util.List;

/**
 * Created by Administrator on 2016/1/4.
 */
public interface Service {
  public List<JobStructure> list();
  public List<JobRedisStructure> redisList();
}
