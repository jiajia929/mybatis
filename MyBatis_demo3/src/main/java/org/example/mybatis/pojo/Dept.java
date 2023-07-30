package org.example.mybatis.pojo;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Dept {

    private Integer did;

    private String deptName;

    private List<Emp> emps;
}
