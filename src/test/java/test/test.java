package test;

import deal.controller.model.JobStructure;
import deal.controller.service.ServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/1/4.
 */
@ContextConfiguration(locations = {"classpath:conf/spring.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class test {
  @Resource
  private ServiceImp serviceImp;


  @Test
  public void test() {
    List<JobStructure> jobStructureList = serviceImp.list();
    System.out.println(jobStructureList.get(0).getName());

  }
}
