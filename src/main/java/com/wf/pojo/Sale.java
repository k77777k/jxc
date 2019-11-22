package com.wf.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "sale")
public class Sale  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private java.math.BigDecimal price;

	private Integer quantity;

	@Column(name = "total_price")
	private java.math.BigDecimal totalPrice;

	@Column(name = "sale_date")
	private java.util.Date saleDate;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "product_id")
	private Integer productId;

}
