package com.sparkle.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName : BaseDto<br>
 * Description : BaseDto<br>
 *
 * @author : sj
 * @date : 2022-11-19
 */
@Getter
@Setter
@ToString
public class BaseDto {

    @JsonSerialize(using = ToStringSerializer.class)
    private Long timestamp;
}
