package TransportWork3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnaliticTransport {
    private final List<Transport> transportsAnalytics = new ArrayList<>();


    public void addTransport(Transport transport) {
        transportsAnalytics.add(transport);
    }

    public List<Transport> filterByYear(int year) {
        List<Transport> filterByYear = new ArrayList<>();
        for (Transport tr : transportsAnalytics) {
            if (tr.getYear() <= year) {
                filterByYear.add(tr);
            }
        }
        return filterByYear;
    }

//    public List<Transport>findTop3Fastes(){
//        List<Transport>top3Fastes=new ArrayList<>();
//        int size=transportsAnalytics.size();
//        transportsAnalytics.sort(new TransportSpeedComparator());
//        if (transportsAnalytics.size()>=3){
//            top3Fastes.add(transportsAnalytics.get(size-1));
//            top3Fastes.add(transportsAnalytics.get(size-2));
//            top3Fastes.add(top3Fastes.get(size-3));
//        }
//        return top3Fastes;
//    }
//    public Set<String>unicumBrand(){
//        Set<String>unicumBrands=new HashSet<>();
//        for (Transport transport){
//
//        }
//    }

}
