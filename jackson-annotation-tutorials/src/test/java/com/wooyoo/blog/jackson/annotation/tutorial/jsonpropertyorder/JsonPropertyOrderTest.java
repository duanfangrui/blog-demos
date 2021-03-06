package com.wooyoo.blog.jackson.annotation.tutorial.jsonpropertyorder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

public class JsonPropertyOrderTest {
    @Test
    public void whenSerializingUsingJsonPropertyOrder_thenCorrect()
            throws JsonProcessingException {

        MyBean bean = new MyBean(1, "My bean");

        String result = new ObjectMapper().writeValueAsString(bean);
        assertThat(result, containsString("My bean"));
        assertThat(result, containsString("1"));

        System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(bean));
    }
}