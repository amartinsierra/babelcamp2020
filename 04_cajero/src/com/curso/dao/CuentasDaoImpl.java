package com.curso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.curso.model.Cuenta;
import com.curso.model.Movimiento;

@Repository
public class CuentasDaoImpl implements CuentasDao{
	@PersistenceContext
	EntityManager em;

	@Override
	public List<Movimiento> movimientosCuenta(int numeroCuenta) {
		//join implicito: condición entidad del lado uno
		String jpql="Select m From Movimiento m where m.cuenta.numeroCuenta=?1";
		
		
	}

	@Override
	public List<Movimiento> movimientosCuenta(String tipoCuenta) {
		//join implicito: condición entidad del lado uno
		String jpql="Select m From Movimiento m where m.cuenta.tipocuenta=?1";
	}

	@Override
	public List<Cuenta> cuentasTipoMovimiento(String tipoMovimiento) {
		//join explícito: condición entidad de lado muchos
		String jpql="Select c From Cuenta c where c.movimientos join Movimiento m where m.operacion=?1";
		return null;
	}
	
}
