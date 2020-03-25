package com.curso.dao;

import java.util.List;

import com.curso.model.Cuenta;
import com.curso.model.Movimiento;

public interface CuentasDao {
	List<Movimiento> movimientosCuenta(int numeroCuenta);
	List<Movimiento> movimientosCuenta(String tipoCuenta);
	List<Cuenta> cuentasTipoMovimiento(String tipoMovimiento);
	
	List<Cuenta> cuentasCliente(int idCliente);
}
