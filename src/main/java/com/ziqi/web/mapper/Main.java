package com.ziqi.web.mapper;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Map<String, Object>> additionList = new ArrayList<>();
        List<Map<String, Object>> allocationList = new ArrayList<>();
        List<Map<String, Object>> infoList = new ArrayList<>();

        // 假设additionList包含了一些Map
        Map<String, Object> map1 = new HashMap<>();
        map1.put("group", "A");
        map1.put("value", 10);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("group", "B");
        map2.put("value", 20);

        Map<String, Object> map3 = new HashMap<>();
        map3.put("group", "A");
        map3.put("value", 30);

        additionList.add(map1);
        additionList.add(map2);
        additionList.add(map3);

        Map<String, Object> map4 = new HashMap<>();
        map4.put("group", "A");
        map4.put("allocate", 40);

        Map<String, Object> map5 = new HashMap<>();
        map5.put("group", "B");
        map5.put("allocate", 20);

        Map<String, Object> map6 = new HashMap<>();
        map6.put("group", "A");
        map6.put("allocate", 30);

        allocationList.add(map4);
        allocationList.add(map5);
        allocationList.add(map6);


        // 将 additionList 中的元素按照 group 属性进行分类
        Map<Object, List<Map<String, Object>>> additionGroupedMap = additionList.stream()
                .collect(Collectors.groupingBy(m -> m.get("group")));

        // 将 allocationList 中的元素按照 group 属性进行分类
        Map<Object, List<Map<String, Object>>> allocationGroupedMap = allocationList.stream()
                .collect(Collectors.groupingBy(m -> m.get("group")));

        // 将分类好的元素存入 infoList
        for (Map.Entry<Object, List<Map<String, Object>>> entry : additionGroupedMap.entrySet()) {
            String group = (String) entry.getKey();
            List<Map<String, Object>> additionGroup = entry.getValue();

            List<Map<String, Object>> allocationGroup = allocationGroupedMap.getOrDefault(group, Collections.emptyList());

            Map<String, Object> groupInfo = new HashMap<>();
            groupInfo.put("group", group);
            groupInfo.put("additionList", additionGroup);
            groupInfo.put("allocationList", allocationGroup);

            infoList.add(groupInfo);
        }

        // 输出结果
        for (Map<String, Object> groupInfo : infoList) {
            System.out.println("Group: " + groupInfo.get("group"));
            System.out.println("Addition List: " + groupInfo.get("additionList"));
            System.out.println("Allocation List: " + groupInfo.get("allocationList"));
            System.out.println("---");
        }
    }
}

