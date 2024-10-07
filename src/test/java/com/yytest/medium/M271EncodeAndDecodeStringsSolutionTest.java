package com.yytest.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class M271EncodeAndDecodeStringsSolutionTest {

    M271EncodeAndDecodeStringsSolution m271EncodeAndDecodeStringsSolution;

    @BeforeEach
    void setUp() {
        m271EncodeAndDecodeStringsSolution = new M271EncodeAndDecodeStringsSolution();
    }

    @Test
    void encode() {
//       List<String> input = Arrays.asList("neet","code","love","you");
//       List<String> input = Arrays.asList("1,23","45,6","7,8,9");
       List<String> input = Arrays.asList("we","say",":","yes","!@#$%^&*()");
//       List<String> input = Arrays.asList("");
        System.out.println(m271EncodeAndDecodeStringsSolution.encode(input));
    }

    @Test
    void decode() {
//        String input = "xoo~6myno6vy\u0080o6\u0083y\u007F";
        String input = "004lint004code004love003you";
//        String input = "!";
        List<String> result = m271EncodeAndDecodeStringsSolution.decode(input);
        result.forEach(System.out::println);
    }


}