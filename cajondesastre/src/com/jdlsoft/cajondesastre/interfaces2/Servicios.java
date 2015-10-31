package com.jdlsoft.cajondesastre.interfaces2;

public interface Servicios {
	public Albaran procesarPedido(Pedido pedido);
	public Factura generarFactura(Albaran albaran);
	public void deleteAlbaran(Albaran albaran);
	public void deletePedido(Pedido pedido);
	public void deleteFactura(Factura factura);
}
