import com.transtech.npk.model.AngularTree;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Test{
  public static void main( String args[] ) {
    List<AngularTree> list = new ArrayList<AngularTree>();
    AngularTree at;
    Map<Long, AngularTree> map = new HashMap<Long, AngularTree>();

    at = new AngularTree(1,"Node1",false,new ArrayList<AngularTree>());
    list.add(at); map.put(at.getId(), at);
    at = new AngularTree(2,"Node2",false,new ArrayList<AngularTree>());
    list.add(at); map.put(at.getId(), at);
    at = new AngularTree(3,"Node3",false,new ArrayList<AngularTree>());
    list.add(at); map.put(at.getId(), at);

    at = new AngularTree(4,"Node4",false,new ArrayList<AngularTree>());
    map.get(3L).getChildren().add(at); map.put(at.getId(), at);
    at = new AngularTree(5,"Node5",false,new ArrayList<AngularTree>());
    map.get(3L).getChildren().add(at); map.put(at.getId(), at);

    for(int i = 0, len = list.size(); i < len; i++){
      System.out.println(list.get(i).toString());
    }

    System.out.println(map);
  }
}
