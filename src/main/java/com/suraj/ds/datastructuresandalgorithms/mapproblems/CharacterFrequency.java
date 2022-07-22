package com.suraj.ds.datastructuresandalgorithms.mapproblems;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;

class CharacterFrequency {

    static Map<Character, Integer> getCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        if (StringUtils.isEmpty(input))
            throw new IllegalArgumentException("Input can not be null or empty");
        for (Character ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap;
    }
}
