import com.transtech.npk.model.AngularTree;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Test{
  public static List<AngularTree> getAngularTree(List<AngularTree> list){
    List<AngularTree> list2 = new ArrayList<AngularTree>();
    Map<Long, AngularTree> map = new HashMap<Long, AngularTree>();

    for (AngularTree child : list) {
      if(child.getParentId() != null && child.getParentId() > 0)
        map.get(child.getParentId()).getChildren().add(child);
      else 
        list2.add(child);
      map.put(child.getId(), child);
    }
    return list2;
  }

  public static void main( String args[] ) {
    AngularTree at;
    List<AngularTree> list = new ArrayList<AngularTree>();

    at = new AngularTree(1L,"Node1",false,new ArrayList<AngularTree>(),-1L); list.add(at);
    at = new AngularTree(2L,"Node2",false,new ArrayList<AngularTree>(),-1L); list.add(at);
    at = new AngularTree(3L,"Node3",false,new ArrayList<AngularTree>(),-1L); list.add(at);
    at = new AngularTree(4L,"Node4",false,new ArrayList<AngularTree>(),3L); list.add(at);
    at = new AngularTree(5L,"Node5",false,new ArrayList<AngularTree>(),3L); list.add(at);

    for (AngularTree child : getAngularTree(list)) {
      System.out.println(child);
    }

    //for (Map.Entry<Long, AngularTree> entry : map.entrySet()) {
    //    System.out.println(entry.getKey() + "/" + entry.getValue());
    //}
  }
}
