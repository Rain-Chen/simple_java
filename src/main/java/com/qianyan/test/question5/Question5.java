package com.qianyan.test.question5;

import java.util.*;

/**
 * Created with Intellij IDEA.
 * <p>Created by rainchen
 * User: rainchen
 * Date: 15-8-8
 * Time: 下午10:19.
 * Collection vs Collections
 * "Collection" and "Collections" are two different concepts.
 * As you will see from the hierarchy diagram below,
 * "Collection" is a root interface in the Collection hierarchy
 * but "Collections" is a class which provide static methods to manipulate on some Collection types.
 */
public class Question5 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Program");
        arrayList.add("Creek");
        arrayList.add("Java");
        arrayList.add("Java");
        System.out.println("ArrayList Elements");
        System.out.print("\t" + arrayList + "\n");

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("Program");
        linkedList.add("Creek");
        linkedList.add("Java");
        linkedList.add("Java");
        System.out.println("LinkedList Elements");
        System.out.print("\t" + linkedList + "\n");

        Set<String> hashSet = new HashSet<String>();// or new TreeSet() will order the elements;
        hashSet.add("Program");
        hashSet.add("Creek");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("tutorial");
        System.out.println("Set Elements");
        System.out.print("\t" + hashSet + "\n");

        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language", "Java");
        hashMap.put("Website", "programcreek.com");
        System.out.println("Map Elements");
        System.out.print("\t" + hashMap);

        /**
         * Convert a Map to List
         */
        List keyList = new ArrayList(hashMap.keySet());
        List valueList = new ArrayList(hashMap.values());
        List entryList = new ArrayList(hashMap.entrySet());
        System.out.println();
        System.out.println("The key List:" + keyList);
        System.out.println("The values List:" + valueList);
        System.out.println("The entry:" + entryList);

        /**
         * Iterate over each Entry in a Map
         */
        for (Map.Entry entry : hashMap.entrySet()) {
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("key:" + key + ",value:" + value);
        }
        //Iterator can also be used, especially before JDK 1.5
        Iterator itr = hashMap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            //get key
            String key = (String) entry.getKey();
            //get value
            String value = (String) entry.getValue();
            System.out.println("key:" + key + ",value:" + value);
        }
        //Sort a Map on the keys
        List list = new ArrayList(hashMap.entrySet());
        Collections.sort(list);
    }
}
