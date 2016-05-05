package deal.controller.model;

/**
 * Created by Administrator on 2016/1/4.
 */
public class JobStructure {
  private int id;
  private String nodeId;
  private String parentId;
  private int isVisited;
  private String isType;
  private String jobname;

  public void setJobname(String jobname) {
    this.jobname = jobname;
  }



  public String getName() {
    return jobname;
  }



  public JobStructure(int id, String nodeId, String parentId, int isVisited,  String isType, String jobname) {
    this.id = id;
    this.nodeId = nodeId;
    this.parentId = parentId;
    this.isVisited = isVisited;
    this.isType = isType;
    this.jobname = jobname;
  }



  public JobStructure(int id, String nodeId, String parentId, int isVisited, String isType) {
    this.id = id;
    this.nodeId = nodeId;
    this.parentId = parentId;
    this.isVisited = isVisited;
    this.isType = isType;
  }

  public String getIsType() {
    return isType;
  }

  public void setIsType(String isType) {
    this.isType = isType;
  }


  public void setId(int id) {
    this.id = id;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public void setIsVisited(int isVisited) {
    this.isVisited = isVisited;
  }

  public int getId() {

    return id;
  }

  public String getNodeId() {
    return nodeId;
  }

  public int getIsVisited() {
    return isVisited;
  }

  public String getParentId() {
    return parentId;
  }

  public JobStructure(int id, String nodeId, String parentId, int isVisited) {

    this.id = id;
    this.nodeId = nodeId;
    this.parentId = parentId;
    this.isVisited = isVisited;
  }
  public JobStructure(){

  }
}
