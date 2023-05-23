package cn.vo;

import lombok.Data;

@Data
public class Result<T> {
    private Integer code;//返回码，layui中0表示成功
    private String message;//返回描述
    private  T data;//返回数据
    private  long count;//分页查询的总记录数

}
