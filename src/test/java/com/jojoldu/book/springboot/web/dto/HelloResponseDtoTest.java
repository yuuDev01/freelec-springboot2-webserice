package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
public class HelloResponseDtoTest {
    @Test
    public void 룸복_테스트(){
        //전송
        String name = "test";
        int amount = 1000;

        //언제
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
