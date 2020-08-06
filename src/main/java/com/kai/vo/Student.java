package com.kai.vo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Auther: Kai Wang
 * @Date: 2020/08/06
 * @Description:
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Student {

    private Integer id;
    private String name;
    private Integer age;
}
