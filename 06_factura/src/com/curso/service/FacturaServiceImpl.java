package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FacturaServiceImpl implements FacturaService {

	@Autowired
	JdbcTemplate template;
	@Override
	public int descuentoProducto(String producto) {
		String sql="select descuento from descuentos where producto=?";
		List<Integer> descuentos=template.query(sql,
						(rs,f)->rs.getInt("descuento"),
						producto);
		return descuentos.size()>0?descuentos.get(0):0;
	}

}
