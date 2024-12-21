package ua.cn.stu.univer03.debt;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("products")
public record Product(@Id Long id, String name, BigDecimal price) {
}
