package com.CodeWars;

import java.util.*;

public class MyLanguagesMAP {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        //решение без знаий про колекции
        Object[] key = results.keySet().toArray();
        Object[] value = results.values().toArray();
        String [] languages = new String[results.size()];
        for (int i = key.length-1; i >=0; i--) {
            languages[i]=(value[i]+" "+ key[i]);
        }
        Arrays.sort(languages);
        String [] temp = new  String[2];
        List<String > res = new ArrayList<>();
        for (int i = languages.length-1; i >=0; i--) {
            temp=languages[i].split(" ");
            if (Integer.parseInt(temp[0]) >=60){
                res.add(temp[1]);
            }
        }
        return res;
    }
    /** java 8
     * return results.entrySet()
     *                   .stream()
     *                   .filter( me -> me.getValue() >= 60 )
     *                   .sorted( (m1,m2) -> Integer.compare(m2.getValue(),m1.getValue()) )
     *                   .map( me -> me.getKey() )
     *                   .collect(Collectors.toList());
     */
}
