package fangfa.net.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: green
 * @version: 1.0
 * @Date: 2019/6/18/018
 * @description:
 */
@Data
public class Product implements Serializable {
    private static final long serialVersionUID = 4938700773590554810L;
    private Long id;
    private String name;
    private Integer age;
}
