package deal.controller.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2016/1/4.
 */
public class JobRedisStructure {
  private int id;
  private String nodeId;
  private String parentNodeId;
  private String isType;
  private int isVisited;
  private Map<String,Set<Operation>> tableAccessInfo;

  public int getId() {
    return id;
  }

  public String getNodeId() {
    return nodeId;
  }

  public String getParentNodeId() {
    return parentNodeId;
  }

  public String getIsType() {
    return isType;
  }

  public int getIsVisited() {
    return isVisited;
  }

  public Map<String, Set<Operation>> getTableAccessInfo() {
    return tableAccessInfo;
  }

  public static class Builder {
    private int id = 0;
    private String nodeId = "";
    private String parentNodeId = "";
    private String isType = "A";
    private int isVisited = 0;
    private Map<String,Set<Operation>> tableAccessInfo = new HashMap<>();

    public Builder setId(int id) {
      this.id = id;
      return this;
    }

    public Builder setTableAccessInfo(Map<String, Set<Operation>> tableAccessInfo) {
      this.tableAccessInfo = tableAccessInfo;
      return this;
    }

    public Builder setIsVisited(int isVisited) {
      this.isVisited = isVisited;
      return this;
    }

    public Builder setIsType(String isType) {
      this.isType = isType;
      return this;
    }

    public Builder settParentNodeId(String parentNodeId) {
      this.parentNodeId = parentNodeId;
      return this;
    }

    public Builder setNodeId(String nodeId) {
      this.nodeId = nodeId;
      return this;
    }

    public JobRedisStructure build() { // 构建，返回一个新对象
      return new JobRedisStructure(this);
    }
  }

  private JobRedisStructure (Builder b) {
    id=b.id;
    nodeId = b.nodeId;
    parentNodeId = b.parentNodeId;
    isType = b.isType;
    isVisited = b.isVisited;
    tableAccessInfo=b.tableAccessInfo;

  }

}
