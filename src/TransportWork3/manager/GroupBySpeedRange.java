package TransportWork3.manager;

import TransportWork3.SpeedType;
import TransportWork3.model.Transport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupBySpeedRange {

    private final Map<SpeedType, List<Transport>> groupBySpeedRangeEnum = new HashMap<>();

    public void addByEnum(Transport transport) {

        if (transport.getSpeed() < 100) {
            if (groupBySpeedRangeEnum.get(SpeedType.SLOW) == null) {
                ArrayList<Transport> list = new ArrayList<>();
                list.add(transport);
                groupBySpeedRangeEnum.put(SpeedType.SLOW, list);
            } else {
                groupBySpeedRangeEnum.get(SpeedType.SLOW).add(transport);
            }
        }

        if (transport.getSpeed() > 200) {
            if (groupBySpeedRangeEnum.get(SpeedType.FAST) == null) {
                ArrayList<Transport> list = new ArrayList<>();
                list.add(transport);
                groupBySpeedRangeEnum.put(SpeedType.FAST, list);
            } else {
                groupBySpeedRangeEnum.get(SpeedType.FAST).add(transport);
            }
        }
        if (transport.getSpeed() <= 100 && transport.getSpeed() <= 200) {
            if (groupBySpeedRangeEnum.get(SpeedType.MEDIUM) == null) {
                ArrayList<Transport> list = new ArrayList<>();
                list.add(transport);
                groupBySpeedRangeEnum.put(SpeedType.MEDIUM, list);
            } else {
                groupBySpeedRangeEnum.get(SpeedType.MEDIUM).add(transport);
            }
        }
    }

}
