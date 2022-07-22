package com.suraj.ds.datastructuresandalgorithms.mapproblems;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CharacterFrequencyTest {

    @Test
    void getCharacterFrequencyNonDuplicateTest() {
        Map<Character, Integer> actualResult = CharacterFrequency.getCharacterFrequency("suraj");

        Map<Character, Integer> expectedResult = new LinkedHashMap<>();
        expectedResult.put('s', 1);
        expectedResult.put('u', 1);
        expectedResult.put('r', 1);
        expectedResult.put('a', 1);
        expectedResult.put('j', 1);

        assertThat(actualResult).isNotEmpty().hasSize(expectedResult.size());
        assertThat(actualResult).containsExactlyEntriesOf(expectedResult);
    }

    @Test
    void getCharacterFrequencyDuplicateTest() {
        Map<Character, Integer> actualResult = CharacterFrequency.getCharacterFrequency("surajsu");

        Map<Character, Integer> expectedResult = new LinkedHashMap<>();
        expectedResult.put('s', 2);
        expectedResult.put('u', 2);
        expectedResult.put('r', 1);
        expectedResult.put('a', 1);
        expectedResult.put('j', 1);

        assertThat(actualResult).isNotEmpty().hasSize(expectedResult.size());
        assertThat(actualResult).containsExactlyEntriesOf(expectedResult);
    }

    @Test
    void getCharacterFrequencyNullTest() {

        assertThrows(IllegalArgumentException.class,
                () -> CharacterFrequency.getCharacterFrequency(null),
                "Input can not be null or empty"
        );

    }

    @Test
    void getCharacterFrequencyEmptyTest() {

        assertThrows(IllegalArgumentException.class,
                () -> CharacterFrequency.getCharacterFrequency(""),
                "Input can not be null or empty"
        );

    }
}