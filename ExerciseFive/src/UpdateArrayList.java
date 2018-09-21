import java.util.ArrayList;

public class UpdateArrayList {
    public ArrayList<String> updateArrayList(ArrayList<String> list,int firstIndex,String updatedValue1,int secondIndex,String updatedValue2){
        System.out.println("without updation: "+list);
        list.set(firstIndex,updatedValue1);
        list.set(secondIndex,updatedValue2);
        System.out.println("after updation: "+list);
        return list;
    }

    public ArrayList<String> emptyArrayList(ArrayList<String> list){
        list.clear();
        System.out.println(list);
        return list;
    }
}
